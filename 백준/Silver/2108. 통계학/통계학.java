import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        num1(arr, N);
        num2(arr, N);
        num3(arr);
        num4(arr[N - 1] - arr[0]);
    }

    private static void num4(int arr) {
        System.out.println(arr);
    }

    private static void num3(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        List<Integer> modes = new ArrayList<>();

        for (int num : arr) {
            int frequency = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, frequency);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                modes.clear();
                modes.add(num);
            } else if (frequency == maxFrequency) {
                modes.add(num);
            }
        }

        Collections.sort(modes);
        int secondMinMode = modes.size() > 1 ? modes.get(1) : modes.get(0);

        System.out.println(secondMinMode);
    }

    private static void num2(int[] arr, int N) {
        Arrays.sort(arr);
        System.out.println(arr[N / 2]);
    }

    private static void num1(int[] arr, int N) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        double result1 = (double) result / N;
        System.out.println(Math.round(result1));
    }
}
