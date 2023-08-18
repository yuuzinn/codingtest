import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        List<claz> list = new ArrayList<>();
        String[] answer = {};
        for (String str : strings) {
            String split = str.split("")[n];
            list.add(new claz(str, split));
        }
        Collections.sort(list);
        return list.stream().map(i -> i.key).toArray(String[]::new);
    }
    static class claz implements Comparable<claz>{
        String key; // car
        String value; // a
        public claz (String key, String value) {
            this.key = key;
            this.value = value;
        }
        @Override
    	public int compareTo(claz object) {
            if (this.value.equals(object.value)) {
                return this.key.compareTo(object.key);
            }
            return this.value.compareTo(object.value);
	    }
    }
}