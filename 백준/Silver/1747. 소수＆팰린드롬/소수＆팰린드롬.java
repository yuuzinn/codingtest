import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = number; i <= 1000_0000; i++) {
            //1003001
            if (isPall(i) && isPrime(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    private static boolean isPall(int sc) {
        String string = Integer.toString(sc);
        String[] split = string.split(""); // 100 3 001
        List<String> list = new ArrayList<>(Arrays.asList(split)); // 5 || 1 2 3 2 1
        int index = list.size() - 1;
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() / 2) break;
            String s = list.get(i);
            String s1 = list.get(index);
            if (!s.equals(s1)) {
                return false;
            }
            index--;
        }
        return true;
    }
    static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
