package collections;

import java.text.Collator;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;

public class ShoppingQueue {

    private Deque<Person> queue = new LinkedList<>();


    public void addCustomer(Person customer) {
        queue.addLast(customer);                            // dodanie ostatniego elementu dla implementacji LinkedList ma złożoność O(1)
    }

    public Person serviceCustomer() throws EmptyQueueException {
        Person personToService = queue.pollFirst();         // pobranie pierwszego elementu dla implementacji LinkedList ma złożoność O(1)
        if (personToService == null) {
            throw new EmptyQueueException();
        }

        return personToService;
    }
}
