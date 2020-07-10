## Anagrams

### 1. Using nested "for" loops

Time Complexity: O(n2)

```java

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine().trim();
    String str2 = sc.nextLine().trim();

    boolean isAnagram = false;
    boolean[] visited = new boolean[str2.length()];

    if(str1.length() == str2.length()) {
      for(int i=0; i<str1.length(); i++) {
        boolean isAnagram = false;
        for(int j=0; j<str2.length(); j++) {
          if(str1.charAt(i) == str2.charAt(j) && !visited[j]) {
            visited[j] = true;
            isAnagram = true;
            break;
          }
        }
        if(!isAnagram) {
          break;
        }
      }
    }

    if(isAnagram) {
      System.out.println("Anagram");
    }
    else {
      System.out.println("Npt Anagram");
    }
  }
}

```

---

### 2. Using character mapped (ascii) array

Time Complexity: O(n)

```java

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine().trim();
    String str2 = sc.nextLine().trim();

    boolean isAnagram = true;

    if(str1.length() == str2.length()) {
      int ascii = new int[256];

      for(char i: str1.toCharArray()) {
        int index = (int) i;
        ascii[index]++;
      }
      for(char i: str2.toCharArray()) {
        int index = (int) i;
        ascii[index]--;
      }

      for(int i=0; i<256; i++) {
        if(ascii[i] != 0) {
          isAnagram = false;
          break;
        }
      }
    }

    if(isAnagram) {
      System.out.println("Anagram");
    }
    else {
      System.out.println("Not Anagram");
    }
  }
}

```
