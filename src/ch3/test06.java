package ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test06 {

  public static void main(String[] args) {

  }
  public String solution(String s) {
    String answer = "";
    String[] split = s.split("");
    StringBuilder sb = new StringBuilder();
    Map<String, String> map = new HashMap<>();
    List<String> list = new ArrayList<>();
    for (int i = 0; i < split.length; i++) {
      if (!map.containsKey(split[i])) {
        map.put(split[i], "a");
        list.add(split[i]);
        continue;
      }
      list.remove(split[i]);
      System.out.println(map);
    }
    // System.out.println(map);
    Collections.sort(list);
    for (int i = 0; i < list.size(); i++) {
      answer += list.get(i);
    }
    return answer;
  }
}
