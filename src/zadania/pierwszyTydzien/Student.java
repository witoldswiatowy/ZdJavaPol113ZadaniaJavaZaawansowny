package zadania.pierwszyTydzien;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Student {
    Random rnd = new Random();
    Scanner scanner = new Scanner(System.in);

    private String id;
    private String forname;
    private String name;
    //        private ZonedDateTime dateOfBirth;
    private String dateOfBirth;
    private Address address;
    private int pkt;

    public Student(String forname, String name, String dateOfBirth, Address address) {
        setId();
        this.forname = forname;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        setPkt();
    }

//    public Student createStudent (String name, String forname, ZonedDateTime dateOfBirth,) {
//        Student student = new Student(setId(),setForname(), setName(), )
//    }

    public Student() {
    }

    public void setId() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getForname() {
        return forname;
    }

    public void setForname(String forname) {
        this.forname = forname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        System.out.println("Przypomnieć sobie local date");
        return -1;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
//    public void setDateOfBirth(ZonedDateTime dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getPkt() {
        return pkt;
    }

    public void setPkt() {
        this.pkt = rnd.nextInt(1, 50);
    }

    public void setPkt(int value) {
        this.pkt += value;
        System.out.println("Dodano/usunięto: " + value + " pkt, co daje: " + getPkt());
    }


    public void przedstawSie() {
        System.out.println(this.name + " " + this.forname + " " + this.id + " " + this.dateOfBirth + " adres: " + this.address.getCity() + " " + this.address.street + " " + this.address.numberOfBuilding);
    }

    public boolean equalsID(Student obj) {
        return obj.getId().equals(this.getId());
    }
}
