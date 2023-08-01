import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = getWins(X, Y);
        int low = 0, high = (int) 1e9;
        int answer = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (getWins(X + mid, Y + mid) != Z) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(answer);
    }

    static int getWins(int X, int Y) {
        return (int) ((long) 100 * Y / X);
    }
}
