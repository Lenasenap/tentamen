package tasksix;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/***
 * Main for taks six
 */
public class Main {
    private static Scanner scanner;
    private static int totalPoints;
    private static Map<Integer, List<String>> facit;
    private static Map<Integer, String> answers;

    /***
     * Räknar poängen
     */
    private static void countTotalPoints() {
        for (int i = 1; i <= 5; i++) {
            if (facit.get(i).contains(answers.get(i))) {
                totalPoints++;
            }
        }
    }
    private static void printResult() {
        countTotalPoints();
        if(totalPoints == 5) {
            System.out.println("Du är en stjärna!!! ALLA RÄTT!!");
        } else if(totalPoints < 3) {
            System.out.println("Du behöver nog studera lite mer....");
        }
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        totalPoints = 0;
        facit = new HashMap<>();
        facit.put(1, List.of("scrum master", "produktägare"));
        facit.put(2, List.of("daily", "sprintplanering"));
        facit.put(3, List.of("9"));
        facit.put(4, List.of("scrum guide"));
        facit.put(5, List.of("produktägaren"));

        answers = new HashMap<>();

        System.out.println("1. Nämn en av rollerna som finns i Scrum");
        String answer1 = scanner.nextLine();
        answers.put(1, answer1.toLowerCase());

        System.out.println("2. Nämn en av ceremonierna som finns inom Scrum");
        String answer2 = scanner.nextLine();
        answers.put(2, answer2.toLowerCase());

        System.out.println("3. Vad är rekommenderat maxantal personer i ett team?");
        String answer3 = scanner.nextLine();
        answers.put(3, answer3.toLowerCase());

        System.out.println("4. Vad heter Scrumdokumentet?");
        String answer4 = scanner.nextLine();
        answers.put(4, answer4.toLowerCase());

        System.out.println("5. Vem är den enda som får avbryta en sprint?");
        String answer5 = scanner.nextLine();
        answers.put(5, answer5.toLowerCase());

        printResult();
    }
}
