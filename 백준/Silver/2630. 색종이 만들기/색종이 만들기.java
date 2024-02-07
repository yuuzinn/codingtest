import java.util.Scanner;

public class Main {
    static int[][] arr;
    static Number count = new Number();
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        divide(0, 0, N);

        System.out.println(count.zeroCount);
        System.out.println(count.oneCount);
    }
    static class Number {
        int zeroCount;
        int oneCount;

        public Number() {
            this.zeroCount = 0;
            this.oneCount = 0;
        }
        public void numberCheckCountPlus(int value) {
            if (value == 0) {
                zeroCount++;
            } else if (value == 1) {
                oneCount++;
            }
        }
    }
    // 체크
    static boolean check(int x, int y, int size) {
        int number = arr[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (number != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    // 나누기
    static void divide(int x, int y, int size) {
        // 모든 면이 같은 수일 경우
        if (check(x, y, size)) {
            if (arr[x][y] == 0) {
                count.zeroCount++;
            } else  {
                count.oneCount++;
            }
            return;
        }
        // 나누기
        int divideSize = size / 2;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                divide(x + divideSize * i, y + divideSize * j, divideSize);
            }
        }
    }
}