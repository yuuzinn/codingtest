import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        String inputStr = sc.next();
        String s = inputStr.toUpperCase();
        String[] split = s.split("");
        if (s.length() == 1) {
            System.out.println(s);
            return;
        }
        for (String character : split) {
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }
        // 엔트리를 리스트로 변환
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        // 값으로 엔트리를 정렬
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // 결과 출력
        if (entryList.get(0).getValue().equals(entryList.get(1).getValue())) {
            System.out.println("?");
            return;
        }
        System.out.println(entryList.get(0).getKey());
    }
}
