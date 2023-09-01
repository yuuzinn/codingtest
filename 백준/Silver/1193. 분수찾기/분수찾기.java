import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int n = 1; // 현재 분자
        int m = 1; // 현재 분모
        boolean increasing = true; // 지그재그 패턴을 제어하는 변수

        for (int i = 1; i < X; i++) {
            // 지그재그 패턴에 따라 분자와 분모를 증가 또는 감소시킴
            if (increasing) {
                if (n == 1) {
                    increasing = false;
                    m++;
                } else {
                    n--;
                    m++;
                }
            } else {
                if (m == 1) {
                    increasing = true;
                    n++;
                } else {
                    n++;
                    m--;
                }
            }
        }

        System.out.println(n + "/" + m);
    }
}
