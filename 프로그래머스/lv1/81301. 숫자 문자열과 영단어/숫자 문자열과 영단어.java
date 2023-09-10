import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

class Solution {
    public int solution(String s) {
        String[] split = s.split("");
        String result = "";
        String str = "";
        String ze = "";
        Map<String, String> map = getMap();
        for (int i = 0; i < split.length; i++) {
            // 숫자라면
            if (Pattern.matches("^[0-9]", split[i])) {
                result += split[i];
                continue;
            }
            str += split[i];
            // 합쳐진 문자열이 map에 있는지? -> 없다면 추가
            if (!map.containsKey(str)) {
                continue;
            }
            // 영문이라면
            if (map.containsKey(str)) {
                String value = map.get(str);
                result += value;
                str = ze;
            }
        }
        return Integer.parseInt(result);
    }

    private static Map<String, String> getMap() {
        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        return map;
    }
}