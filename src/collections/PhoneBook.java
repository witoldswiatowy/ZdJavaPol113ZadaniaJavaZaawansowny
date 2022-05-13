package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map<String, Person> mapOfPersons = new HashMap<>();

    private void addPerson(String number, Person person) {
        mapOfPersons.put(number, person);
        System.out.println("W pozycji: " + number + " dodałem: " + person);
    }

    private Person searchPerson(String number) throws PersonNotFoundException {
        Person personTmp = mapOfPersons.get(number);
        if (personTmp == null) {
            throw new PersonNotFoundException(number);                              // rzucamy wyjątek dziedziczący po Exception
        }
        return personTmp;
    }

    private void removePerson(int number) {
        System.out.println("Z pozycji: " + number + " usunięto: " + mapOfPersons.get(number));
        mapOfPersons.remove(number);
    }


}
