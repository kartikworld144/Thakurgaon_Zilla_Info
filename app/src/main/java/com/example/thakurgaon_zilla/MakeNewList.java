package com.example.thakurgaon_zilla;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeNewList {

    public static ArrayList< HashMap<String, String> > arrayList;
    public static ArrayList< HashMap<String, String> > my_arrayList;
    public static HashMap<String, String> hashMap;

    public static void createGridListForItem(String category_name, Integer drawable){
        hashMap = new HashMap<>();
        hashMap.put("category_name", category_name);
        hashMap.put("img", String.valueOf(drawable));
        arrayList.add(hashMap);
        my_arrayList = new ArrayList<>();
    }

    public static void createMyAlbums(){
        arrayList = new ArrayList<>();
        my_arrayList = new ArrayList<>();

        //=========================
        createGridListForItem("Information", R.drawable.eye);
        createGridListForItem("Input", R.drawable.deviation);
        createGridListForItem("Thakurgaon", R.drawable.t);
        createGridListForItem("Ranisonkail", R.drawable.r);
        createGridListForItem("Baliyadangi", R.drawable.b);
        createGridListForItem("Horipur", R.drawable.h);
        createGridListForItem("Pirganj", R.drawable.p);
        //=========================
        createGridListForItem("Searching", R.drawable.eye);
        createGridListForItem("Input", R.drawable.deviation);
        createGridListForItem("ListSearch", R.drawable.t);
        createGridListForItem("ঠাকুরগাঁওয়ের নাম্বারসমূহ", R.drawable.b);
        createGridListForItem("পিরগঞ্জের নাম্বারসমূহ", R.drawable.b);
        createGridListForItem("রানিশংকৈলের নাম্বারসমূহ", R.drawable.b);
        createGridListForItem("বালিয়াডাঙ্গীর নাম্বারসমূহ", R.drawable.b);
        createGridListForItem("হরিপুরের নাম্বারসমূহ", R.drawable.b);
        createGridListForItem("Input", R.drawable.h);
        createGridListForItem("Information", R.drawable.p);
        //==========================
    }

}
