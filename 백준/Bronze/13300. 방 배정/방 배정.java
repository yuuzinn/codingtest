import java.util.Scanner;

public class Main {
    static int roomCount;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intoStudent = sc.nextInt();
        int maxStudent = sc.nextInt();
        int[] women = new int[7];
        int[] men = new int[7];

        for (int i = 0; i < intoStudent; i++) {
            int sex = sc.nextInt();
            int grade = sc.nextInt();

            if (sex == 0) { // 여학생인 경우
                women[grade]++;
            } else { // 남학생인 경우
                men[grade]++;
            }
        }

        for (int i = 1; i <= 6; i++) {
            // 필요한 방의 최소 개수 + 홀짝 구분
            roomCount += (women[i] / maxStudent) + (women[i] % maxStudent == 0 ? 0 : 1);
        }
        for (int i = 1; i <= 6; i++) {
            roomCount += (men[i] / maxStudent) + (men[i] % maxStudent == 0 ? 0 : 1);
        }

        System.out.println(roomCount);
    }
}
