//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//Find the sum of all the primes below two million.

package Projecteuler;

import java.util.Scanner;

class PrimeSum {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter  number: ");
    long in = sc.nextInt();
    sc.close();
    long pri = 0, i;
    for (i = 2; i <= in; i++) {
      if (primecheck(i) == true) {
        pri += i;
        System.out.println(i + "     " + pri);
      }
    }
    System.out.println(pri);
  }

  public static boolean primecheck(long a) {
    for (long b = 2; b <= a / 2; b++) {
      if (a % b == 0) {
        return false;
      }
    }
    return true;
  }
}
