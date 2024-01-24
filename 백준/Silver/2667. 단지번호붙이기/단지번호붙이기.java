import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		boolean[][] visited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			String nextInt = sc.next();
			for (int j = 0; j < N; j++) {
				String[] split = nextInt.split("");
				arr[i][j] = Integer.parseInt(split[j]);
			}
		}
		int homeCount = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (visited[i][j] || arr[i][j] == 0) {
					continue;
				}
				list.add(bfs(i, j, arr, visited));
				homeCount++;
			}
		}
		System.out.println(homeCount);
		list.stream().sorted().forEach(System.out::println);
	}

	static class Node {
		int x;
		int y;

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	static int bfs(int x, int y, int[][] graph, boolean[][] visited) {
		int[] dx = {1, 0, -1, 0};
		int[] dy = {0, 1, 0, -1};

		// BFS에 사용할 큐를 생성해줍니다.
		Queue<Node> q = new LinkedList<Node>();

		// 큐에 BFS를 시작 할 노드 번호를 넣어줍니다.
		q.offer(new Node(x, y));

		// 시작노드 방문처리
		visited[x][y] = true;
		int count = 1;
		// 큐가 빌 때까지 반복
		while (!q.isEmpty()) {
			Node nodeIndex = q.poll();

			//큐에서 꺼낸 노드와 연결된 노드들 체크
			for (int i = 0; i < 4; i++) {
				int newX = nodeIndex.x + dx[i];
				int newY = nodeIndex.y + dy[i];
				if (newX < 0 || newX >= graph.length || newY < 0 || newY >= graph.length) {
					continue;
				}
				if (visited[newX][newY] || graph[newX][newY] == 0) {
					continue;
				}
				q.add(new Node(newX, newY));
				visited[newX][newY] = true;
				count++;
			}
		}

		// 탐색순서 리턴
		return count;
	}
}
