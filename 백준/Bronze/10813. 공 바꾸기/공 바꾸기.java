import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bucket = sc.nextInt();
        int swapCount = sc.nextInt();
        int[] buckets = new int[bucket];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = i + 1;
        }
        for (int i = 0; i < swapCount; i++) {
            swap(buckets, sc.nextInt(), sc.nextInt());
        }
        for (int i = 0; i < buckets.length; i++) {
            System.out.print(buckets[i] + " ");
        }
    }
    public static void swap(int[] arr, int firstIndex, int secondIndex) {
        int tmp = arr[firstIndex - 1];
        arr[firstIndex - 1] = arr[secondIndex - 1];
        arr[secondIndex - 1] = tmp;
    }
}
