import java.util.*;

class Main {
  static int count = 0;

  static Set<String> set = new HashSet<>();
  
  public static void main(String[] args) {
    String input = "abba";

    long start = System.currentTimeMillis();
    permutation(input, 0, input.length()-1);
    //Ans: abba abab aabb baba baab bbaa
    long end = System.currentTimeMillis();

    System.out.println("count: "+count);
    System.out.println("Time: "+(end - start));
  }

  static void permutation(String s, int l, int r) {
    count++;
    if(l == r) {
      if(set.contains(s)) return;
      set.add(s);
      System.out.println(s);
      return;
    }
    
    permutation(s,l+1,r);
    for(int i = l+1; i<=r; i++) {
      s = interChangeChar(s,l,i);
      permutation(s,l+1,r);
      s = interChangeChar(s,l,i);
    }
  }

  static String interChangeChar(String str, int l, int r) {
    char[] s = str.toCharArray();
    char temp = s[l];
    s[l] = s[r];
    s[r] = temp;
    return String.valueOf(s);
  }
  
}