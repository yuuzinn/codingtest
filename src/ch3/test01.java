package ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String count = sc.nextLine();
//        String data = sc.nextLine();
//        int[] ints = Arrays.stream(data.split("")).mapToInt(Integer::parseInt).toArray();
//        int result = 0;
//        for (int i = 0; i < Integer.parseInt(count); i++) {
//            result +=ints[i];
//        }
//        System.out.println(result);
//        sc.close();
        String count = sc.nextLine();
        String[] data = sc.nextLine().split("");
        int result = 0;
        for (int i = 0; i < Integer.parseInt(count); i++) {
            result += Integer.parseInt(data[i]);
        }
        System.out.println(result);
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        String sNum = sc.next();
//        char[] cNum = sNum.toCharArray();
//        int sum = 0;
//        for (int i = 0; i < cNum.length; i++) {
//            sum += cNum[i] - '0';
//        }
//        System.out.println(sum);
//    }
}
