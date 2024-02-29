import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int K = sc.nextInt();
        test(num, K);

    }
    static void test(int num, int K) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                list.add(i);
            }
        }
        if (list.size() < K) {
            System.out.println(0);
        } else {
            System.out.println(list.get(K - 1));
        }
    }
}