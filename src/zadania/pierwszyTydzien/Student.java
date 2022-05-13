package zadania.pierwszyTydzien;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
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
    Address address;
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

    ///tresc zadania 6 z dnia 9 o czasie
    /*String input = "2022-04-16 13:10:15";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    LocalDateTime dataTime = LocalDateTime.parse(input, formatter);
        System.out.println(dataTime);

    LocalDateTime now = LocalDateTime.now();

    Duration duration = Duration.between(now, dataTime);
    long days = duration.toDaysPart();
    int hours = duration.toHoursPart();
    int minutes = duration.toMinutesPart();
    int secs = duration.toSecondsPart();
        System.out.println("You have Days: " + days + " Hours: " + hours + " Minutes: "+ minutes + " Seconds: " + secs);
        System.out.printf("You have Days: %d Hours: %d Minutes %d Secunds %d", days, hours, minutes, secs);
        System.out.println();
        System.out.printf("You have Days: %02d Hours: %02d Minutes %02d Secunds %02d", days, hours, minutes, secs);
        System.out.printf("\n%02d:%02d:%02d:%02d", days, hours, minutes, secs);*/

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        System.out.println("Przypomnieć sobie local date");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dataTime = LocalDateTime.parse(getDateOfBirth(), formatter);
        System.out.println(dataTime);

        LocalDateTime now = LocalDateTime.now();

        Duration duration = Duration.between(now, dataTime);
        long days = duration.toDaysPart();
        int years = (int) (days / 365);
        return years;
    }

    public void setDateOfBirth(String dateOfBirth) {
        //yyyy-MM-dd HH:mm:ss
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
