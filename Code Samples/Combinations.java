import java.util.*;
public class Combinations{
  static int[][] cr = new int[33][33];
  public static int comb(int n , int r)
  {
    if(cr[n][r] != -1)
      return cr[n][r];
    if( r == 0 || n == r)
      return 1;
    int ans = (comb(n-1,r)+comb(n-1,r-1)) % (int)1E9;
    return cr[n][r] = ans;
  }
  
  public static void main(String[] args){
    for(int i = 0; i <= 32; i++){
      Arrays.fill(cr[i], -1);
    }
    System.out.println(comb(10,2));
  }
}