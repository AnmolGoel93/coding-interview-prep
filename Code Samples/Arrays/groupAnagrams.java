import java.util.*;

class Solution {
  public static List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    
    for(String i: strs) {
      char[] arr = i.toCharArray();
      Arrays.sort(arr);
      String s = new String(arr);
      if(!map.containsKey(s)) {
        map.put(s,new ArrayList<String>());
      }
      map.get(s).add(i);
    }
    return new ArrayList<List<String>>(map.values());
  }

  public static void main(String args[]) {
    String[] strs = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
    System.out.println(groupAnagrams(strs));
  }
}