import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int result = sc.nextInt();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (isSum(arr[left], arr[right], result)) {
                left++;
                right--;
            } else if (arr[left] + arr[right] < result) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(count);
    }
    static boolean isSum(int a, int b, int result) {
        if (a + b == result) {
            count++;
            return true;
        }
        return false;
    }
}
