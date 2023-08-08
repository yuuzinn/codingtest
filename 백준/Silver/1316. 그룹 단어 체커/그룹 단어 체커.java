import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (isChecker(sc.next())) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isChecker(String str) {
        Set<String> set = new HashSet<>();
        String tmp = "";
        String[] split = str.split("");
        for (int i = 0; i < split.length; i++) {
            // 처음으로 문자를 받을 때
            if (i == 0) {
                set.add(split[i]);
                tmp = split[i];
                continue;
            }
            // 다음이 연속으로 나오지 않은 건지?
            if (!tmp.equals(split[i])) {
                // 이전에 나왔는가?
                if (set.contains(split[i])) {
                    return false;
                }
                // 이전에 안 나왔는가?
                if (!set.contains(split[i])) {
                    tmp = split[i];
                    set.add(split[i]);
                    continue;
                }
            }
            // 다음이 연속으로 나온 건지?
            if (tmp.equals(split[i])) {
                tmp = split[i];
                continue;
            }
        }
        return true;
    }
}
