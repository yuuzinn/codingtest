import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long S = scanner.nextLong();
        long sum = 0;
        int N = 0;
        
        while (sum < S) {
            sum += ++N;
        }
        
        if (sum > S) {
            N--;
        }
        
        System.out.println(N);
    }
}
