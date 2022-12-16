package Org.Optional;

import java.util.Optional;

public class Person1 {
    public static void main(String[] args) {
        Person obj = new Person(null, "kant");
        Optional<Object> Optional1 = Optional.ofNullable(obj);
//        System.out.println(Optional1.isPresent());
        System.out.println(Optional1.get());
        Optional<String> name = Optional.of(obj.name);
        System.out.println(name);

    }
}


