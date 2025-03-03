package opgave02;

public class Main {
    public static void main(String[] args) {
        String palindrom = "ibofobi";
        String notPalindrom = "roller";

        System.out.println("Er " + palindrom + " et palindrom? " + isPalindrom(palindrom));
        System.out.println("Er " + notPalindrom + " et palindrom? " + isPalindrom(notPalindrom));
    }

    private static boolean isPalindrom(String palindrom) {
        return helperMethod(palindrom.toCharArray(), palindrom.length() - 1, 0);
    }


    private static boolean helperMethod(char[] input, int high, int low) {
        if (high <= low) {
            return true;
        }
        if (input[high] != input[low]) {
            return false;
        }

        return helperMethod(input, high - 1, low + 1);

    }
}