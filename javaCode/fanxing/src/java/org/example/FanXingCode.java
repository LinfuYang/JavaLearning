package org.example;

import org.example.Bean.PersonFanXing;

/*
* 编写泛型类
*
 */
public class FanXingCode {
    public static void main(String[] args) {
        PersonFanXing<String> personFanXing = new PersonFanXing("yanglinfu", "123");
        Object name = personFanXing.getName();
        PersonFanXing<String> personFanXing1 = personFanXing.createInstance("liwei", "124");
        System.out.println(personFanXing.getClass() == personFanXing1.getClass());
        System.out.println(personFanXing instanceof PersonFanXing);
//        System.out.println(personFanXing instanceof PersonFanXing<String>.class);
    }
}
