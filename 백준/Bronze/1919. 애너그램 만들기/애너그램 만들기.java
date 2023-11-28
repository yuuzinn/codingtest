import java.util.Scanner;

public class Main {
    static int answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstStr = sc.next();
        String secondStr = sc.next();
        int[] first = alCount(firstStr);
        int[] second = alCount(secondStr);
        for (int i = 0; i < first.length; i++) {
            answer += diffCount(first[i], second[i]);
        }
        System.out.println(answer);
    }
    static int[] alCount(String str) {
        int[] answer = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            answer[(int)c - 97]++;
        }
        return answer;
    }
    static int diffCount(int a, int b) {
        if (a > b) {
            return a - b;
        }
        return b - a;
    }
}
