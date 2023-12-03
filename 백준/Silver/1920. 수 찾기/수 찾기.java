import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arrN = new int[N];
        for (int i = 0; i < N; i++) {
            arrN[i] = sc.nextInt();
        }
        Arrays.sort(arrN);
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int aM = sc.nextInt();
            if (aM < arrN[0] || aM > arrN[arrN.length - 1]) {
                System.out.println(0);
            } else if (aM == arrN[N / 2]) {
                System.out.println(1);
            } else if (aM > arrN[N / 2]) {
                int low = N / 2 + 1;
                int high = N - 1;
                boolean b = binarySearch(arrN, aM, low, high);
                System.out.println(b ? 1 : 0);
            } else {
                int low = 0;
                int high = N / 2 - 1;
                boolean b = binarySearch(arrN, aM, low, high);
                System.out.println(b ? 1 : 0);
            }
        }
    }
    static boolean binarySearch(int[] arr, int target, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
