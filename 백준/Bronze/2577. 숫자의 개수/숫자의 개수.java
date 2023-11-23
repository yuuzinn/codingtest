import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int i3 = sc.nextInt();
        int[] ints = arrCount(i1, i2, i3);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
    public static int[] arrCount (int i1, int i2, int i3) {
        int[] arr = new int[10];
        Arrays.fill(arr, 0);
        int i = i1 * i2 * i3;
        String str = Integer.toString(i);
        String[] split = str.split("");
        for (int j = 0; j < split.length; j++) {
            String s = split[j];
            int parseInt = Integer.parseInt(s);
            arr[parseInt]++;
        }
        return arr;
    }
}
