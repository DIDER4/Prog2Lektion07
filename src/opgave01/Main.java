package opgave01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(32, 23, 13, -22, 202, 42, 53, 0));
        System.out.println("Antal lige tal = " + numberOfEvenNumbers(integers));
    }

    private static int numberOfEvenNumbers(ArrayList<Integer> integers) {
        return 0;
    }
}
