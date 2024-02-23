import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int endX = sc.nextInt();
        int endY = sc.nextInt();
        long oneBlockTime = sc.nextLong();
        long oneCrossTIme = sc.nextLong();

        int minD = Math.min(endX, endY);
        int maxD = Math.max(endX, endY);
        int totalD = endX + endY;

        long justOneBlock = totalD * oneBlockTime;
        long crossAndBlock = minD * oneCrossTIme + oneBlockTime * (maxD - minD);
        long zigzag = ((totalD & 1) == 0) ? maxD * oneCrossTIme : (maxD - 1) * oneCrossTIme + oneBlockTime;

        System.out.println(Math.min(zigzag, Math.min(justOneBlock, crossAndBlock)));
    }
}
