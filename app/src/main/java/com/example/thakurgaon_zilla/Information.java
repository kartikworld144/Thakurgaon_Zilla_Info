package com.example.thakurgaon_zilla;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class Information extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrayList = new ArrayList<>();
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);

        listView = findViewById(R.id.listView);
        ParseJSON();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("জেলার তথ্য");

        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        // don't forget click listener for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(arrow -> onBackPressed());
        //-------------------------------------------------------------------------------------------------


    }
     private void ParseJSON() {
        try {
            JSONArray jsonArray = new JSONArray(Utils.getFileData(this, "data/information.json"));

            for (int i = 0; i<jsonArray.length();i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                String description = jsonObject.getString("description");
                String title = jsonObject.getString("title");

                arrayList.add("\n\n" + title + "\n\n" +description + "\n");

            }


        } catch (JSONException e) {
            e.printStackTrace();
        }

         arrayAdapter = new ArrayAdapter<>(this,R.layout.list_black_text, R.id.list_content,arrayList);
         listView.setAdapter(arrayAdapter);

         listView.setOnItemClickListener((parent, view, position, id) -> {

             Intent intent = new Intent(Information.this, DetailActivity.class);
             //Toast.makeText(Information.this, "" + arrayList.get(position), Toast.LENGTH_SHORT).show();
             intent.putExtra("names", arrayAdapter.getItem(position));
             startActivity(intent);
         });
    }
}