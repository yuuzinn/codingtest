class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length() == 0) return t.charAt(0);
        int [] s1 = new int[26];
        for(int i=0; i<s.length(); i++){
            s1[s.charAt(i)-97]++;
        }
        int [] s2 = new int[26];
        for(int i=0; i<t.length(); i++){
            s2[t.charAt(i)-97]++;
        }
        for(int i=0; i<t.length();i++){
            if(s2[t.charAt(i)-97] != s1[t.charAt(i)-97]){
                return t.charAt(i);
            }
        }
        return 'a';
    }
}