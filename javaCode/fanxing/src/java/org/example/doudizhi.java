package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class doudizhi {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] colors = {"♥","♠","♦","♣"};
        String[] num = {"2","A","J","Q","K","10","9","8","7","6","5","4","3"};
        arrayList.add("大王");
        arrayList.add("小王");
        for (String str : num) {
            for (String c : colors) {
                arrayList.add(c+str);
            }
        }
        // 自动打乱数字元素
        Collections.shuffle(arrayList);
        ArrayList<String> person1 = new ArrayList<>();
        ArrayList<String> person2 = new ArrayList<>();
        ArrayList<String> person3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {

            if(i<51){
                if(i % 3 ==0){
                    person1.add(arrayList.get(i));
                }else if (i %3 == 1){
                    person2.add(arrayList.get(i));
                }else {
                    person3.add(arrayList.get(i));
                }
            }
            else {
                dipai.add(arrayList.get(i));
            }
        }
        String dehua = "德华";
        String chaowei = "朝伟";
        String runfa = "润发";
        System.out.println(dehua +":"+ person1);
        System.out.println(chaowei +":"+ person2);
        System.out.println(runfa +":"+ person3);
        System.out.println("底牌是："+ dipai);
        int dizhu = new Random().nextInt(3);
        System.out.print("首先叫牌的人是： ");
        switch (dizhu){
            case 0:
                System.out.print(dehua);
                break;
            case 1:
                System.out.print(chaowei);
                break;
            case 2:
                System.out.print(runfa);
                break;

        }
    }
}
