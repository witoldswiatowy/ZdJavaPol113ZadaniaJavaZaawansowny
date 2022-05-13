package collections;

public class Person implements Comparable<Person> {
    private String username;
    private int age;
    private String gender;

    public Person(String username, int age, String gender) {
        this.username = username;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

//    @Override //--------to było moj sposob
//    public int compareTo(Person o) {
//        return Integer.compare(this.getAge(), o.getAge());
//    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }


    public int getAge() {
        return age;
    }
}
