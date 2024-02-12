import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.close();

        long result = pow(A, B, C);
        System.out.println(result);
    }

    static long pow(int A, int B, int C) {
        if (B == 0)
            return 1;

        long half = pow(A, B / 2, C) % C;
        long result = (half * half) % C;

        if (B % 2 == 1)
            result = (result * A) % C;

        return result;
    }
}
