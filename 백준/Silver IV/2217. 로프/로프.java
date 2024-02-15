import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] weights = new int[N];
        for (int i = 0; i < N; i++) {
            weights[i] = sc.nextInt();
        }
        int maxWeight = getMaxWeight(weights);
        System.out.println(maxWeight);
    }

    public static int getMaxWeight(int[] weights) {
        Arrays.sort(weights); 
        int maxWeight = 0;
        for (int i = 0; i < weights.length; i++) {
            int potentialWeight = weights[i] * (weights.length - i); 
            maxWeight = Math.max(maxWeight, potentialWeight);
        }
        return maxWeight;
    }
}
