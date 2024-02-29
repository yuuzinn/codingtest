import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int i = sc.nextInt();
            if (i == -1) break;
            boolean measure = measure(i);
            if (measure) {
                System.out.print(i + " = ");
                for (int j = 0; j < list.size(); j++) {
                    if (j == list.size() - 1) {
                        System.out.print(list.get(j));
                        System.out.println();
                        list.clear();
                        break;
                    }
                    System.out.print(list.get(j) + " + ");
                }
            } else {
                System.out.println(i + " is NOT perfect.");
                list.clear();
            }
        }
    }
    static boolean measure(int n) {
        int result = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                result += i;
                list.add(i);
            }
        }
        return result == n;
    }
}
