import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = scan.nextInt();
		int result = 1000 - total;
		int minCoinCnt = 0;
		int coins[] = {500, 100, 50, 10, 5, 1};

		for (int coin : coins){
			minCoinCnt += (result/coin);
			result %= coin;
		}

		System.out.println(minCoinCnt);
	}
}