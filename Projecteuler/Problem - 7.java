//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//What is the 10 001st prime number?

package Projecteuler;

import java.util.Scanner;

class NthPrime {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    sc.close();
    int count = 0, i = 2;
    while (count != num) {
      if (primecheck(i) == true) {
        count++;
      }
      i++;
    }
    System.out.println(num + "th prime number is: " + (i - 1));
  }

  public static boolean primecheck(int a) {
    for (int i = 2; i <= a / 2; i++) {
      if (a % i == 0) {
        return false;
      }
    }
    return true;
  }
}
