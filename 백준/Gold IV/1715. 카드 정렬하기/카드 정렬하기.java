import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            pq.offer(scanner.nextInt());
        }

        int totalComparisons = 0;

        while (pq.size() > 1) {
            int sum = pq.poll() + pq.poll(); 
            totalComparisons += sum; 
            pq.offer(sum);
        }

        System.out.println(totalComparisons);
    }
}
