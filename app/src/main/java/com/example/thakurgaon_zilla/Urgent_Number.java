package com.example.thakurgaon_zilla;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;

import com.airbnb.lottie.LottieAnimationView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Urgent_Number extends AppCompatActivity {

    ListView listView;
    ArrayList<HashMap<String,String> >arrayList=new ArrayList<>();
    HashMap <String,String>hashMap=new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.urgent_number_list);

        listView = findViewById(R.id.listView);
        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);


        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // add toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("ঠাকুরগাঁওয়ের নাম্বারসমূহ");

        // add back arrow to toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        // don't forget click listener for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(arrow -> onBackPressed());
        //-------------------------------------------------------------------------------------------------


        //*******************************************************************

        hashMap = new HashMap<>();
        hashMap.put("name", "এ্যাড. অরুনাংশু দত্ত টিটো");
        hashMap.put("title", "উপজেলা চেয়ারম্যান \nফোন (অফিস) : 0561-52408 \nস্থায়ী ঠিকানা : আশ্রম পাড়া, ঠাকুরগাঁও সদর\nসর্বশেষ শিক্ষাগত যোগ্যতা : বিএসসি/বিএ/বিকম/বিএসএস/সমমান");
        hashMap.put("des", "01714383630");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মো: আব্দুর রশিদ");
        hashMap.put("title", "উপজেলা ভাইস চেয়ারম্যান \nস্থায়ী ঠিকানা : ঠাকুরগাঁও সদর\nসর্বশেষ শিক্ষাগত যোগ্যতা : বিএসসি/বিএ/বিকম/বিএসএস/সমমান");
        hashMap.put("des", "01722091902");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মাহহুরা বেগম হুরা");
        hashMap.put("title", "উপজেলা মহিলা ভাইস চেয়ারম্যান\nস্থায়ী ঠিকানা : বিসিক, ঠাকুরগাও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : বিএসসি/বিএ/বিকম/বিএসএস/সমমান");
        hashMap.put("des", "01716920439");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        //********************************************

        hashMap.put("name", "মো: মনিরুল হক");
        hashMap.put("title", "১নং রুহিয়া ইউনিয়ন\nরুহিয়া ইউপি চেয়ারম্যান\nওয়ার্ড নং :৭\nনিজ জেলা : ঠাকুরগাঁও।\nস্থায়ী ঠিকানা : গ্রাম: ঘনিবিষ্ণুপুর, ডাকঘর: রুহিয়া , থানা: রুহিয়া, উপজেলা ও জেলা: ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : মাস্টার্স/সমমান");
        hashMap.put("des", "০১৭২০০৬৬৬৭৬");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোঃ জয়নাল আবেদীন");
        hashMap.put("title", "রুহিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :১\nসর্বশেষ শিক্ষাগত যোগ্যতা : মাস্টার্স/সমমান");
        hashMap.put("des", "01710738679");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোঃ তাহেরুল ইসলাম");
        hashMap.put("title", "রুহিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :২\nসর্বশেষ শিক্ষাগত যোগ্যতা : বিএসসি/বিএ/বিকম/বিএসএস/সমমান");
        hashMap.put("des", "01735025374");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোঃ আনোয়ার হোসেন");
        hashMap.put("title", "১নং রুহিয়া ইউনিয়ন\nরুহিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :৩\nসর্বশেষ শিক্ষাগত যোগ্যতা : বিএসসি/বিএ/বিকম/বিএসএস/সমমান");
        hashMap.put("des", "01761027179");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোঃ শফিকুল ইসলাম");
        hashMap.put("title", "রুহিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :৪\nসর্বশেষ শিক্ষাগত যোগ্যতা : অজানা");
        hashMap.put("des", "01743910535");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোঃ আবুল কালাম আজাদ");
        hashMap.put("title", "রুহিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :৫\nসর্বশেষ শিক্ষাগত যোগ্যতা : অজানা");
        hashMap.put("des", "01793329010");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোঃ সোহাগ");
        hashMap.put("title", "রুহিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :৬\nসর্বশেষ শিক্ষাগত যোগ্যতা : বিএসসি/বিএ/বিকম/বিএসএস/সমমান");
        hashMap.put("des", "01723339871");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোঃ মইনুল হক");
        hashMap.put("title", "রুহিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :৭\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "01746099121");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোঃ ইউসুব আলী");
        hashMap.put("title", "রুহিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :৮\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "01727345043");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোছাঃ রেবেকা সুলতানা");
        hashMap.put("title", "রুহিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :সংরক্ষিত ১ নং\nসর্বশেষ শিক্ষাগত যোগ্যতা : বিএসসি/বিএ/বিকম/বিএসএস/সমমান");
        hashMap.put("des", "01740076233");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোছাঃ রিম্পা আক্তার রিপন");
        hashMap.put("title", "রুহিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :সংরক্ষিত ২ নং\nসর্বশেষ শিক্ষাগত যোগ্যতা : এসএসসি/সমমান");
        hashMap.put("des", "01738036499");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();


        hashMap.put("name", "হুনুফা বেগম");
        hashMap.put("title", "রুহিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :সংরক্ষিত ৩ নং\nস্থায়ী ঠিকানা : রুহিয়া, ঠাকুরগাঁও\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "01787963146");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        //********************************************

        hashMap.put("name", "মো: রোমান বাদশাহ্");
        hashMap.put("title", "আখানগর ইউপি চেয়ারম্যান\nস্থায়ী ঠিকানা : গ্রাম:আখানগর ডাকঘর: মধ্যঝাড়গাঁও, উপজেলা ও জেলা: ঠাকুরগাঁও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : বিএসসি/বিএ/বিকম/বিএসএস/সমমান");
        hashMap.put("des", "01714625646");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোঃ মোকসেদ আলী");
        hashMap.put("title", "আখানগর ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :১\nস্থায়ী ঠিকানা : গ্রাম: মহেশপুর, ডাকঘর: মধ্যঝাড়গাঁও উপজেলা ও জেলা: ঠাকুরগাঁও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এইচএসসি/সমমান");
        hashMap.put("des", "01751026437");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মো: আব্দুল বাসেদ");
        hashMap.put("title", "আখানগর ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :2\nস্থায়ী ঠিকানা : গ্রাম: ফেলানপুর ডাকঘর: মধ্যঝাড়গাঁও । উপজেলা ও জেলা: ঠাকুরগাঁও । মধ্যঝাড়গাঁও\nসর্বশেষ শিক্ষাগত যোগ্যতা : এসএসসি/সমমান");
        hashMap.put("des", "০১৭২৫৩৮৭০৬");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মো: মামুন রশিদী");
        hashMap.put("title", "আখানগর ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :3\nস্থায়ী ঠিকানা : গ্রাম: উত্তর ঝাড়গাঁও উপজেলা ও জেলা: ঠাকুরগাঁও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এসএসসি/সমমান");
        hashMap.put("des", "০১৭২২৪১৫৬৮৫");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মো: একরামুল হক");
        hashMap.put("title", "আখানগর ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :4\nস্থায়ী ঠিকানা : গ্রাম: ঝাড়গাঁও ডাকঘর: মধ্যঝাড়গাঁও উপজেলা ও জেলা: ঠাকুরগাঁও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "01785416749");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোঃ হুমায়ুন কবীর");
        hashMap.put("title", "আখানগর ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :5\nস্থায়ী ঠিকানা : গ্রাম: ঝাড়গাঁও ডাকঘর: মধ্যঝাড়গাঁও উপজেলা ও জেলা: ঠাকুরগাঁও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এইচএসসি/সমমান");
        hashMap.put("des", "01722601034");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মো:আশরাফুর হক");
        hashMap.put("title", "আখানগর ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :6\nস্থায়ী ঠিকানা : গ্রাম: আখানগর ডাকঘর: আখানগর উপজেলা ও জেলা: ঠাকুরগাঁও সদর\nসর্বশেষ শিক্ষাগত যোগ্যতা : এসএসসি/সমমান");
        hashMap.put("des", "০১৭২২৪১৫৭১০");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোঃ মনোয়ার মোর্শেদ (লালু)");
        hashMap.put("title", "আখানগর ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :7\nস্থায়ী ঠিকানা : গ্রাম: আখানগর ডাকঘর:আখানগর উপজেলা ও জেলা: ঠাকুরগাঁও\nসর্বশেষ শিক্ষাগত যোগ্যতা : এসএসসি/সমমান");
        hashMap.put("des", "01718278589");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোঃ আতাউর রহমান");
        hashMap.put("title", "আখানগর ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :8\nস্থায়ী ঠিকানা : গ্রাম: আখানগর ডাকঘর: আখানগর উপজেলা ও জেলা: ঠাকুরগাঁও সদর\nসর্বশেষ শিক্ষাগত যোগ্যতা : এইচএসসি/সমমান");
        hashMap.put("des", "01752066733");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মো: জনি পারভেজ");
        hashMap.put("title", "আখানগর ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :9\nস্থায়ী ঠিকানা : গ্রাম: চতুরাখোর ডাকঘর: আখানগর উপজেলা ও জেলা: ঠাকুরগাঁও সদর\nসর্বশেষ শিক্ষাগত যোগ্যতা : এইচএসসি/সমমান");
        hashMap.put("des", "০১৭৫০২৮৭৯৪১");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোছাঃ রুপালী খাতুন");
        hashMap.put("title", "আখানগর ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :1,2,3\nসর্বশেষ শিক্ষাগত যোগ্যতা : এসএসসি/সমমান");
        hashMap.put("des", "01740076233");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোছাঃ আলেফা বেগম");
        hashMap.put("title", "আখানগর ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :4,5,6\nস্থায়ী ঠিকানা : গ্রাম:আখানগর ডাকঘর: মধ্যঝাড়গাঁও উপজেলা ও জেলা: ঠাকুরগাঁও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এসএসসি/সমমান");
        hashMap.put("des", "01738687152");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোছাঃ রাবী আক্তার");
        hashMap.put("title", "আখানগর ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :7,8,9\nস্থায়ী ঠিকানা : উপজেলা ও জেলা: ঠাকুরগাঁও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এসএসসি/সমমান");
        hashMap.put("des", "01767177068");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        //********************************************
        hashMap.put("name", "সুব্রত কুমার বর্মন");
        hashMap.put("title", "আকচা ইউপি চেয়ারম্যান\nস্থায়ী ঠিকানা : গ্রাম: দক্ষিণ বঠিনা ,ডাকঘর:ফাড়াবাড়ী, উপজেলা : ঠাকুরগাঁও সদর , জেলা : ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এইচএসসি/সমমান");
        hashMap.put("des", "01712314258");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "নয়ন চন্দ্র রায়");
        hashMap.put("title", "আকচা ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :১\nস্থায়ী ঠিকানা : গ্রাম: উত্তর ঠাকুরগাঁও ,ডাকঘর: ঢোলার হাট , উপজেলা : ঠাকুরগাঁও সদর , জেলা : ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "01797840016");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মো: বাবলু রহমান");
        hashMap.put("title", "আকচা ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :2\nস্থায়ী ঠিকানা : গ্রাম: উত্তর ঠাকুরগাঁও ,ডাকঘর: ঢোলার হাট , উপজেলা ও জেলা : ঠাকুরগাঁও\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "0171781180");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "সন্তুষ কুমার রায় (বালু)");
        hashMap.put("title", "আকচা ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :3\nস্থায়ী ঠিকানা : গ্রাম: দক্ষিণ বঠিনা ,ডাকঘর: ফাড়াবাড়ী , উপজেলা ও জেলা : ঠাকুরগাঁও।।\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "01799183681");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "কামিনি চন্দ্র রায়");
        hashMap.put("title", "আকচা ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :4\nস্থায়ী ঠিকানা : গ্রাম: দক্ষিণ বঠিনা , ডাকঘর: ফাড়াবাড়ী , উপজেলা ও জেলা : ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এসএসসি/সমমান");
        hashMap.put("des", "01722733243");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "বিজয় চন্দ্র রায়");
        hashMap.put("title", "আকচা ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :5\nস্থায়ী ঠিকানা :  গ্রাম: দক্ষিণ বঠিনা , ডাকঘর: ফাড়াবাড়ী , উপজেলা ও জেলা : ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এসএসসি/সমমান");
        hashMap.put("des", "01754972157");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোঃ শামিম");
        hashMap.put("title", "আকচা ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :6\nস্থায়ী ঠিকানা : গ্রাম: কশালবাড়ী ,ডাকঘর: ফাড়াবাড়ী , উপজেলা ও জেলা : ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "01744566188");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "নিরব চন্দ্র পাল");
        hashMap.put("title", "আকচা ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :7\nস্থায়ী ঠিকানা : গ্রাম: দক্ষিণ ঠাকুরগাঁও ,ডাকঘর:ঢোলার হাট , উপজেলা ও জেলা : ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "01737564803");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মো: সাদেকুল ইসলাম");
        hashMap.put("title", "আকচা ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :8\nস্থায়ী ঠিকানা : গ্রাম: দক্ষিণ ঠাকুরগাঁও ,ডাকঘর:ঢোলার হাট , উপজেলা ও জেলা : ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "01748066357");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "কুলু রাম রায়");
        hashMap.put("title", "আকচা ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :9\nস্থায়ী ঠিকানা : আক্চা\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "01723587100");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "সিমলা রায়");
        hashMap.put("title", "আকচা ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :1,2,3\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "01714624338");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোছাঃ সানোয়ারা বেগম");
        hashMap.put("title", "আকচা ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :4,5,6\nস্থায়ী ঠিকানা : গ্রাম:দক্ষিণ বঠিনা।\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "0131882559");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();


        hashMap.put("name", "মোছাঃ ফুলজান");
        hashMap.put("title", "আকচা ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :7,8,9\nস্থায়ী ঠিকানা : দক্ষিন ঠাকুরগাঁও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "01770874148");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        //********************************************
        hashMap.put("name", "মোঃ ফয়জুর রহমান");
        hashMap.put("title", "বড়গাঁও ইউপি চেয়ারম্যান\nস্থায়ী ঠিকানা : ৪নং বড়গাঁও ইউনিয়ন পরিষদ,ঠাকুরগাঁও সদর, জেলা : ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : মাস্টার্স/সমমান");
        hashMap.put("des", "01719794999");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "রমনী চন্দ্র দেব নাথ");
        hashMap.put("title", "বড়গাঁও ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :১\nস্থায়ী ঠিকানা : গ্রামঃ কেশুরবাড়ী, ডাকঘর- কে, কে বাড়ী, ইউপি বড়গাঁও, উপজেলা ও জেলা : ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এইচএসসি/সমমান");
        hashMap.put("des", "01732892316");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোঃ মাজেদুল খাঁন");
        hashMap.put("title", "বড়গাঁও ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :2\nস্থায়ী ঠিকানা : মোঃ মাজেদুল খাঁন. ইউ,পি সদস্য , গ্রামঃ ক্ষেনপাড়া, ডাকঘর- কে, কে বাড়ী, ইউপি বড়গাঁও, উপজেলা ও জেলা : ঠাকুরগাঁও\nসর্বশেষ শিক্ষাগত যোগ্যতা : এইচএসসি/সমমান");
        hashMap.put("des", "01737162250");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোঃ রবিউল আলম");
        hashMap.put("title", "বড়গাঁও ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :3\nস্থায়ী ঠিকানা : গ্রামঃ উত্তর ক্ষেনপাড়া, ডাকঘর- কে, কে বাড়ী, ইউপি বড়গাঁও, উপজেলা ও জেলা : ঠাকুরগাঁও।।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এসএসসি/সমমান");
        hashMap.put("des", "01747025430");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মো: আরিফুজ্জামান ইদু");
        hashMap.put("title", "বড়গাঁও ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :4\nস্থায়ী ঠিকানা : গ্রামঃ কিসমত কেশুরবাড়ী , ডাকঘর- কে, কে বাড়ী, ইউপি বড়গাঁও, উপজেলা ও জেলা : ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এইচএসসি/সমমান");
        hashMap.put("des", "01794978125");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মো: রশিদুল ইসলাম");
        hashMap.put("title", "বড়গাঁও ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :5\nস্থায়ী ঠিকানা : গ্রামঃ কিসমত কেশুরবাড়ী, ডাকঘর- কে, কে বাড়ী, ইউপি বড়গাঁও, উপজেলা ও জেলা : ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "01713734870");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "লালন দেবনাথ");
        hashMap.put("title", "বড়গাঁও ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :6\nস্থায়ী ঠিকানা : গ্রামঃ জালালী, ডাকঘর- বড়গাঁও, ইউপি বড়গাঁও, উপজেলা ও জেলা: ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এইচএসসি/সমমান");
        hashMap.put("des", "01736742542");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "শতিশ কুমার বর্মন");
        hashMap.put("title", "বড়গাঁও ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :7\nস্থায়ী ঠিকানা : গগ্রামঃ জালালী/জাহানপাড়া, ডাকঘর- বড়গাঁও, ইউপি বড়গাঁও, উপজেলা ও জেলা : ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : no");
        hashMap.put("des", "01722159331");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মির্জা তায়েবুজ্জামান");
        hashMap.put("title", "বড়গাঁও ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :8\nস্থায়ী ঠিকানা : গ্রামঃ বড়গাঁও, ডাকঘর-বড়গাঁও, ইউপি বড়গাঁও, উপজেলা ও জেলা : ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : বিএসসি ইঞ্জিনিয়ারিং");
        hashMap.put("des", "01761177317");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোছাঃ হোসনেয়ারা বেগম");
        hashMap.put("title", "বড়গাঁও ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :1,2,3\nস্থায়ী ঠিকানা : আক্চা\nসর্বশেষ শিক্ষাগত যোগ্যতা : এসএসসি/সমমান");
        hashMap.put("des", "01773082095");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোছা: রুনা লায়লা");
        hashMap.put("title", "বড়গাঁও ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :4,5,6\nস্থায়ী ঠিকানা : গ্রামঃ কিসমত কেশুরবাড়ী , ডাকঘর- কে, কে বাড়ী, ইউপি বড়গাঁও, উপজেলা ও জেলা : ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এসএসসি/সমমান");
        hashMap.put("des", "01322602335");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোছা: রাব্বি বেগম");
        hashMap.put("title", "বড়গাঁও ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :7,8,9\nস্থায়ী ঠিকানা : গ্রামঃ বড়গাঁও, ডাকঘর- বড়গাঁও, ইউপি বড়গাঁও, উপজেলা ও জেলা:  ঠাকুরগাঁও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এসএসসি/সমমান");
        hashMap.put("des", "01719070929");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        //********************************************
        hashMap.put("name", "মোঃ জুলফিকার আলী ভুট্টো");
        hashMap.put("title", "৫ নং বালিয়া ইউপি চেয়ারম্যান\nস্থায়ী ঠিকানা : গ্রাম: ছোটবালিয়া,ডাকঘর বালিয়া ঠাকুরগাঁও সদর,ঠাকুরগাঁও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : বিএসসি/বিএ/বিকম/বিএসএস/সমমান");
        hashMap.put("des", "01716008088");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মো:আইয়ুব আলী");
        hashMap.put("title", "৫ নং বালিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :১\nস্থায়ী ঠিকানা : গ্রামঃ বড়বালিয়া,১ নং ওয়ার্ড ঠাকুরগাঁও সদর,ঠাকুরগাঁও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "01788994501");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মো:আব্দুল মজিদ");
        hashMap.put("title", "৫ নং বালিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :2\nস্থায়ী ঠিকানা : গ্রামঃ কুমারপুর,ওয়ার্ড নং-২ ঠাকুরগাঁও সদর ঠাকুরগাঁও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "01717388725");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মো:কালাচান শেখ");
        hashMap.put("title", "৫ নং বালিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :3\nস্থায়ী ঠিকানা : গ্রামঃ বড়বালিয়া,ওয়ার্ড নং-৩ ঠাকুরগাঁও সদর ঠাকুরগাঁও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "01734176100");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মো:আনোয়ার হোসেন");
        hashMap.put("title", "৫ নং বালিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :4\nস্থায়ী ঠিকানা : গ্রামঃ বগুলাডাংগী,ওয়ার্ড নং-৪ ঠাকুরগাঁও সদর ঠাকুরগাঁও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এইচএসসি/সমমান");
        hashMap.put("des", "01713707812");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মো:নুরনবী");
        hashMap.put("title", "৫ নং বালিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :5\nস্থায়ী ঠিকানা : গ্রাম:বগুলাডাঙ্গী,ওয়ার্ড নং-৫ ঠাকুরগাঁও সদর ঠাকুরগাঁও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এইচএসসি/সমমান");
        hashMap.put("des", "01737359248");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "এ এস এম নুরনবী");
        hashMap.put("title", "৫ নং বালিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :6\nস্থায়ী ঠিকানা : গ্রামঃ জালালী, ডাকঘর- বড়গাঁও, ইউপি বড়গাঁও, উপজেলা ও জেলা: ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এইচএসসি/সমমান");
        hashMap.put("des", "01780673790");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মো:আলমগীর হোসেন");
        hashMap.put("title", "৫ নং বালিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :7\nস্থায়ী ঠিকানা : গ্রামঃ কিসামত শুখান পুখুরী,ওয়ার্ড নং-৭ ঠাকুরগাঁও সদর ঠাকুরগাঁও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এইচএসসি/সমমান");
        hashMap.put("des", "01735955648");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মো:তৈয়বর রহমান");
        hashMap.put("title", "৫ নং বালিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :8\nস্থায়ী ঠিকানা : গ্রামঃ বড়গাঁও, ডাকঘর-বড়গাঁও, ইউপি বড়গাঁও, উপজেলা ও জেলা : ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : বিএসসি ইঞ্জিনিয়ারিং");
        hashMap.put("des", "01710395244");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "চরিত্র সেন");
        hashMap.put("title", "৫ নং বালিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :9\nস্থায়ী ঠিকানা : গ্রাম: কিসামত শুখান পুখুরী,ওয়ার্ড নং-৯ ঠাকুরগাঁও সদর ঠাকুরগাঁও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এইচএসসি/সমমান");
        hashMap.put("des", "01716618267");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "রিক্তা বেগম");
        hashMap.put("title", "৫ নং বালিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :1,2,3\nস্থায়ী ঠিকানা : গ্রাম: কুমারপুর,ওয়ার্ড নং-২ ঠাকুরগাঁও সদর ঠাকুরগাঁও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এসএসসি/সমমান");
        hashMap.put("des", "01797963259");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();


        hashMap.put("name", "মোছা:নারগিস পারভীন");
        hashMap.put("title", "৫ নং বালিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :4,5,6\nস্থায়ী ঠিকানা : গ্রাম: বগুলাডাঙ্গী,ওয়ার্ড নং-৪,৫,৬ ঠাকুরগাঁও সদর ঠাকুরগাঁও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এইচএসসি/সমমান");
        hashMap.put("des", "01716078905");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোছা: সাবিনা ইয়াছমিন");
        hashMap.put("title", "৫ নং বালিয়া ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :7,8,9\nস্থায়ী ঠিকানা : গ্রাম:কিসামত শুখান পুখুরী,ওয়ার্ড নং-৭,৮,৯ ঠাকুরগাঁও সদর ঠাকুরগাঁও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "01744478489");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        //********************************************
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

            LayoutInflater layoutInflater=getLayoutInflater();
            View myView=layoutInflater.inflate(R.layout.contact_item,null);

            //********************************************
            Animation animation = AnimationUtils.loadAnimation(Urgent_Number.this, R.anim.kartik_anim);
            animation.setStartOffset(i*10);
            myView.startAnimation(animation);
            //********************************************

            //********************************************
            TextView ContactName=myView.findViewById(R.id.ContactName);
            TextView ContactTitle=myView.findViewById(R.id.ContactTitle);
            TextView ContactDes=myView.findViewById(R.id.ContactDes);
            LinearLayout linearLayout=myView.findViewById(R.id.linearLayout);
            //********************************************
            //********************************************
            HashMap<String,String>hashMap=arrayList.get(i);
            String cat=hashMap.get("name");
            String title=hashMap.get("title");
            String des=hashMap.get("des");

            ContactTitle.setText(title);
            ContactDes.setText(des);
            ContactName.setText(cat);

            //********************************************
            Random rnd = new Random();
            int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            ContactName.setBackgroundColor(color);
            //********************************************

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intentCall= new Intent(Intent.ACTION_CALL);
                    intentCall.setData(Uri.parse("tel:"+des));


                    if(ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE)!=
                            PackageManager.PERMISSION_GRANTED){
                        Toast.makeText(Urgent_Number.this,"please grant permission",Toast.LENGTH_SHORT).show();
                        requestPermission();
                    }
                    else{
                        startActivity(intentCall);
                    }
                }
            });


            return myView;
        }
    }
    //********************************************

    private  void  requestPermission(){
        ActivityCompat.requestPermissions(Urgent_Number.this,new String[]
                {Manifest.permission.CALL_PHONE},1);
    };


}