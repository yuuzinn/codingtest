// public boolean canConstruct1(String ransomNote, String magazine) {
//         if (ransomNote.length() > magazine.length()) return false;
//         String[] str = magazine.split("");
//         String[] split = ransomNote.split("");
//         List<String> ransomList = new ArrayList<>(Arrays.asList(split));
//         List<String> magazineList = new ArrayList<>(Arrays.asList(str));
//         for (int i = 0; i < split.length; i++) { // 10만개
//             if (magazineList.contains(split[i])) { // 10만개
//                 ransomList.remove(split[i]);
//                 magazineList.remove(split[i]);
//             }
//         }
//         if (ransomList.size() != 0) return false;
//         return true;
//     }
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // aab | baa
        if (ransomNote.length() > magazine.length()) return false;
        String[] magaArr = magazine.split("");
        String[] ransomArr = ransomNote.split("");
        for (int i = 0; i < ransomArr.length; i++) { // 10만개
            // aab
            boolean flag = false;
            for (int j = 0; j < magaArr.length; j++) {
                // baa
                if (ransomArr[i].equals(magaArr[j])) {
                    magaArr[j] = "1";
                    flag = true;
                    break;
                }
            }
            if (flag) {
                ransomArr[i] = "0";
            }
        }
        for (int i = 0; i < ransomArr.length; i++) {
            if (!ransomArr[i].equals("0")) return false;
        }
        return true;
    }
}