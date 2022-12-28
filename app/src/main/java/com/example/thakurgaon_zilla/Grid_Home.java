    package com.example.thakurgaon_zilla;
    import android.content.Context;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.ImageView;
        import android.widget.LinearLayout;
        import android.widget.TextView;
        import androidx.appcompat.app.AppCompatActivity;

        import java.util.HashMap;

    public class Grid_Home extends AppCompatActivity {

    public static int CategoryClicked = -10;
    ExpandableHeightGridView mainGrid;
    Intent targetActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_home);
        mainGrid = findViewById(R.id.mainGrid);



        MakeNewList.createMyAlbums();

        MyAdapter adapter = new MyAdapter();
        mainGrid.setExpanded(true);
        mainGrid.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private class MyAdapter extends BaseAdapter {
        private LayoutInflater inflater;

        public  MyAdapter(){
            this.inflater = (LayoutInflater)
                    Grid_Home.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return MakeNewList.arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            convertView = inflater.inflate(R.layout.grid_item, parent, false);


            ImageView imgIcon = convertView.findViewById(R.id.imgIcon);
            TextView tvTitle = convertView.findViewById(R.id.tvTitle);
            LinearLayout layItem = convertView.findViewById(R.id.layItem);

            HashMap<String, String> mHashMap = MakeNewList.arrayList.get(position);
            String catName = mHashMap.get("category_name");
            String img = mHashMap.get("img");


            if (tvTitle!=null) tvTitle.setText(catName);
            if (imgIcon!=null && img!=null) {
                int drawable = Integer.parseInt(img);
                imgIcon.setImageResource( drawable );
            }


            if (layItem!=null){
                layItem.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                        if (catName != null && catName.contains("Information")) {
                            targetActivity = new Intent(Grid_Home.this, Information.class);
                            startActivity(targetActivity);

                        }
                        //----------------------------------------------------------------

                        else if (catName != null && catName.contains("Input")) {
                            targetActivity = new Intent(Grid_Home.this, NameMobileEmail.class);
                            startActivity(targetActivity);

                        }
                        //----------------------------------------------------------------

                        else if (catName != null && catName.contains("ঠাকুরগাঁওয়ের নাম্বারসমূহ")) {
                            targetActivity = new Intent(Grid_Home.this, Urgent_Number.class);
                            startActivity(targetActivity);
                        }
                        //----------------------------------------------------------------
                        else if (catName != null && catName.contains("পিরগঞ্জের নাম্বারসমূহ")) {
                            targetActivity = new Intent(Grid_Home.this, Urgent_Number_Pirganj.class);
                            startActivity(targetActivity);
                        }
                        //----------------------------------------------------------------
                        else if (catName != null && catName.contains("রানিশংকৈলের নাম্বারসমূহ")) {
                            targetActivity = new Intent(Grid_Home.this, Urgent_Number_Ranisonkail.class);
                            startActivity(targetActivity);
                        }
                        //----------------------------------------------------------------

                        else if (catName != null && catName.contains("বালিয়াডাঙ্গীর নাম্বারসমূহ")) {
                            targetActivity = new Intent(Grid_Home.this, Urgent_Number_Baliyadangi.class);
                            startActivity(targetActivity);
                        }
                        //----------------------------------------------------------------
                        else if (catName != null && catName.contains("হরিপুরের নাম্বারসমূহ")) {
                            targetActivity = new Intent(Grid_Home.this, Urgent_Number_Horipur.class);
                            startActivity(targetActivity);
                        }
                        //----------------------------------------------------------------


                        else if (catName != null && catName.contains("Thakurgaon")) {
                            Ranisonkail.JSON="data/thakurgaon.json";
                            Ranisonkail.ActionBar_Title="ঠাকুরগাঁও";
                            targetActivity = new Intent(Grid_Home.this, Ranisonkail.class);
                            startActivity(targetActivity);

                        }
                        //----------------------------------------------------------------
                        else if (catName != null && catName.contains("Ranisonkail")) {
                            Ranisonkail.JSON="data/ranisonkail.json";
                            Ranisonkail.ActionBar_Title="রাণীশংকৈল";
                            targetActivity = new Intent(Grid_Home.this, Ranisonkail.class);
                            startActivity(targetActivity);
                        }
                        //----------------------------------------------------------------
                        //----------------------------------------------------------------
                        else if (catName != null && catName.contains("Pirganj")) {
                            Ranisonkail.JSON="data/pirganj.json";
                            Ranisonkail.ActionBar_Title="পিরগঞ্জ";
                            targetActivity = new Intent(Grid_Home.this, Ranisonkail.class);
                            startActivity(targetActivity);

                        }
                        //----------------------------------------------------------------
                        //----------------------------------------------------------------
                        else if (catName != null && catName.contains("Baliyadangi")) {
                            Ranisonkail.JSON="data/baliyadangi.json";
                            Ranisonkail.ActionBar_Title="বালিয়াডাঙ্গী";
                            targetActivity = new Intent(Grid_Home.this, Ranisonkail.class);
                            startActivity(targetActivity);

                        }
                        //----------------------------------------------------------------
                        //----------------------------------------------------------------
                        else if (catName != null && catName.contains("Horipur")) {
                            Ranisonkail.JSON="data/horipur.json";
                            Ranisonkail.ActionBar_Title="হরিপুর";
                            targetActivity = new Intent(Grid_Home.this, Ranisonkail.class);
                            startActivity(targetActivity);

                        }
                        //----------------------------------------------------------------
                        //----------------------------------------------------------------
                        else if (catName != null && catName.contains("ListSearch")) {
                            targetActivity = new Intent(Grid_Home.this, ListSearch.class);
                            startActivity(targetActivity);

                        }
                        //----------------------------------------------------------------

                        else {
                            targetActivity = new Intent(Grid_Home.this, TextDetails.class);
                            startActivity(targetActivity);
                        }
                    }
                });
            }



            return convertView;
        }
    }



}