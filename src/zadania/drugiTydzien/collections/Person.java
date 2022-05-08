package zadania.drugiTydzien.collections;

public class Person implements Comparable<Person>{
    String username;
    int age;
    String gender;

    public Person(String username, int age, String gender) {
        this.username = username;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public int compareTo(Person p) {
        return this.age - p.age;
    }
}
