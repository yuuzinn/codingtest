class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // nums2 배열을 Set을 통해 중복제거함
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int j : nums1) {
            set1.add(j);
        }
        for (int j : nums2) {
            set2.add(j);
        }
        // set 의 원소를 하나씩 nums1에 돌면서 찾아보기, count 만큼 배열 자리 만들기
        if (set1.size() < set2.size()) {
            Iterator<Integer> iterator = set2.iterator();
            while (iterator.hasNext()) {
                int num = iterator.next();
                if (set1.contains(num)) {
                    list.add(num);
                }
            }
        } else {
            Iterator<Integer> iterator = set1.iterator();
            while (iterator.hasNext()) {
                int num = iterator.next();
                if (set2.contains(num)) {
                    list.add(num);
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}