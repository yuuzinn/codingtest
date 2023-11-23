import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        int[] count = new int[26];
        Arrays.fill(count, 0);
        alphabetCount(next, count);
        for (int i = 0; i < count.length; i++) {
            System.out.print(count[i] + " ");
        }
    }
    public static void alphabetCount(String str, int[] arr) {
        String[] split = str.split("");
        for (int i = 0; i < split.length; i++) {
            String ch = split[i];
            int c1 = ch.charAt(0);
             ++arr[c1 - 97];
        }
    }
}