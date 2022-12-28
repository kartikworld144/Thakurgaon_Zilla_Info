package com.example.thakurgaon_zilla;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.getbase.floatingactionbutton.FloatingActionButton;

import java.util.Random;

public class JsonTextDetails extends AppCompatActivity {

    TextView textTitle, textDes;
    //ImageButton imageButton;
    FloatingActionButton floatingActionButton, floatingActionButton2,floatingActionButton3;
    TextToSpeech textToSpeech;

    public static String TITLE = "";
    public static String DESCRIPTION = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ranisonkail_text_details);

        textTitle = findViewById(R.id.textTitle);
        textDes = findViewById(R.id.textDes);
        //imageButton = findViewById(R.id.imageButton);
        floatingActionButton = findViewById(R.id.floatingActionButton);
        floatingActionButton2 = findViewById(R.id.floatingActionButton2);
        floatingActionButton3 = findViewById(R.id.floatingActionButton3);


        //******************************************************************************************
        textToSpeech = new TextToSpeech(JsonTextDetails.this, status -> {
            if (status == TextToSpeech.SUCCESS) {

                    floatingActionButton.setEnabled(true);
                    floatingActionButton2.setEnabled(true);
                    textToSpeech.setPitch(1.0f);
                    textToSpeech.setSpeechRate(1.0f);
                }


        });
        //******************************************************************************************


        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // add toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.district);

        // add back arrow to toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        // don't forget click listener for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(arrow -> onBackPressed());
        //------------------------------------------------------------------------------------------


        //******************************************************************************************
        textTitle.setText(TITLE);
        textDes.setText(DESCRIPTION);
        //******************************************************************************************


        //******************************************************************************************
        Random rnd = new Random();
        int color2 = Color.argb(180, rnd.nextInt(100), rnd.nextInt(105), rnd.nextInt(110));
        textTitle.setBackgroundColor(color2);
        //******************************************************************************************


        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        floatingActionButton.setOnClickListener(v -> {
            onPause();
            floatingActionButton.setEnabled(false);
            floatingActionButton2.setEnabled(true);
            Toast.makeText(getBaseContext(), "স্পিকার বন্ধ হয়েছে", Toast.LENGTH_SHORT).show();

        });

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        floatingActionButton2.setOnClickListener(v -> {
            speak();
            floatingActionButton.setEnabled(true);
            floatingActionButton2.setEnabled(false);
            //Toast.makeText(getBaseContext(), "স্পিকার চালু হয়েছে", Toast.LENGTH_SHORT).show();

        });
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        //******************************************************************************************
        floatingActionButton3.setOnClickListener(v -> {
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newPlainText("TextView",textDes.getText().toString());
            assert clipboardManager!=null;
            clipboardManager.setPrimaryClip(clipData);
            Toast.makeText(getBaseContext(), "লেখাগুলো অনুলিপি হয়েছে", Toast.LENGTH_SHORT).show();
            floatingActionButton3.setVisibility(View.GONE);
        });

        /*
        imageButton.setOnTouchListener(new View.OnTouchListener(){

            @Override
            public boolean onTouch(View v, MotionEvent event) {

                // TODO Auto-generated method stub
                switch(event.getAction()){
                    case MotionEvent.ACTION_MOVE:
                        RelativeLayout.LayoutParams relativeLayout=(RelativeLayout.LayoutParams) imageButton.getLayoutParams();
                        int x=(int)event.getRawX();
                        int y=(int)event.getRawY();
                        relativeLayout.leftMargin=x-50;
                        relativeLayout.rightMargin=x-50;
                        relativeLayout.topMargin=y-50;
                        relativeLayout.bottomMargin=y-50;
                        imageButton.setLayoutParams(relativeLayout);
                        break;
                        default:
                        break;
                }
                return true;

            }

        });

         */
        //******************************************************************************************

    }

    private void speak() {

        String text = textDes.getText().toString();
        if (text.length() < 4000) {
            textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null, null);
            Toast.makeText(getBaseContext(), "স্পিকার চালু হয়েছে", Toast.LENGTH_SHORT).show();

        } else {
            floatingActionButton.setVisibility(View.GONE);
            floatingActionButton2.setVisibility(View.GONE);
            Toast.makeText(getApplicationContext(), "দীর্ঘ টেক্সট পড়া সমর্থন করে না", Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    protected void onDestroy() {

        if (textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub

        if (textToSpeech != null) {

            textToSpeech.stop();

        }
        super.onPause();
    }


}