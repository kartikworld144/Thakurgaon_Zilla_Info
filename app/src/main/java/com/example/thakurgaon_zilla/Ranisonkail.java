package com.example.thakurgaon_zilla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.HashMap;

    public class Ranisonkail extends AppCompatActivity {

        ImageView imageView,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9,imageView10,imageView11,imageView12,imageView13,imageView14;
        ListView listView;
        ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();
        HashMap <String,String>hashMap=new HashMap<>();
        public static String JSON = "";
        public static String ActionBar_Title = "";


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.ranisonkail);

            imageView = findViewById(R.id.imageView);
            imageView2 = findViewById(R.id.imageView2);
            imageView3 = findViewById(R.id.imageView3);
            imageView4 = findViewById(R.id.imageView4);
            imageView5 = findViewById(R.id.imageView5);
            imageView6 = findViewById(R.id.imageView6);
            imageView7 = findViewById(R.id.imageView7);
            imageView8 = findViewById(R.id.imageView8);
            imageView9 = findViewById(R.id.imageView9);
            imageView10 = findViewById(R.id.imageView10);
            imageView11 = findViewById(R.id.imageView11);
            imageView12 = findViewById(R.id.imageView12);
            imageView13 = findViewById(R.id.imageView13);
            imageView14 = findViewById(R.id.imageView14);

            listView = findViewById(R.id.listView);
            MyAdapter myAdapter = new MyAdapter();
            listView.setAdapter(myAdapter);
            ParseJSON();
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle(ActionBar_Title+" উপজেলার তথ্য");

            // add back arrow to toolbar
            if (getSupportActionBar() != null){
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                getSupportActionBar().setDisplayShowHomeEnabled(true);
            }
            // don't forget click listener for back button
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationOnClickListener(arrow -> onBackPressed());
            //-------------------------------------------------------------------------------------------------


            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Ranisonkail.JSON="data/ranisonkail.json";
                    Ranisonkail.ActionBar_Title="রাণীশংকৈল";
                    Toast.makeText(Ranisonkail.this, "Ranisonkail", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Ranisonkail.this, Ranisonkail.class));
                    finish();

                }
            });
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Ranisonkail.JSON="data/pirganj.json";
                    Ranisonkail.ActionBar_Title="পিরগঞ্জ";
                    Toast.makeText(Ranisonkail.this, "Pirganj", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Ranisonkail.this, Ranisonkail.class));
                    finish();

                }
            });
            imageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Ranisonkail.JSON="data/horipur.json";
                    Ranisonkail.ActionBar_Title="হরিপুর";
                    Toast.makeText(Ranisonkail.this, "Horipur", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Ranisonkail.this, Ranisonkail.class));
                    finish();

                }
            });
            imageView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Ranisonkail.JSON="data/baliyadangi.json";
                    Ranisonkail.ActionBar_Title="বালিয়াডাঙ্গী";
                    Toast.makeText(Ranisonkail.this, "Baliyadangi", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Ranisonkail.this, Ranisonkail.class));
                    finish();

                }
            });
            imageView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Ranisonkail.JSON="data/thakurgaon.json";
                    Ranisonkail.ActionBar_Title="ঠাকুরগাঁও";
                    Toast.makeText(Ranisonkail.this, "Thakurgaon", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Ranisonkail.this, Ranisonkail.class));
                    finish();

                }
            });

        }
        //********************************************
        //********************************************

        class MyAdapter extends BaseAdapter {

            @Override
            public int getCount() {
                return arrayList.size();
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {

                LayoutInflater layoutInflater = getLayoutInflater();
                View myView = layoutInflater.inflate(R.layout.ranisonkail_item, null);


                //********************************************

                TextView textTitle = myView.findViewById(R.id.textTitle);

                TextView textDescription = myView.findViewById(R.id.textDescription);

                TextView buttonDetails = myView.findViewById(R.id.buttonDetails);


                //********************************************
                HashMap<String, String> hashMap = arrayList.get(i);

                String title = hashMap.get("title");
                String description = hashMap.get("description");
                String more = hashMap.get("more");


                textTitle.setText(title);
                textDescription.setText(description);
                buttonDetails.setText(more);

                buttonDetails.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        JsonTextDetails.TITLE = title;
                        JsonTextDetails.DESCRIPTION=description;
                        startActivity(new Intent(Ranisonkail.this, JsonTextDetails.class));
                    }
                });


                return myView;
            }

        }

        //********************************************

        private void ParseJSON() {


            try {

                JSONArray jsonArray = new JSONArray(Utils.getFileData(this, ""+JSON));
                //Resources resources = this.getResources();

                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    String title = jsonObject.getString("title");
                    String description = jsonObject.getString("description");
                    String more = jsonObject.getString("more");



                    hashMap = new HashMap<>();
                    hashMap.put("title", title);
                    hashMap.put("description", description);
                    hashMap.put("more", more);
                    arrayList.add(hashMap);


                }


            } catch (JSONException e) {
                e.printStackTrace();
            }
            MyAdapter myAdapter = new MyAdapter();
            listView.setAdapter(myAdapter);

        }



    }