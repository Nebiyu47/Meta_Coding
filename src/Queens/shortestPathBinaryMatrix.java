package Queens;

import java.util.LinkedList;
import java.util.Queue;

public class shortestPathBinaryMatrix {
    public static void main(String[] args) {

    }
    public static int shortestPathBinaryMatrix(int[][] grid){
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1; // Target cell is blocked
        }

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {-1, -1}, {1, -1}, {-1, 1}};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});

        boolean[][] visited = new boolean[n][n];
        visited[0][0] = true;

        int[][] distance = new int[n][n];
        distance[0][0] = 1;

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0];
            int y = cell[1];

            if (x == n - 1 && y == n - 1) {
                return distance[x][y];
            }

            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && grid[nx][ny] == 0 && !visited[nx][ny]) {
                    queue.offer(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    distance[nx][ny] = distance[x][y] + 1;
                }
            }
        }

        return -1; // Target cell cannot be reache
    }
}
