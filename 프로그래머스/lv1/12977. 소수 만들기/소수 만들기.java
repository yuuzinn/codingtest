class Solution {
    static int solutions;
    public int solution(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        for(int r = 3; r <= 3; r++) {
            comb1(nums, visited, 0, r);
        }
        return solutions;
    }
    static void comb1(int[] nums, boolean[] visited, int start, int r) {
        if(r == 0) {
            print(nums, visited);
        } else {
            for(int i = start; i < nums.length; i++) {
                visited[i] = true;
                comb1(nums, visited, i + 1, r - 1);
                visited[i] = false;
            }
        }
    }
    static void print(int[] nums, boolean[] visited) {
        int count = 0;
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            if(visited[i]) {
                System.out.print(nums[i] + " ");
                count++;
                result += nums[i];
            }
            if (count == 3) {
                    if (isDecimal(result)) {
                        solutions++;
                        result = 0;
                }
                count = 0;
            }
        }
        System.out.println();
    }

    public static boolean isDecimal(int a) {
        if (a < 2) {
            return false;
        }
        if (a == 2) {
            return true;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}