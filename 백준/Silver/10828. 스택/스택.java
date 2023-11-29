import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int read = Integer.parseInt(br.readLine());
        for (int i = 0; i < read; i++) {
            String next = br.readLine();
            String[] split = next.split(" ");
            if (split[0].equals("push")) {
                stack.push(Integer.parseInt(split[1]));
            } else if (split[0].equals("pop")) {
                if (stack.isEmpty()) {
                    bw.write("-1");
                    bw.newLine();
                    continue;
                }
                Integer pop = stack.pop();
                String string = pop.toString();
                bw.write(string);
                bw.newLine();
            } else if (split[0].equals("size")) {
                int size = stack.size();
                String string = Integer.toString(size);
                bw.write(string);
                bw.newLine();
            } else if (split[0].equals("empty")) {
                if (stack.isEmpty()) {
                    bw.write("1");
                    bw.newLine();
                    continue;
                }
                bw.write("0");
                bw.newLine();
            } else { // top
                if (stack.isEmpty()) {
                    bw.write("-1");
                    bw.newLine();
                    continue;
                }
                Integer peek = stack.peek();
                String string = peek.toString();
                bw.write(string);
                bw.newLine();
            }
        }
        bw.newLine();
        bw.close();
    }
}
