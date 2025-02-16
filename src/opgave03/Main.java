package opgave03;

public class Main {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            System.out.println(i + " : " + threeXPlusOne(i));
        }
    }

    private static int threeXPlusOne(int x) {
        int count = 0;
        while (x > 1) {
            if (x % 2 == 0) {
                x = x / 2;
            }
            else {
                x = 3 * x + 1;
            }
            count++;
        }
        return count;
    }

}
