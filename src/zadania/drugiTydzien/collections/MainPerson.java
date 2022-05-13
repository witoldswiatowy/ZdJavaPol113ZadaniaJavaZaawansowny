package zadania.drugiTydzien.collections;

import java.util.List;
import java.util.stream.Stream;

public class MainPerson {
    public static void main(String[] args) {
        Stream.of(1,2,3,4).forEach(System.out::println);

        List <Integer> myList = Stream.of(1,2,3,4).toList();

        System.out.println(myList.toString());
    }
}
