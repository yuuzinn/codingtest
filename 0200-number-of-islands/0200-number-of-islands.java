class Solution {
    public int numIslands(char[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		int ans = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				if (grid[i][j] == '1') {
					ans++;
					grid[i][j] = '0';

					Queue<int[]> queue = new LinkedList<>();
					queue.offer(new int[]{i, j});
					
					while (!queue.isEmpty()) {
						int[] cur = queue.poll();
						int r = cur[0];
						int c = cur[1];
						
						int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
						for (int[] d : dir) {
							int nr = r + d[0];
							int nc = c + d[1];
							
							if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == '1') {
								grid[nr][nc] = '0';
								queue.offer(new int[]{nr, nc});
							}
						}
					}
				}
			}
		}
		return ans;
	}
}