package tasktwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isEmpty()) {
            System.out.println("Vad heter du?");
            name = scanner.nextLine();

            if(!name.isEmpty()) {
                switch (name.charAt(0)) {
                    case 'Ö', 'ö' ->
                            System.out.println("Namnet börjar på bokstaven Ö och det är den sista bokstaven i alfabetet!");
                    default -> System.out.println("Ditt namn börjar på bokstaven " + name.charAt(0) + "!");
                }
            }
        }
    }
}
