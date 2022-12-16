package Org.Optional;

import java.util.ArrayList;
import java.util.Optional;

class Car{
    private String name;
    private String colour;
    private String modelno;
    private int id;

    public Car(String name, String colour, String modelno, int id) {
        this.name = name;
        this.colour = colour;
        this.modelno = modelno;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public String getModelno() {
        return modelno;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", modelno='" + modelno + '\'' +
                ", id=" + id +
                '}';
    }
}

class Car1{
    public static void main(String[] args) {


        ArrayList<Car> obj = new ArrayList<>();
        obj.add(new Car("Bmw","black","S", 4672));
        obj.add(new Car("Odi","white","c", 12006));
        obj.add(new Car("Thar","red","a", 12642));
        obj.add(new Car("car","bulu","r", 89012));

        Optional<String> list =Optional.ofNullable("Bmw");
        System.out.println(list);
        obj.stream().forEach(car -> System.out.println(car.getColour()));
        obj.stream().forEach(car -> System.out.println(car.getId()));
    }
}