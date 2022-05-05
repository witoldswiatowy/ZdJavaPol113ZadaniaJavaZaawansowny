package zadania.pierwszyTydzien;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDatabase {

    private static java.lang.Exception MojException;
    Scanner scanner = new Scanner(System.in);

    public static void addStudent(ArrayList<Student> listOfStudent, Student potencialStudent) {
//    public static void addStudent(ArrayList<Student> listOfStudent, Student potencialStudent) throws Exception {
        if (potencialStudent.getPkt() > 25) {
            listOfStudent.add(potencialStudent);
            System.out.println("Dodałem: " + potencialStudent.getForname() + " " + potencialStudent.getName() + "do listy studentów" );
        } else {
            System.out.println("Mr./Ms. " + potencialStudent.getForname() + " " + potencialStudent.getName() + " has been rejected");
//            throw MojException;
        }
    }

    public String getStudent(Student student) {
        return student.getId();
    }

    public void changeAddress(ArrayList<Student> listOfStudent, String id) {
        for (int i = 0; i < listOfStudent.size(); i++) {
            String searchingId = listOfStudent.get(i).getId();
            if (searchingId.equals(id)) {
                Address address = listOfStudent.get(i).getAddress();
                System.out.println(address.city + " chcesz zmienić na: ");
                address.city = scanner.nextLine();
                System.out.println(address.street + " chcesz zmienić na: ");
                address.street = scanner.nextLine();
                System.out.println(address.numberOfBuilding + " chcesz zmienić na: ");
                address.numberOfBuilding = scanner.nextLine();
                System.out.println("Adres zmieniono na: " + address.city + " " + address.street + " " + address.numberOfBuilding);
                break;
            }
        }
    }

    public ArrayList<Student> getStudentFromCity(ArrayList<Student> listOfStudent, String city) {
        ArrayList<Student> listOfStudentFromCity = new ArrayList<>();
        for (int i = 0; i < listOfStudent.size(); i++) {
            String searchingCity = listOfStudent.get(i).getAddress().getCity();
            if (searchingCity.equals(city)) {
                listOfStudentFromCity.add(listOfStudent.get(i));
                System.out.println("Dodałem studenta: " + listOfStudent.get(i).getId());
            }
        }
        return listOfStudentFromCity;
    }

    public ArrayList<Student> getStudentrderByAge(ArrayList<Student> listOfStudent, String age) {
        //przypomnieć sobie localDate
        return listOfStudent;
    }

    public void punishStudents(int age, String city, Student student, ArrayList<Student> listOfStudent) {
        if (student.getAge() > 20) {
            student.setPkt(-10);
            if (!(student.getAddress().getCity().equals(city))) {
                student.setPkt(-10);
            }
        } else if (!(student.getAddress().getCity().equals(city))){
            student.setPkt(-10);
        }
        if (student.getPkt()<30){
            listOfStudent.remove(student);
        }
    }
}
