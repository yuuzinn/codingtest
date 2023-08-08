import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bucket = sc.nextInt();
        int count = sc.nextInt();
        int[] buckets = new int[bucket];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = i + 1;
        }
        for (int i = 0; i < count; i++) {
            reverse(buckets, sc.nextInt(), sc.nextInt());
        }
        for (int i = 0; i < buckets.length; i++) {
            System.out.print(buckets[i] + " ");
        }
    }
    public static void reverse(int[] arr, int inputLeftIndex, int inputRightIndex) { // 2, 5
        int leftIndex = inputLeftIndex - 1; // 1
        int rightIndex = inputRightIndex - 1; // 4
        int tmp1 = leftIndex;
        int tmp2 = rightIndex;
        int tmp3 = leftIndex;
        // 짝수일 때 -> 뺄셈이 홀수여야 한다.
        if (inputRightIndex - inputLeftIndex % 2 != 0) {
            for (int i = 0; i < (rightIndex - leftIndex + 1) / 2; i++) {
                swap(arr, tmp1, tmp2);
                tmp1++;
                tmp2--;
            }
        }
        // 홀수일 때 -> 덧셈이 짝수여야 한다.
        if (inputRightIndex - inputLeftIndex % 2 == 0) {
            int i1 = (tmp1 + tmp2) / 2;
            while (tmp3 == i1) {
                swap(arr, tmp1, tmp2);
                tmp1++;
                tmp2--;
                tmp3++;
            }
//            for (int i = 0; i < ; i++) {
//                
//            }
        }
    }
    public static void swap(int[] arr, int firstIndex, int secondIndex) {
        int tmp = arr[firstIndex];
        // 첫번째 요소 변경
        arr[firstIndex] = arr[secondIndex];
        // 두번째 요소 변경
        arr[secondIndex] = tmp;
    }
}
