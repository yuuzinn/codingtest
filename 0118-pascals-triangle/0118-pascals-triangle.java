class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows <= 0) return res;
        
        res.add(new ArrayList<>(List.of(1)));

        for (int i = 1; i < numRows; i++) {
            List<Integer> pre = res.get(i - 1);
            List<Integer> list = new ArrayList<>(i + 1);
            //맨앞
            list.add(1);
            // 두 번째 인덱스부터 시작 n-1 + n
            for (int j = 1; j < i; j++) {
                list.add(pre.get(j - 1) + pre.get(j));
            }
            //맨뒤
            list.add(1);
            res.add(list);
        }
        return res;
    }
}