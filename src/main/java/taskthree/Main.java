package taskthree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    private static List<Person> people;
    private static int input;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        input = 0;
        people = new ArrayList<>();

        while(input != 1) {
            createNewPerson();
        }
        printInformation();
    }

    private static void printInformation() {
        for(Person p : people) {
            System.out.println(p.getFirstName() + " " + p.getLastName());
            System.out.println(p.getFirstName() + "s favoritfilm är: " +p.getFavouriteMovie());
            System.out.println("-----");
        }
    }

    private static void createNewPerson() {
        Person person = new Person();
        System.out.println("Vad är ditt förnamn?");
        String firstName = scanner.nextLine();
        person.setFirstName(firstName);
        System.out.println("Vad är ditt efternamn?");
        String lastName = scanner.nextLine();
        person.setLastName(lastName);
        System.out.println("Vilken är din favoritfilm?");
        String movie = scanner.nextLine();
        person.setFavouriteMovie(movie);
        people.add(person);
        System.out.println("""
                    Vill du skapa en till Person?
                    1. Nej, jag är klar
                    2. Ja
                    """);
        input = Integer.parseInt(scanner.nextLine());
    }
}
