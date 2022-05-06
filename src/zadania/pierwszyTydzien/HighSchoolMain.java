package zadania.pierwszyTydzien;

import java.util.ArrayList;

public class HighSchoolMain {
    public static void main(String[] args) {
        ArrayList<Student> listOfStudent = new ArrayList<>();
        StudentDatabase astudentDatabase = new StudentDatabase();

        Address tmpAddress1 = new Address("Poznań", "Mylna", "1");
        Address tmpAddress2 = new Address("Sroda Wlkp.", "Krajewskiego", "3");
        Address tmpAddress3 = new Address("Kraków", "Mylna", "28");

        Student student1 = new Student("Adam", "Kowalski", "2001-01-01 01:01:01", tmpAddress1);
        Student student2 = new Student("Ewa", "Kowalska", "2001-01-01 01:01:01", tmpAddress1);
        Student student3 = new Student("Marcin", "Frycz", "2001-01-01 01:01:01", tmpAddress1);
        Student student4 = new Student("Witek", "Swiatowy", "1992-05-27 01:01:01", tmpAddress2);
        Student student5 = new Student("Natalia", "Swiatowy", "1992-02-16 01:01:01", tmpAddress2);
        Student student6 = new Student("Olek", "Swiatowy", "2001-01-01 01:01:01", tmpAddress2);
        Student student7 = new Student("Tymek", "Swiatowy", "2001-01-01 01:01:01", tmpAddress2);
        Student student8 = new Student("Blanka", "Odalanowska", "2001-01-01 01:01:01", tmpAddress3);
        Student student9 = new Student("Majka", "Zdun", "2001-01-01 01:01:01", tmpAddress3);
        Student student10 = new Student("Mateusz", "Zdun", "2001-01-01 01:01:01", tmpAddress3);
        Student student11 = new Student("Michał", "Nowak", "2001-01-01 01:01:01", tmpAddress1);
        Student student12 = new Student("Marta", "Nowak", "2001-01-01 01:01:01", tmpAddress1);
        Student student13 = new Student("Asia", "Bolek", "2001-01-01 01:01:01", tmpAddress2);
        Student student14 = new Student("Paulina", "Bolek", "2001-01-01 01:01:01", tmpAddress3);
        Student student15 = new Student("Kasia", "Bolek", "2001-01-01 01:01:01", tmpAddress1);

        System.out.println(student4.getAge());

        astudentDatabase.addStudent(listOfStudent,student1);
        astudentDatabase.addStudent(listOfStudent,student2);
        astudentDatabase.addStudent(listOfStudent,student3);
        astudentDatabase.addStudent(listOfStudent,student4);
        astudentDatabase.addStudent(listOfStudent,student5);
        astudentDatabase.addStudent(listOfStudent,student6);
        astudentDatabase.addStudent(listOfStudent,student7);
        astudentDatabase.addStudent(listOfStudent,student8);
        astudentDatabase.addStudent(listOfStudent,student9);
        astudentDatabase.addStudent(listOfStudent,student10);
        astudentDatabase.addStudent(listOfStudent,student11);
        astudentDatabase.addStudent(listOfStudent,student12);
        astudentDatabase.addStudent(listOfStudent,student13);
        astudentDatabase.addStudent(listOfStudent,student14);
        astudentDatabase.addStudent(listOfStudent,student15);

        System.out.println(astudentDatabase.getStudent(listOfStudent.get(0)));
        System.out.println(astudentDatabase.getStudent(listOfStudent.get(1)));


        Menu menu = new Menu();
        menu.menu(listOfStudent);


    }
}
