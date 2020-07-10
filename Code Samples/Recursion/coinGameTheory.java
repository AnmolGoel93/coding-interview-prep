import java.util.*;
/*
Two smart player play the game. Aim being, collection of max money.
Player can pick either coin at start or at the end.
Player pick one after the other.
So, tell if you begin the game, what is the max amount you can collect?
 */

class Main {
  static int count = 0;
  
  public static void main(String[] args) {
    int[] coins = { 1,5,7,30,2,4,6 };

    long start = System.currentTimeMillis();
    System.out.println(coinMax(coins, 0, coins.length-1));
    //Ans: 16
    long end = System.currentTimeMillis();

    System.out.println("count: "+count);
    System.out.println("Time: "+(end - start));
  }

  static int coinMax(int[] a, int l, int r) {
    count ++;
    if(l+1 == r) {
      return Math.max(a[l],a[r]);
    }
    else if(r-l == 2) {
      return Math.max(a[l] + Math.min(a[l+1],a[r]), a[r] + Math.min(a[l],a[r-1]));
    }
    return Math.max(a[l] + Math.min(coinMax(a,l+2,r),coinMax(a,l+1,r-1)),
                    a[r] + Math.min(coinMax(a,l,r-2),coinMax(a,l+1,r-1)));
  }
  
}