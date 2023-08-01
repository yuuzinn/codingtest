import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		Main test = new Main();
		for (int i = 0; i < n; i++) {
			int solution = test.solution(sc.next());
            System.out.println(solution);
		}
	}
	public int solution(String str) {
		int count = 0;
		int result = 0;

		String[] split = str.split("");
		for (int i = 0; i < str.length(); i++) {
			if (split[i].equals("O")) {
				count = count + 1;
				result += count;
			}
			if (split[i].equals("X")) {
				count = 0;
				result += count;
			}
		}
		return result;
	}
}