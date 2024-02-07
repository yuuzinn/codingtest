import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        boolean[][] visited = new boolean[n][m];

        return bfs(maps, visited, n, m);
    }

    private static int bfs(int[][] maps, boolean[][] visited, int n, int m) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});
        visited[0][0] = true;

    
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int count = current[2];

            // 도착
            if (x == n - 1 && y == m - 1) {
                return count;
            }

            // 상하좌우
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 이동 가능한 위치, 방문하지 않았다면 큐 삽입
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.offer(new int[]{nx, ny, count + 1});
                    visited[nx][ny] = true;
                }
            }
        }

        // 상대 팀 진영에 도착할 수 없는 경우 -1 반환
        return -1;
    }
}
