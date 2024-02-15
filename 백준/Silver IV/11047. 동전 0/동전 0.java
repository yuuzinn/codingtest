import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int count = 0;
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (K >= arr[i]) { // 현재 가치의 동전을 사용할 수 있는 경우
                count += K / arr[i];
                K %= arr[i]; // 나머지 계산
            }
        }
        System.out.println(count);
    }
}

