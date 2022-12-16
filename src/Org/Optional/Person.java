package Org.Optional;

import java.util.Optional;

public class Person {
    String name;
    String house;

    public Person(String name, String house) {
        this.name = name;
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public String getHouse() {
        return house;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", house='" + house + '\'' +
                '}';
    }
}
