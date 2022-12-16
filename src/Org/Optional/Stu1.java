package Org.Optional;

import java.util.Optional;

public class Stu1 {
    Integer id;
    String name;
    Integer rollno;
    String gender;
    Integer mob;

    public Stu1(Integer id, String name, Integer rollno, String gender, Integer mob) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;
        this.gender = gender;
        this.mob = mob;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getMob() {
        return mob;
    }

    public void setMob(Integer mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "Stu1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollno=" + rollno +
                ", gender='" + gender + '\'' +
                ", mob=" + mob +
                '}';
    }
}
class Stu2{
    public static void main(String[] args) {
        Stu1 obj = new Stu1(12, "ravi", 181311, "male",  75720674);
        Optional<Stu1> obj1=Optional.ofNullable(obj);
        System.out.println(obj);
        Optional<String> name = Optional.of(obj.name);
        System.out.println(obj.getGender());
    }
}
