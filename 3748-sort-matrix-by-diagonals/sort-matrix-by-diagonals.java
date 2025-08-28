import java.util.*;

class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            sortByIndex(grid, i, 0); 
            if (i != 0) sortByIndex(grid, 0, i); 
        }

        return grid;
    }

    public void sortByIndex(int[][] grid, int i, int j) {
        int n = grid.length;
        int len = n - Math.max(i, j);
        int[] a = new int[len];
        getDiagonal(grid, a, i, j);

        if (j == 0) {
            Arrays.sort(a);
            reverse(a);
        } else {
            Arrays.sort(a);
        }

        editGrid(grid, a, i, j);
    }

    public void getDiagonal(int[][] grid, int[] a, int i, int j) {
        int x = i, y = j, idx = 0;
        while (x < grid.length && y < grid.length) {
            a[idx++] = grid[x][y];
            x++;
            y++;
        }
    }

    public void editGrid(int[][] grid, int[] a, int i, int j) {
        int x = i, y = j, idx = 0;
        while (x < grid.length && y < grid.length) {
            grid[x][y] = a[idx++];
            x++;
            y++;
        }
    }
    public void reverse(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
