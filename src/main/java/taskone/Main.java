package taskone;

import java.util.Scanner;

public class Main {
    /***
     *
     * @param args args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isEmpty()) {
            System.out.println("Vad heter du?");
            name = scanner.nextLine();

            if(!name.isEmpty()) {
                if (name.charAt(0) == 'Ö' || name.charAt(0) == 'ö') {
                    System.out.println("Namnet börjar på bokstaven Ö och det är den sista bokstaven i alfabetet!");
                } else {
                    System.out.println("Ditt namn börjar på bokstaven " + name.charAt(0) + "!");
                }
            }
        }
    }
}
