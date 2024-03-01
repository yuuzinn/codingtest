import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); 

        Set<String> wordSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            wordSet.add(scanner.nextLine());
        }

        List<String> wordList = new ArrayList<>(wordSet);

        Collections.sort(wordList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                return s1.length() - s2.length();
            }
        });

        for (String word : wordList) {
            System.out.println(word);
        }
    }
}
