class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int tmp = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int subNum = arr[i + 1] - arr[i];
            if (subNum < tmp) tmp = subNum;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int subNum = arr[i + 1] - arr[i];
            if(subNum == tmp) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                result.add(pair);
            }
        }
        return result;
    }
}