import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] arr = new int[10];
    static int answer;

    public static void main(String[] args) {
        Arrays.fill(arr, 0);
        Scanner sc = new Scanner(System.in);
        int roomNumber = sc.nextInt();
        String string = Integer.toString(roomNumber);
        setCount(string);
        answer = (arr[6] + arr[9]);
        if (answer % 2 != 0) answer++;
        answer = answer / 2;
        for (int i = 0; i < arr.length; i++) {
            if (i == 6 || i == 9) continue;
            if (answer <= arr[i]) answer = arr[i];
        }
        System.out.println(answer);
    }

    public static void setCount (String str) {
        String[] split = str.split("");
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            int i1 = Integer.parseInt(s);
            arr[i1]++;
        }
    }
}
