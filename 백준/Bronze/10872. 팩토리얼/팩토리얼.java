import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		in.close();
		
		int sum = test(N);
		System.out.println(sum);
		
	}
	
	public static int test(int N) {
		if(N <= 1) return 1;	
		return N * test(N - 1);		
	}
 
}