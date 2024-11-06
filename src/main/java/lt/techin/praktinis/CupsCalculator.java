package lt.techin.praktinis;

import java.util.Scanner;

public class CupsCalculator {

    public void calculateCups(int numberOfCups) {
        Scanner scanner = new Scanner(System.in);
        numberOfCups = Integer.parseInt(scanner.nextLine());
        int boxes = Integer.parseInt(scanner.nextLine());
        int leftoverCups = numberOfCups % boxes;
        System.out.println("Dėžių: " + boxes);
        System.out.println("Liko puodelių: " + leftoverCups);
    }

}
