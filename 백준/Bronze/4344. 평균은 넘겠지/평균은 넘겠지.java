import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {

            int N = sc.nextInt();
            int[] people = new int[N]; 
            Double count = 0.0;
            Double grade = 0.0;
            for (int j = 0; j < people.length; j++) {
                people[j] = sc.nextInt();
            }
            for (int j = 0; j < people.length; j++) {
                grade += people[j];
            }
            Double average = grade / N;

            for (int j = 0; j < people.length; j++) {
                if (average < people[j]) {
                    count = count + 1;
                }
            }
            System.out.println(String.format("%.3f", (count / N) * 100) + "%");
        }
    }
}