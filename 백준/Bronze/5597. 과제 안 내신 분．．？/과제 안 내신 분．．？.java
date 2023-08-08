import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(i + 1);
        }
        for (int i = 0; i < 28; i++) {
            isChecked(list, sc.nextInt());
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
    static void isChecked(List<Integer> list, int param) {
        list.remove(Integer.valueOf(param));
    }
}
