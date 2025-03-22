class Solution {
    public boolean isAnagram(String s, String t) {
    // 문자열 길이가 다르면 바로 false 반환
    if (s.length() != t.length()) {
        return false;
    }

    // 문자 빈도 저장
    Map<Character, Integer> sMap = new HashMap<>();
    Map<Character, Integer> tMap = new HashMap<>();

    // 각 문자열의 문자를 순회하면서 빈도수 저장
    for (int i = 0; i < s.length(); i++) {
        char cs = s.charAt(i);
        char ct = t.charAt(i);
        sMap.put(cs, sMap.getOrDefault(cs, 0) + 1);
        tMap.put(ct, tMap.getOrDefault(ct, 0) + 1);
    }

    // sMap의 각 키에 대해 tMap에 같은 키가 존재하며 값이 동일한지 확인
    for (Character key : sMap.keySet()) {
        if (!tMap.containsKey(key) || !sMap.get(key).equals(tMap.get(key))) {
            return false;
        }
    }
    return true;
}

}