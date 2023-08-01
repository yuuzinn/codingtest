import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main test = new Main();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int solution = test.solution(A);
		int solution1 = test.solution(B);
		if (solution > solution1) {
			System.out.print(solution);
            return;
		}
		System.out.print(solution1);
	}
	public int solution(int x) {
		Integer i = Integer.valueOf(x);
		String result = "";
		String s = i.toString();
		String[] split = s.split("");
		result += split[2];
		result += split[1];
		result += split[0];
		return Integer.parseInt(result);
	}
}