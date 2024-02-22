import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i) - 97; // a -> 0
            if (arr[c] == -1) {
                arr[c] = i;
                continue;
            } else {
                continue;
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}


