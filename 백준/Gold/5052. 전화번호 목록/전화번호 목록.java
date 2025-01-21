import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String[] phoneNumbers = new String[n];
            
            for (int i = 0; i < n; i++) {
                phoneNumbers[i] = scanner.next();
            }
            
            if (isConsistent(phoneNumbers)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
    
    public static boolean isConsistent(String[] phoneNumbers) {
        Trie trie = new Trie();
        
        for (String number : phoneNumbers) {
            if (!trie.insert(number)) {
                return false; 
            }
        }
        return true; 
    }
}

class Trie {
    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public boolean insert(String number) {
        TrieNode node = root;
        boolean isNewBranch = false;

        for (char c : number.toCharArray()) {
            int index = c - '0';

            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
                isNewBranch = true;
            }

            node = node.children[index];

            if (node.isEndOfNumber) {
                return false; 
            }
        }

        node.isEndOfNumber = true;

        return isNewBranch;
    }

    static class TrieNode {
        TrieNode[] children;
        boolean isEndOfNumber;

        public TrieNode() {
            children = new TrieNode[10]; 
            isEndOfNumber = false;
        }
    }
}
