
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int brown, int yellow) {
    int first = 0;
    int end = 0;
    int ga = 0;
    int se = 0;
    int number = brown + yellow;
    double sqrt = Math.sqrt(number);
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= sqrt; i++) {
      if (number % i == 0) {
        if (Math.pow(i, 2) == number) {
          list.add(i);
        } else {
          list.add(i);
          list.add(number / i);
        }
      }
    }
    Collections.sort(list);
    while (true) {
//      int size = list.size();
      int tmp = 0;
      first += list.get(0);
      end += list.get(list.size() - 1);
      int fir = first - 2;
      int ed = end - 2;
      if (fir * ed != yellow) {
        listRemove(list);
        first = tmp;
        end = tmp;
      } else {
        ga = end;
        se = first;
        break;
      }
    }
    int[] answer = {ga, se};
    return answer;
  }
  public static void listRemove(List<Integer> list) {
    list.remove(0);
    list.remove(list.size() - 1);
  }
}