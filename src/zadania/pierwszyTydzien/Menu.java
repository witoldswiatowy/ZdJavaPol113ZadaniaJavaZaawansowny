package zadania.pierwszyTydzien;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    StudentDatabase sD = new StudentDatabase();

    public void menu(ArrayList<Student> listOfStudent) {
        int choiceInt;
        String choiceString;
        int index;
        System.out.println("Do wyboru masz: \n 1 przedstaw się \n 2 sprawdz liste uczniow w liceum \n 3 zmien adres \n 4 wypisz studentow z danego miasta \n 5 wypisz studentow z danym wiekiem \n 6 zrób selekcje na podstawie kryteriów \n 9 wypisz menu \n 0 wyjscie z programu");
        do {
            System.out.println("Co chcesz zrobić, wpisz numer?");
            choiceInt = scanner.nextInt();
            scanner.nextLine();
            switch (choiceInt) {
                case 1:
                    System.out.println("Który index ma się wypisać");
                    index = scanner.nextInt();
                    scanner.nextLine();
                    listOfStudent.get(index).przedstawSie();
                    break;
                case 2:
                    for (Student s : listOfStudent) {
                        s.przedstawSie();
                    }
                    break;
                case 3:
                    System.out.println("Adres którego studenta chcesz zmienić?");
                    index = scanner.nextInt();
                    scanner.nextLine();
                    sD.changeAddress(listOfStudent,listOfStudent.get(index).getId());
                    break;
                case 4:
                    System.out.println("Z którego miasta mam wyszukać uczniów?");
                    choiceString = scanner.nextLine();
                    sD.getStudentFromCity(listOfStudent, choiceString);
                    break;
                case 5:
                    System.out.println("Uczniów z jakim wiekiem chcesz wyśtwilić?");
                    choiceInt = scanner.nextInt();
                    scanner.nextLine();
                    sD.getStudentByAge(listOfStudent, choiceInt);
                    break;
                case 6:
                    System.out.println("Powyżej jakiego wieku mają być ujemne pkt?");
                    choiceInt = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Jakie miasto ma być priorytetowane?");
                    choiceString = scanner.nextLine();
                    sD.punishStudents(choiceInt,choiceString,listOfStudent);
                    break;
                case 9 :
                    System.out.println("Do wyboru masz: \n 1 przedstaw się \n 2 sprawdz liste uczniow w liceum \n 3 wkrótce \n 9 wypisz menu \n 0 wyjscie z programu");
                    break;
                case 0 :
                    System.out.println("Do widzenia!");
                    break;
            }
        }
        while (choiceInt != 0);

    }

}
