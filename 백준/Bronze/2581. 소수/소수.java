import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        
        if (list.isEmpty()) {
            System.out.println(-1);
        } else {
            int sum = list.stream().mapToInt(Integer::intValue).sum();
            System.out.println(sum);
            System.out.println(list.get(0));
        }
        
        sc.close();
    }
    
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
