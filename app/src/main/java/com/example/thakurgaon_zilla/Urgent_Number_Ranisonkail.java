
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
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;

import com.example.thakurgaon_zilla.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Urgent_Number_Ranisonkail extends AppCompatActivity {

    ListView listView;
    ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();
    HashMap <String,String>hashMap=new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.urgent_number_list);

        listView = findViewById(R.id.listView);
        Urgent_Number_Ranisonkail.MyAdapter myAdapter = new Urgent_Number_Ranisonkail.MyAdapter();
        listView.setAdapter(myAdapter);

        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // add toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("রানিশংকৈলের নাম্বারসমূহ");

        // add back arrow to toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        // don't forget click listener for back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(arrow -> onBackPressed());
        //-------------------------------------------------------------------------------------------------

        //******************************** ধর্মগড় ইউনিয়ন পরিষদ ***********************************


        hashMap = new HashMap<>();
        hashMap.put("name", "কাসিম");
        hashMap.put("title", "উপজেলা চেয়ারম্যান \nস্থায়ী ঠিকানা : গ্রামঃ ভরনিয়া শিকনাতপুকুর , ওয়ার্ড নং ৬ , ডাকঘরঃ ভরনিয়াহাট, উপজেলাঃ রানীশংকৈল, জেলাঃ ঠাকুরগাঁও\nসর্বশেষ শিক্ষাগত যোগ্যতা : এইচএসসি/সমমান");
        hashMap.put("des", "01714942028");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "ধীরেন্দ্র নাথ");
        hashMap.put("title", "ধর্মগড় ইউপি সদস্য \nপদবি: গ্রাম পুলিশ\nকাজের স্থান : ১ নং ধর্মগড় ইউপি");
        hashMap.put("des", "01748212065");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "মোঃ খাজামত আলী");
        hashMap.put("title", "ধর্মগড় ইউপি সদস্য \nপদবি: গ্রাম পুলিশ\nকাজের স্থান : ১ নং ধর্মগড় ইউপি");
        hashMap.put("des", "01750864006");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "মোঃ জালাল উদ্দিন");
        hashMap.put("title", "ধর্মগড় ইউপি সদস্য \nপদবি: গ্রাম পুলিশ\nকাজের স্থান : ১ নং ধর্মগড় ইউপি");
        hashMap.put("des", "01739016012");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "শ্রী বিমল চন্দ্র রায়");
        hashMap.put("title", "ধর্মগড় ইউপি সদস্য \nপদবি: গ্রাম পুলিশ\nকাজের স্থান : ১ নং ধর্মগড় ইউপি");
        hashMap.put("des", "01746192291");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "শ্রী ভাদ্রু চন্দ্র");
        hashMap.put("title", "ধর্মগড় ইউপি সদস্য \nপদবি: গ্রাম পুলিশ\nকাজের স্থান : ১ নং ধর্মগড় ইউপি");
        hashMap.put("des", "01774035401");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "সুরেন চন্দ্র");
        hashMap.put("title", "ধর্মগড় ইউপি সদস্য \nপদবি: গ্রাম পুলিশ\nকাজের স্থান : ১ নং ধর্মগড় ইউপি");
        hashMap.put("des", "01740339506");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "খির চরন");
        hashMap.put("title", "ধর্মগড় ইউপি সদস্য \nপদবি: গ্রাম পুলিশ\nকাজের স্থান : ১ নং ধর্মগড় ইউপি");
        hashMap.put("des", "01720559490");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "ভুপেন চন্দ্র রায়");
        hashMap.put("title", "ধর্মগড় ইউপি সদস্য \nপদবি: গ্রাম পুলিশ\nকাজের স্থান : ১ নং ধর্মগড় ইউপি");
        hashMap.put("des", "01743948546");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "নিবারন চন্দ্র রায়");
        hashMap.put("title", "ধর্মগড় ইউপি সদস্য \nপদবি: গ্রাম পুলিশ\nকাজের স্থান : ১ নং ধর্মগড় ইউপি");
        hashMap.put("des", "01734870901");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "বালাচরন রায়");
        hashMap.put("title", "ধর্মগড় ইউপি সদস্য \nপদবি: গ্রাম পুলিশ\nকাজের স্থান : ১ নং ধর্মগড় ইউপি");
        hashMap.put("des", "01705987514");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        //************************* নেকমরদ ইউনিয়ন পরিষদ *******************
        hashMap.put("name", "আলহাজ্ব মোঃ আবুল হোসেন");
        hashMap.put("title", "নেকমরদ ইউনিয়ন পরিষদের চেয়ারম্যান\nওয়ার্ড নং :1-9\nস্থায়ী ঠিকানা : গ্রামঃ করনাইট, ডাকঘরঃ নেকমরদ উপজেলাঃ রাণীশংকৈল, জেলাঃ ঠাকুরগাঁও\nসর্বশেষ শিক্ষাগত যোগ্যতা : বিএসসি/বিএ/বিকম/বিএসএস/সমমান");
        hashMap.put("des", "01719667498");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোছাঃ বেবী বেগম");
        hashMap.put("title", "নেকমরদ ইউনিয়ন পরিষদের হিসাব সহকারী কাম-কম্পিউটার অপারেটর\nওয়ার্ড নং :1-9\nই-মেইল : babynajnin765@gmail.com\nব্যাচ (বিসিএস) : -১");
        hashMap.put("des", "০১৭১৯০৪১৭৬৫");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোঃ নুর জামান");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য\nওয়ার্ড নং:1\nগ্রাম: চন্দনচহট");
        hashMap.put("des", "০১৭৯৭৮৫৪৭৩৫");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "মোঃ দবিরুল ইসলাম");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য\nওয়ার্ড নং:2\nগ্রাম: দূর্লভপুর");
        hashMap.put("des", "০১৭১০০৪৮২৩১");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "মোঃ আমিনুল হক আমিন");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য\nওয়ার্ড নং:3\nগ্রাম: পারকুন্ডা");
        hashMap.put("des", "০১৭৩৯৪২৫৬৫৬");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "মোঃ আনিসুর রহমান");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য\nওয়ার্ড নং:4\nগ্রাম: ভবানন্দপুর");
        hashMap.put("des", "০১৭৭৬৮৫৭৪৬৫");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "সিরেন্দ্র নাথ");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য\nওয়ার্ড নং:5\nগ্রাম: ঘনশ্যামপুর");
        hashMap.put("des", "০১৭৩২৯৯২১৫৬");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "মোঃ সলেমান আলী");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য\nওয়ার্ড নং:6\nগ্রাম: যদুয়ার");
        hashMap.put("des", "০১৭২২৬০৯১২৫");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "মোঃ জবেদ আলী");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য\nওয়ার্ড নং:7\nগ্রাম: করনাইট");
        hashMap.put("des", "০১৭০৫৮০৪৫৬৫");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "মোঃ তফিজুল ইসলাম");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য\nওয়ার্ড নং:8\nগ্রাম: ভকরগাঁও");
        hashMap.put("des", "০১৭১৯৪৭১০৫১");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "রবেন্দ্র নাথ গনেষ");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য\nওয়ার্ড নং:9\nগ্রাম: নারায়নপুর");
        hashMap.put("des", "০১৭৩৭২৮৮৬৯০");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "মর্জিনা বেগম");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য\nওয়ার্ড নং:1,2,3\nগ্রাম: পারকুন্ডা");
        hashMap.put("des", "০১৭৮৪৯০৯৭৩০");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "মোছাঃ জহুরা বেগম");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য\nওয়ার্ড নং:4,5,6\nগ্রাম: ভবানন্দপুর");
        hashMap.put("des", "০১৭২২৯৩৭৬১৬");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "সাবিত্রী রানী");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য\nওয়ার্ড নং:7,8,9\nগ্রাম: ভকরগাঁও");
        hashMap.put("des", "০১৭৬১৬৩২৬৮৪");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        //************************** নেকমরদ ইউনিয়ন গ্রাম পুলিশ ******************
        hashMap.put("name", "মজিবর রহমান");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য \nগ্রাম: চন্দনচহট\nওয়ার্ড: 1\nপদবি: গ্রাম পুলিশ\nকাজের স্থান : 2 নং নেকমরদ ইউপি");
        hashMap.put("des", "০১৭৭০০৬৭৬৫২২");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "মনসুর আলী");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য \nগ্রাম: দূর্লভপুর\nওয়ার্ড: 2\nপদবি: গ্রাম পুলিশ\nকাজের স্থান : 2 নং নেকমরদ ইউপি");
        hashMap.put("des", "০১৭২২৮০০৫৬০");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "চিত্র কান্ত");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য \nগ্রাম: পারকুন্ডা\nওয়ার্ড: 3\nপদবি: গ্রাম পুলিশ\nকাজের স্থান : 2 নং নেকমরদ ইউপি");
        hashMap.put("des", "০১৭৫১০৮৬৩৩২");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "মোজাম্মেল হক");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য \nগ্রাম: ভবানন্দপুর\nওয়ার্ড: 4\nপদবি: গ্রাম পুলিশ\nকাজের স্থান : 2 নং নেকমরদ ইউপি");
        hashMap.put("des", "০১৭৬৭৩২৩৬৯০");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "ভোলা রাম");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য \nগ্রাম: ঘনশ্যামপুর\nওয়ার্ড: 5\nপদবি: গ্রাম পুলিশ\nকাজের স্থান : 2 নং নেকমরদ ইউপি");
        hashMap.put("des", "০১৭৬২৭৬৪২৮১");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "শ্রী দিগেন চন্দ্র রায় (দফাদার) ");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য \nগ্রাম: ঘনশ্যামপুর\nওয়ার্ড: 5\nপদবি: গ্রাম পুলিশ\nকাজের স্থান : 2 নং নেকমরদ ইউপি");
        hashMap.put("des", "০১৭৭৪২৮৬১১০");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "মন্টু আহাম্মেদ");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য \nগ্রাম: যদুয়ার \nওয়ার্ড: 6\nপদবি: গ্রাম পুলিশ\nকাজের স্থান : 2 নং নেকমরদ ইউপি");
        hashMap.put("des", "০১৭৩৭৮৮০১৩৯");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "মোকবুল হোসেন");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য \nগ্রাম: করনাইট\nওয়ার্ড: 7\nপদবি: গ্রাম পুলিশ\nকাজের স্থান : 2 নং নেকমরদ ইউপি");
        hashMap.put("des", "০১৭৫০৮৬৪০২৯");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "রশিক লাল");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য \nগ্রাম: ফরিদপাড়া\nওয়ার্ড: 8\nপদবি: গ্রাম পুলিশ\nকাজের স্থান : 2 নং নেকমরদ ইউপি");
        hashMap.put("des", "০১৭৮৩১৪৫৭৩৩");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "পুলিন চন্দ্র");
        hashMap.put("title", "নেকমরদ ইউপি সদস্য \nগ্রাম: গোরকই\nওয়ার্ড: 9\nপদবি: গ্রাম পুলিশ\nকাজের স্থান : 2 নং নেকমরদ ইউপি");
        hashMap.put("des", "০১৭৬৪৭৬৪৭২৪");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        //********************************************

        //********************* হোসেনগাঁও ইউনিয়ন পরিষদ ***********************
        hashMap.put("name", "মোঃ মতিউর রহমান");
        hashMap.put("title", "হোসেনগাঁও ইউনিয়ন পরিষদের মেম্বার\nওয়ার্ড নং :6\nস্থায়ী ঠিকানা : গ্রামঃ নয়ানপুর, ডাকঘরঃ রাণীশংকৈল, উপজেলাঃ রাণীশংকৈল, জেলাঃ ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : বিএসসি ইঞ্জিনিয়ারিং");
        hashMap.put("des", "০১৭২৮৮৬৬১০১");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();


        //********************* বাচোর ইউনিয়ন পরিষদ ***********************
        hashMap.put("name", "জীতেন্দ্রনাথ বর্ম্মন");
        hashMap.put("title", "বাচোর ইউনিয়ন পরিষদের মেম্বার \nফোন (অফিস) : 01756215212\nওয়ার্ড নং :1-9\nস্থায়ী ঠিকানা : গ্রামঃ ঝাপেরতল, বাচোর, রাণীশংকৈল, ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : মাস্টার্স/সমমান");
        hashMap.put("des", "01762775896");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোছাঃ নার্গিস আক্তার");
        hashMap.put("title", "বাচোর ইউনিয়ন পরিষদের মেম্বার \nওয়ার্ড নং :1,2,3\nস্থায়ী ঠিকানা : ভাংবাড়ী, রাণীশংকৈল, ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "01705841998");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();
        hashMap.put("name", "মোছাঃ মাসুদা বেগম");
        hashMap.put("title", "বাচোর ইউনিয়ন পরিষদের মেম্বার \nওয়ার্ড নং :4,5,6\nস্থায়ী ঠিকানা : দোশিয়া, ৪নং ওয়ার্ড, রাণীশংকৈল, ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এসএসসি/সমমান");
        hashMap.put("des", "0173879783");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "তুফানশ্বরী রায়");
        hashMap.put("title", "বাচোর ইউনিয়ন পরিষদের মেম্বার \nওয়ার্ড নং :7,8,9\nস্থায়ী ঠিকানা : মাধবপুর, কাতিহার, রাণীশংকৈল, ঠাকুরগাঁও ।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এসএসসি/সমমান");
        hashMap.put("des", "01773009799");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "তুলা রাম");
        hashMap.put("title", "বাচোর ইউনিয়ন পরিষদের মেম্বার \nওয়ার্ড নং :১\nস্থায়ী ঠিকানা : গ্রামঃ ভাংবাড়ী, ফুটানি, রাণীশংকৈল, ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এসএসসি/সমমান");
        hashMap.put("des", "01311881814");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "খগেন্দ্রনাথ রায়");
        hashMap.put("title", "বাচোর ইউনিয়ন পরিষদের মেম্বার \nওয়ার্ড নং :২\nস্থায়ী ঠিকানা : বাচোর; ২নং ওয়ার্ড নং, রাণীশংকৈল, ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এসএসসি/সমমান");
        hashMap.put("des", "01797771466");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোঃ বাবুল হোসেন");
        hashMap.put("title", "বাচোর ইউনিয়ন পরিষদের মেম্বার \nওয়ার্ড নং :৩\nস্থায়ী ঠিকানা : মহেষপুর; ওয়ার্ড নং- ০৩; বনগাঁও, রাণীশংকৈল, ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এসএসসি/সমমান");
        hashMap.put("des", "01764966731");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মো: তাহেরুল ইসলাম");
        hashMap.put("title", "বাচোর ইউনিয়ন পরিষদের মেম্বার \nওয়ার্ড নং :৪\nস্থায়ী ঠিকানা : সহোদর, রাণীশংকৈল , ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "০১৭১৭৩১০২৫১");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোঃ ওয়াসিম আলী");
        hashMap.put("title", "বাচোর ইউনিয়ন পরিষদের মেম্বার \nওয়ার্ড নং :৫\nস্থায়ী ঠিকানা : গ্রামঃ বাজেবকশা, রাণীশংকৈল, ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "01719645640");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোঃ আক্কাস আলী");
        hashMap.put("title", "বাচোর ইউনিয়ন পরিষদের মেম্বার \nওয়ার্ড নং :৬\nস্থায়ী ঠিকানা : বকসা সুন্দরপুর; ওয়ার্ড নং- ০৬, রাণীশংকৈল, ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "01761659091");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোঃ উমের আলী");
        hashMap.put("title", "বাচোর ইউনিয়ন পরিষদের মেম্বার \nওয়ার্ড নং :৭\nস্থায়ী ঠিকানা : রাজোর, ৭নং ওয়ার্ড, কাতিহার, রাণীশংকৈল, ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : অষ্টম শ্রেণি পাস");
        hashMap.put("des", "01785339031");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "যতীন চন্দ্র রায়");
        hashMap.put("title", "বাচোর ইউনিয়ন পরিষদের মেম্বার \nওয়ার্ড নং :৮\nস্থায়ী ঠিকানা : মাধবপুর, কাতিহার; রানীশংকৈল, ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : এসএসসি/সমমান");
        hashMap.put("des", "01740479989");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        hashMap.put("name", "মোঃ মুকুল হক");
        hashMap.put("title", "বাচোর ইউনিয়ন পরিষদের মেম্বার \nওয়ার্ড নং :৯\nস্থায়ী ঠিকানা : রাণীশংকৈল, ঠাকুরগাঁও।\nসর্বশেষ শিক্ষাগত যোগ্যতা : সমমান");
        hashMap.put("des", "01738150814");
        arrayList.add(hashMap);
        hashMap = new HashMap<>();

        //********************************************

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
            Animation animation = AnimationUtils.loadAnimation(Urgent_Number_Ranisonkail.this, R.anim.kartik_anim);
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
            //********************************************
            Random rnd = new Random();
            int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            ContactName.setBackgroundColor(color);

            //********************************************
            //********************************************
            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intentCall= new Intent(Intent.ACTION_CALL);
                    intentCall.setData(Uri.parse("tel:"+des));


                    if(ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE)!=
                            PackageManager.PERMISSION_GRANTED){
                        Toast.makeText(Urgent_Number_Ranisonkail.this,"please grant permission",Toast.LENGTH_SHORT).show();
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
        ActivityCompat.requestPermissions(Urgent_Number_Ranisonkail.this,new String[]
                {Manifest.permission.CALL_PHONE},1);
    };


}


