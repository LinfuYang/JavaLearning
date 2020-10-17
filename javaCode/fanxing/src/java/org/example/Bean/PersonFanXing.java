package org.example.Bean;

/*
* 泛型类的编写
* 在不熟练的情况下，首先可以按照某种类型例如T类型编写一个正常类
* 然后将特定类型String  替换为T，并在类上申明为<T>
注意： 泛型类的T不能用于静态放会导致编译错误。但是可以引用其他的泛型类型例如K
* Java泛型中的标记符含义：
 E - Element (在集合中使用，因为集合中存放的是元素)

 T - Type（Java 类）
 K - Key（键）

 V - Value（值）
 N - Number（数值类型）

？ -  表示不确定的java类型
 S、U、V  - 2nd、3rd、4th types
 */
public class PersonFanXing <T>{
    private T name;
    private T id;

    @Override
    public String toString() {
        return "PersonFanXing{" +
                "name=" + name +
                ", id=" + id +
                '}';
    }

    public PersonFanXing(T name, T id) {
        this.name = name;
        this.id = id;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
    public static <V> PersonFanXing<V> createInstance(V name, V idnum){
        return new PersonFanXing<V>(name, idnum);
    }

}
