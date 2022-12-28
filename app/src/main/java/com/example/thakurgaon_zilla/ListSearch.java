package com.example.thakurgaon_zilla;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;


public class ListSearch extends AppCompatActivity {

    FloatingActionButton floatingActionButton,floatingActionButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_search);
        floatingActionButton=findViewById(R.id.floatingactionbutton);
        floatingActionButton2=findViewById(R.id.floatingactionbutton2);


        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ListSearch.this, "good", Toast.LENGTH_SHORT).show();
            }
        });
        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ListSearch.this, "nice", Toast.LENGTH_SHORT).show();
            }
        });


    }



}