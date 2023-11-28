import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputString = br.readLine();
        String[] split = inputString.split("");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        LinkedList<String> first = new LinkedList<>(Arrays.asList(split));
        LinkedList<String> second = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            String next = br.readLine();
            String[] split1 = next.split(" ");
            if (split1[0].equals("P")) {
                // 왼쪽에 추가
                first.addLast(split1[1]);
            } else if (split1[0].equals("L")) {
                // 왼쪽으로
                if (first.isEmpty()) continue;
                String s = first.pollLast();
                second.addFirst(s);
            } else if (split1[0].equals("D")) {
                // 오른쪽으로
                if (second.isEmpty()) continue;
                String s1 = second.pollFirst();
                first.addLast(s1);
            } else { // B
                if (first.isEmpty()) continue;
                first.removeLast();
            }
        }
        for (String s : first) {
            bw.write(s);
        }
        for (String s : second) {
            bw.write(s);
        }
        bw.newLine();
        bw.close();
    }
}
