import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nextInt = sc.nextInt();
        int[] arr = new int[nextInt];
        for (int i = 0; i < nextInt; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < nextInt; i++) {
            System.out.println(arr[i]);
        }
    }
}