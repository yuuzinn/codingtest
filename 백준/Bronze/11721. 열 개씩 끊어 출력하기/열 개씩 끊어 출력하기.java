import java.util.*;

public class Main {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String next = scanner.next();
        for (int i = 0; i < next.length(); i++) {
            char c = next.charAt(i);
            System.out.print(c);
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
    }
}
