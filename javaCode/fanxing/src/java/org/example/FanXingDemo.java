package org.example;

import org.example.Bean.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FanXingDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("yanglinfu");
        arrayList.add("lwei");
        // 无法直接将一个
        //arrayList.add(124);
        arrayList.add(String.valueOf(124));
        System.out.println(arrayList.get(0));
        // 对数组进行排序
        String[] str = {"yanglinfu", "liwei"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        // 非泛型类型的情况
        List list = new ArrayList();
        // 该add方法接受的是一个Object类型的对象
        list.add("yanglinfu");
        // 因此get出来的值也一一定是Object类型的变量
        //String first = list.get(0);
        Object first = list.get(0);
        System.out.println(first);
        Person person1 = new Person("yanglinfu", 30);
        Person person2 = new Person("liwei", 31);
        Person[] people = {person1, person2};
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
        System.out.println(people.getClass());
        System.out.println(Person.class);

    }
}
