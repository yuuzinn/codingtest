package ch3;

public class test05 {
    public static void main(String[] args) {
        test05 test = new test05();
        String solution = test.solution("...!@BaT#*..y.abcdefghijklm");
        System.out.println(solution);
    }
    public String solution(String new_id) {
        String answer = "";
        answer = new_id.toLowerCase();
        System.out.println("1 answer = " + answer);
        answer = answer.replaceAll("[^a-z0-9.\\-_]", "");
        System.out.println("2 answer = " + answer);
        answer = answer.replaceAll("[.]{2,}", "."); // 2¹øÀÌ»ó
        System.out.println("3 answer = " + answer);
        answer = answer.replaceAll("^[.]|[.]$", "");
        System.out.println("4 answer = " + answer);
        // 5
        if (answer.equals("")) {
            answer = "a";
        }
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }
        System.out.println("6 answer = " + answer);

        if (answer.length() <= 2) {
            char endStr = answer.charAt(answer.length() - 1);
            while (answer.length() < 3) {
                answer += endStr;
            }
        }
        return answer;
    }
}
