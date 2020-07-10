import java.util.*;

class Main {
  public static void main(String[] args) {
    int a[][] = {{1,1,1,1,1,1,1,1},
                 {1,1,1,1,1,1,0,0},
                 {1,0,0,1,1,0,1,1},
                 {1,2,2,2,2,0,1,0},
                 {1,1,1,2,2,0,1,0},
                 {1,1,1,2,2,2,2,0},
                 {1,1,1,1,1,2,1,1},
                 {1,1,1,1,1,2,2,1}
                };
    int posX = 3;
    int posY = 3;
    floodFill(a,posX,posY,4,a[posY][posX]);
    printMatrix(a);
  }

  static void floodFill(int[][] a, int r, int c, int toFill, int prevFill) {
    int rows = a.length;
    int col = a[0].length;

    if(r < 0 || r >= rows || c < 0 || c >= col || a[r][c]!=prevFill) {
      return;
    } 
    a[r][c] = toFill;

    floodFill(a,r-1,c,4,prevFill);
    floodFill(a,r+1,c,4,prevFill);
    floodFill(a,r,c-1,4,prevFill);
    floodFill(a,r,c+1,4,prevFill);
  }

  static void printMatrix(int [][] a) {
    int rows = a.length;
    int col = a[0].length;
    for(int i=0; i<rows; i++) {
      for(int j=0; j<col; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }
}