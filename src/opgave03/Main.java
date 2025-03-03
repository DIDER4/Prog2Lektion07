package opgave03;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            System.out.println(i + " : " + threeXPlusOne(i));
        }
    }

    private static int threeXPlusOne(int x) {
        return helperMethod(x, 0);
    }

    private static int helperMethod(int x, int counter) {
        if (x == 1) {
            return counter;
        }
        if (x % 2 == 0) {
            counter++;
            return helperMethod(x / 2, counter);
        } else {
            counter++;
            return helperMethod((x * 3) + 1, counter);

        }
    }

}