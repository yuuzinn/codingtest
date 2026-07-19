class Solution {
    public int maximumWealth(int[][] accounts) {
        int money = 0;
        int after = 0;
        int answer = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                after += accounts[i][j];
            }
            
            if (money <= after) {
                money = after;
            }
            after = 0;
        }
        return money;
    }
}