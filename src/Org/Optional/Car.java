package Org.Optional;

public class Car{
    String Bmw;
    String odi;
    String Thar;
    String No1;
    Integer id;
    Integer no;

    public Car(String bmw, String odi, String thar, String no1, Integer id, Integer no) {
        Bmw = bmw;
        this.odi = odi;
        Thar = thar;
        No1 = no1;
        this.id = id;
        this.no = no;
    }

    public String getBmw() {
        return Bmw;
    }

    public void setBmw(String bmw) {
        Bmw = bmw;
    }

    public String getOddi() {
        return odi;
    }

    public void setOddi(String odi) {
        this.odi = odi;
    }

    public String getThar() {
        return Thar;
    }

    public void setThar(String thar) {
        Thar = thar;
    }

    public String getNo1() {
        return No1;
    }

    public void setNo1(String no1) {
        No1 = no1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Bmw='" + Bmw + '\'' +
                ", odi='" + odi + '\'' +
                ", Thar='" + Thar + '\'' +
                ", No1='" + No1 + '\'' +
                ", id=" + id +
                ", no=" + no +
                '}';
    }
}
