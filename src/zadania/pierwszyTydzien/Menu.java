package zadania.pierwszyTydzien;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void menu(ArrayList<Student> listOfStudent) {
        int choice;
        System.out.println("Do wyboru masz: \n 1 przedstaw się \n 2 sprawdz liste uczniow w liceum \n 3 wkrótce \n 9 wypisz menu \n 0 wyjscie z programu");
        do {
            System.out.println("Co chcesz zrobić, wpisz numer?");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Który index ma się wypisać");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    listOfStudent.get(index).przedstawSie();
                    break;
                case 2:
                    for (Student s : listOfStudent) {
                        s.przedstawSie();
                    }
                    break;
                case 9 :
                    System.out.println("Do wyboru masz: \n 1 przedstaw się \n 2 sprawdz liste uczniow w liceum \n 3 wkrótce \n 9 wypisz menu \n 0 wyjscie z programu");
                    break;
                case 0 :
                    System.out.println("Do widzenia!");
                    break;
            }
        }
        while (choice != 0);

    }

}
