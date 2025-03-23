class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {
        // nums1의 모든 원소를 저장하는 HashSet (중복 제거)
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        
        // nums2를 순회하며, set1에 있는 값만 intersection에 추가 (중복 없이)
        Set<Integer> intersection = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }
        
        // HashSet에 저장된 교집합 원소들을 int 배열로 변환
        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            result[i++] = num;
        }
        return result;
    }
}