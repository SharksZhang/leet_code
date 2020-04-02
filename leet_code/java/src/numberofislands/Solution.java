package numberofislands;

import java.util.LinkedList;

class Solution {
	public int numIslands(char[][] grid) {
		if (grid.length == 0 || grid[0].length == 0) {
			return 0;
		}
		int result = 0;
		int[][] mark = new int[grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (mark[i][j] != 1 && grid[i][j] == '1') {
					bfs(grid, mark, i, j);
					result++;
				}
			}
		}
		return result;
	}

	public void bfs(char[][] grid, int[][]mark, int x, int y) {
		int directionsX[] = { 1, 0, -1, 0 };
		int directionsY[] = { 0, 1, 0, -1 };
		LinkedList<Integer> queueX = new LinkedList<>();
		LinkedList<Integer> queueY = new LinkedList<>();
		queueX.offer(x);
		queueY.offer(y);
		mark[x][y] = 1;

		while (!queueX.isEmpty() && !queueY.isEmpty()) {

			x = queueX.poll();
			y = queueY.poll();
			for (int i = 0; i < directionsX.length; i++) {
				int newX = x + directionsX[i];
				int newY = y + directionsY[i];
				if (newX < 0 || newX >= grid.length || newY < 0 || newY >= grid[0].length) {
					continue;
				}
				if (mark[newX][newY] != 1 && grid[newX][newY] == '1') {
					queueX.offer(newX);
					queueY.offer(newY);
					mark[newX][newY] = 1;
				}

			}
		}

	}

//	public void dfs(char[][] grid,  int[][] mark, int x, int y) {
//
//		int directionsX[] = { 1, 0, -1, 0 };
//		int directionsY[] = { 0, 1, 0, -1 };
//		mark[x][y] = 1;
//
//		for (int i = 0; i < directionsX.length; i++) {
//			int newX = x + directionsX[i];
//			int newY = y + directionsY[i];
//			if(newX < 0 || newX>= grid.length || newY < 0 || newY >= grid[0].length){
//				continue;
//			}
//			if (mark[newX][newY] != 1 && grid[newX][newY] == '1') {
//				dfs(grid, mark, newX, newY);
//			}
//		}
//	}
}