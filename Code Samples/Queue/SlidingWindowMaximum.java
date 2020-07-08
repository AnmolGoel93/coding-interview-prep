import java.util.*;

public class SlidingWindowMaximum {
  public static void main(String args[]) {
    Solution s = new Solution();
    int[] arr = { 4, 3, 1, 2, 5, 3, 4, 7, 1, 9 };
    int[] sol = s.maxSlidingWindow(arr, 4);
    for (int i : sol) {
      System.out.print(i + " ");
    }
    //Answer is: 4 5 5 5 7 7 9 
  }

  static class Solution {
    public int[] maxSlidingWindow(int a[], int k) {
      int n = a.length;
      Deque<Integer> q = new LinkedList<>();
      int[] ans = new int[n - k + 1];

      int i = 0;
      for (; i < k; i++) {
        while (!q.isEmpty() && a[q.peekLast()] <= a[i]) {
          q.removeLast();
        }
        q.addLast(i);
      }

      for (; i < n; i++) {
        ans[i - k] = a[q.peekFirst()];

        System.out.println(q);
        while (!q.isEmpty() && q.peekFirst() <= i - k) {
          q.removeFirst();
        }
        while (!q.isEmpty() && a[q.peekLast()] <= a[i]) {
          q.removeLast();
        }
        q.addLast(i);
      }
      ans[i - k] = a[q.peekFirst()];
      System.out.println(q);
      return ans;
    }
  }
}