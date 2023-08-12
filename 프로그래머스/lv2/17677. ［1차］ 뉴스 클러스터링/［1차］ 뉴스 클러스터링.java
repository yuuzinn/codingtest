import java.util.*;

class Solution {
    public static int solution(String str1, String str2) {
        Map<String, Integer> multiset1 = makeMultiset(str1);
        Map<String, Integer> multiset2 = makeMultiset(str2);

        int unionSize = getUnionSize(multiset1, multiset2);
        int intersectionSize = getIntersectionSize(multiset1, multiset2);

        if (unionSize == 0 && intersectionSize == 0) {
            return 65536;
        }

        double jaccardSimilarity = (double) intersectionSize / unionSize;
        int answer = (int) (jaccardSimilarity * 65536);

        return answer;
    }

    private static Map<String, Integer> makeMultiset(String str) {
        Map<String, Integer> multiset = new HashMap<>();
        str = str.toUpperCase();

        for (int i = 0; i < str.length() - 1; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(i + 1);

            if (Character.isLetter(c1) && Character.isLetter(c2)) {
                String element = "" + c1 + c2;
                multiset.put(element, multiset.getOrDefault(element, 0) + 1);
            }
        }

        return multiset;
    }

    private static int getUnionSize(Map<String, Integer> multiset1, Map<String, Integer> multiset2) {
        int unionSize = 0;
        for (String key : multiset1.keySet()) {
            unionSize += Math.max(multiset1.get(key), multiset2.getOrDefault(key, 0));
        }
        for (String key : multiset2.keySet()) {
            if (!multiset1.containsKey(key)) {
                unionSize += multiset2.get(key);
            }
        }
        return unionSize;
    }

    private static int getIntersectionSize(Map<String, Integer> multiset1, Map<String, Integer> multiset2) {
        int intersectionSize = 0;
        for (String key : multiset1.keySet()) {
            if (multiset2.containsKey(key)) {
                intersectionSize += Math.min(multiset1.get(key), multiset2.get(key));
            }
        }
        return intersectionSize;
    }
}