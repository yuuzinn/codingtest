class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        track(list, new StringBuilder(), 0, 0, n);
        return list;
    }
    private void track(List<String> list, StringBuilder cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            list.add(cur.toString());
            return;
        }

        if (open < max) {
            cur.append("(");
            track(list, cur, open + 1, close, max);
            cur.deleteCharAt(cur.length() - 1);
        }
        
        if (close < open) {
            cur.append(")");
            track(list, cur, open, close + 1, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}