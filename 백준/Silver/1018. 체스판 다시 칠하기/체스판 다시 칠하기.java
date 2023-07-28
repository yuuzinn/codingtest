import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            String row = sc.nextLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        int minRepaint = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int repaintCount = countRepaint(board, i, j);
                minRepaint = Math.min(minRepaint, repaintCount);
            }
        }

        System.out.println(minRepaint);
    }

    private static int countRepaint(char[][] board, int row, int col) {
        int repaintCount1 = 0;
        int repaintCount2 = 0;
        char startWithWhite = 'W';
        char startWithBlack = 'B';

        for (int i = row; i < row + 8; i++) {
            for (int j = col; j < col + 8; j++) {
                if (board[i][j] != startWithWhite) {
                    repaintCount1++;
                }
                if (board[i][j] != startWithBlack) {
                    repaintCount2++;
                }
                startWithWhite = (startWithWhite == 'W') ? 'B' : 'W';
                startWithBlack = (startWithBlack == 'W') ? 'B' : 'W';
            }
            startWithWhite = (startWithWhite == 'W') ? 'B' : 'W';
            startWithBlack = (startWithBlack == 'W') ? 'B' : 'W';
        }

        return Math.min(repaintCount1, repaintCount2);
    }
}
