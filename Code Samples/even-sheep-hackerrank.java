/*
On a farm divided into a grid of cells, every cell either has grass on it or is empty.
If two adjacent cells have grass, they will belong to a common field. The common field extends in all directions to all adjacent cells with grass. So, if cell A is adjacent to cell B and cell B is adjacent to cell C, and all three have grass, then they all lie in the same field. If a cell with grass has no adjacent cell with grass, then it will be a field 1-cell field.
Every field must feed one sheep or one cow. Each field of grass cannot be shared between cows and sheep. If each field can have one sheep or one cow and never both, how many possible unique arrangements can you make such that, there are even number of sheep in the grid farm?

Input Format
The first line contains R (number of rows) and C (number of columns), separated by a space. Each of the next R lines contains a string with length equal to C, with no spaces. The string has the character Y to denote a cell with grass and N to denote a cell with no grass.

Constraints
1 ≤ R, C ≤ 5000

Output Format
S, an integer that contains the number of arrangements possible, modulo 1,000,000,007.

Sample Input
3 4
YNNY
NYNY
NYNN

Sample Output
4

Explanation
There are three fields, as follows:
|1|-|-|2|
|-|3|-|2|
|-|3|-|-|

First Solution (zero sheep)
Cow
Cow
Cow

Second Solution (two sheep)
Sheep
Cow
Sheep

Third Solution (two sheep)
Sheep
Sheep
Cow

Fourth Solution (two sheep)
Cow
Sheep
Sheep

So, the total number of ways is 4.
*/

import java.util.*;

public class Solution {
    private static int n,m;
    public static int numIslands(char[][] grid) {
        int count = 0;
        if (n == 0) return 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++)
                if (grid[i][j] == 'Y') {
                    DFS(grid, i, j);
                    ++count;
                }
        }    
        return count;
    }

    private static void DFS(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != 'Y') return;
        grid[i][j] = 'N';
        DFS(grid, i + 1, j);
        DFS(grid, i - 1, j);
        DFS(grid, i, j + 1);
        DFS(grid, i, j - 1);
    }
    
    /*
    Note: The data type for temp matters. If the number of FIELDS increase, the value in variable roles over and gives negetive values for Permutation.
    */
    private static int permutations(int n) {
        int count;
        if(n%2 == 0) {
            count = 2;
            for(int i=2; i<n-1; i+=2) {
                long temp = 1;
                for(int j=i+1;j<=n;j++) temp *= j;
                for(int j=2;j<=n-i;j++) temp /= j;
                count += temp;
            }
        }
        else {
            count = 1;
            for(int i=2; i<n; i+=2) {
                long temp = 1;
                for(int j=n-i+1;j<=n;j++) temp *= j;
                for(int j=2;j<=i;j++) temp /= j;
                count += temp;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dim = sc.nextLine().trim().split(" ");
        n = Integer.parseInt(dim[0]);
        m = Integer.parseInt(dim[1]);
        char[][] mat = new char[n][m];
        for(int i=0;i<n;i++) {
            mat[i] = sc.nextLine().trim().toCharArray();
        }
        int islands = numIslands(mat);
        // System.out.println(islands);
        int count = permutations(islands);
        System.out.println(count);
    }
}
