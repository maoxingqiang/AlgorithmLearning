package com.company.meduim;


public class DropEgg2 {
    /**
     * @param m: the number of eggs
     * @param n: the number of floors
     * @return: the number of drops in the worst case
     */
    public int dropEggs2(int m, int n) {
        // write your code here
        int[][] result = new int[m][n];
        for (int i = 1; i <= m;i++) {
            result[i][1] = 0;
        }

        for (int j = 1; j <=n; j++) {
            result[1][j] = j;
        }

        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++){
                for (int k = 1; k <= n ;k++) {
                    result[i][j] =Integer.MAX_VALUE;
                    result[i][j] = Math.min(result[i][j], 1+ Math.max(result[i-1][j-1], result[i][j-k]));
                }

            }
        }
        return result[m][n];
    }
}
