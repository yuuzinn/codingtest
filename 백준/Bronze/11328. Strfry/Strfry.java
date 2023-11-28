import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            String first = sc.next();
            String second = sc.next();
            String firstSort = sort(first);
            String secondSort = sort(second);
            isSame(firstSort,secondSort);
        }
    }
    static String sort(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    static void isSame(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("Possible");
            return;
        }
        System.out.println("Impossible");
    }
}
