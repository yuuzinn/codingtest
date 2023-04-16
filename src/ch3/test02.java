package ch3;

import java.util.Arrays;
import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        double maxScore = arr[arr.length - 1];
        double result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += (arr[i] / maxScore) * 100;
        }
        double v = result / arr.length;
        System.out.println(v);
    }
}
