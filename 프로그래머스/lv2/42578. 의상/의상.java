import java.util.HashMap;
import java.util.Iterator;
class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>(); // key -> type, value -> count

        for (String[] clothe : clothes) {
            String type = clothe[1];
            // type 이라는 key에 해당하는 value가 있으면 가져오고, 아니라면? 0을 default로 지정함.
            // value는 해당 옷 종류의 개수라서, 이전의 값이 있으면 기존에 +1, 없으면 그냥 1
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        // 입지 않는 경우를 추가하여 모든 조합 계산하기
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;

        while(it.hasNext())
            answer *= it.next().intValue() + 1;

        // 아무종류의 옷도 입지 않는 경우 제외하기
        return answer - 1;
    }
}