package zadania.pierwszyTydzien;

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {

        StudentDatabase studentDatabase = new StudentDatabase();
        ArrayList <Student> listOfStudent = new ArrayList<>();
        Address address1 = new Address("Poznań", "Mylna","1");
        Student student1 = new Student("Adam", "Kowalski", "01.01.2001", address1);
        listOfStudent.add(student1);
//        student1.przedstawSie();
        studentDatabase.changeAddress(listOfStudent,student1.getId());
    }
}
