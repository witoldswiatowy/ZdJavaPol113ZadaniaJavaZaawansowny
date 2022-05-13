package collections;

import java.util.ArrayList;

public class MainTmp {
    public static void main(String[] args) {
        Person person1 = new Person ("Adam", 20, "Male");
        Person person2 = new Person ("Dawid", 30, "Male");
        Person person3 = new Person ("Agnieszka", 25, "Famale");
        Person person4 = new Person ("Ewa", 15, "Famale");

        ArrayList <Person> arrayList = new ArrayList<>();
        arrayList.add(person1);
        arrayList.add(person2);
        arrayList.add(person3);
        arrayList.add(person4);

        arrayList.sort(Person::compareTo);

        for (Person p : arrayList){
            System.out.println(p.toString());
        }

    }
}
