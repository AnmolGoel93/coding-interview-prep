import java.util.*;

class Main {
  static int stepCountPow = 0;
  static int stepCountFast = 0;
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    System.out.println(pow(2,40));
    System.out.println(stepCountPow);
    System.out.println(fastpow(2,40));
    System.out.println(stepCountFast);
  }

  private static long pow(int a, int b) {
    stepCountPow++;
    if(b == 0) {
      return 1;
    }
    return a * pow(a, b-1);
  }
  
  private static long fastpow(long a, int b) {
    stepCountFast++;
    if(b == 0) {
      return 1;
    }
    else if(b % 2 == 0) {
      return fastpow(a*a, b/2);
    }
    return a * fastpow(a, b-1);
  }
}