import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            isPrime(sc.nextInt());
        }
        System.out.println(count);
    }
    static void isPrime(int num) {
        if (num == 1) {
            return;
        }
        if (num == 2) {
            count++;
            return;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return;
            }
        }
        count++;
    }
}