import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        Graph graph = new Graph(y + 1); // 0부터 y까지의 노드를 가진 그래프 생성
        buildGraph(graph, x, y, n); // 그래프 구성

        return findMinOperations(graph, x, y);
    }

    // 그래프 구성
    static void buildGraph(Graph graph, int x, int y, int n) {
        for (int i = x; i <= y; i++) {
            if (i + n <= y) {
                graph.addEdge(i, i + n); // x에 n을 더하는 연산
            }
            if (i * 2 <= y) {
                graph.addEdge(i, i * 2); // x를 2배하는 연산
            }
            if (i * 3 <= y) {
                graph.addEdge(i, i * 3); // x를 3배하는 연산
            }
        }
    }

    // 최소 연산 횟수 구하기
    static int findMinOperations(Graph graph, int x, int y) {
        boolean[] visited = new boolean[y + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        visited[x] = true;

        int[] operations = new int[y + 1];

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();

            if (currentNode == y) {
                return operations[currentNode];
            }

            for (int neighbor : graph.adj[currentNode]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                    operations[neighbor] = operations[currentNode] + 1;
                }
            }
        }

        return -1; // y로 변환할 수 없는 경우
    }
    // DFS로 풀어보기
    class Graph {
        private int v;
        private LinkedList<Integer> adj[];

        public Graph(int v) {
            this.v = v;
            this.adj = new LinkedList[v];
            for (int i = 0; i < v; i++) {
                adj[i] = new LinkedList<>();
            }
        }

        void addEdge(int v, int w) {
            this.adj[v].add(w);
        }
    }
}
