package ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class test03 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt(); // 데이터 개수
//        int M = sc.nextInt(); // 합을 구하는 횟수
//
//        int[] num = new int[N];
//        int[] sum = new int[N];
//        for (int i = 0; i < N; i++) {
//            num[i] = sc.nextInt();
//            sum[i] = sum[i-1] + num[i];
//        }
//        for (int i = 0; i < M; i++) {
//            int i1 = sc.nextInt();
//            int j = sc.nextInt();
//            System.out.println(sum[j] - sum[i - 1]);
//        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int su = Integer.parseInt(st.nextToken());
        int qu = Integer.parseInt(st.nextToken());
        long[] S = new long[su + 1];
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= su; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int q = 0; q < qu; q++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(S[j] - S[i - 1]);
        }
    }
}
// 52p
