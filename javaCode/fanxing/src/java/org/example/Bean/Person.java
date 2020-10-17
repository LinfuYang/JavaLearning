package org.example.Bean;

public class Person  implements Comparable<Person>{
    private String name;
    private float socre;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", socre=" + socre +
                '}';
    }

    public Person(String name, float socre) {
        this.name = name;
        this.socre = socre;
    }

    public float getSocre() {
        return socre;
    }

    public void setSocre(float socre) {
        this.socre = socre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person person) {
        if(this.socre< person.socre){
            return  - 1;
        }
        return 1;
    }

}
