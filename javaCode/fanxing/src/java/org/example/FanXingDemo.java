package org.example;

import java.util.ArrayList;

public class FanXingDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("yanglinfu");
        arrayList.add("lwei");
        // 无法直接将一个
        //arrayList.add(124);
        arrayList.add(String.valueOf(124));
        System.out.println(arrayList.get(0));
    }
}
