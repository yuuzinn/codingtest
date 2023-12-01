import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 사람 수
		int K = sc.nextInt(); // 몇 번째
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			list.add(i, i + 1);
		}
		int count = 1;
		System.out.print("<");
		while (list.size() >= 1) {
			if (count == K) {
				if (list.size() == 1) {
					System.out.print(list.getFirst() + ">");
					break;
				}
				Integer integer = list.pollFirst();
				System.out.print(integer + ", ");
				count = 1;
				continue;
			}
			count++;
			Integer first = list.pollFirst();
			list.add(first);
			if (list.size() == 1) {
				System.out.print(list.getFirst() + ">");
				break;
			}
		}
	}
}
