package opgave01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(32, 23, 13, -22, 202, 42, 53, 0));
        System.out.println("Antal lige tal = " + numberOfEvenNumbers(integers));
    }

    private static int numberOfEvenNumbers(ArrayList<Integer> integers) {
        return helpMethod(integers, 0, 0);
    }

    private static int helpMethod(ArrayList<Integer> integers, int index, int evenNumbers) {
        if (index >= integers.size()) {
            return evenNumbers;
        }
        if (integers.get(index) % 2 == 0) {
            evenNumbers++;
        }
        return helpMethod(integers, index + 1, evenNumbers);

    }
}