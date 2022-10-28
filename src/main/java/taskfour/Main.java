package taskfour;

import com.fasterxml.jackson.databind.ObjectMapper;
import taskthree.Person;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    private static List<Person> people;
    //private static int input;
    private static ObjectMapper mapper;

    public static void main(String[] args) throws IOException {
        scanner = new Scanner(System.in);
        people = new ArrayList<>();
        mapper = new ObjectMapper();
        //input = 0;

        // Användes bara för att spara ner till JSON
        /*while(input != 1) {
            createNewPerson();
        }
        mapper.writeValue(Paths.get("src/main/resources/people.json").toFile(), people);*/

        people = List.of(mapper.readValue(Paths.get("src/main/resources/people.json").toFile(), Person[].class));
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
        //input = Integer.parseInt(scanner.nextLine());
    }
}
