//The sum of the squares of the first ten natural numbers is,
//            1^2 + 2^2 + ... + 10^2 = 385
//The square of the sum of the first ten natural numbers is,
//            (1 + 2 + ... + 10)^2 = 55^2 = 3025
//Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

package Projecteuler;

import java.util.Scanner;

class SqSum {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int in = sc.nextInt();
    sc.close();
    int sumsq = 0, sqsum = 0;
    for (int i = 1; i <= in; i++) {
      sumsq = sumsq + (i * i);
      sqsum += i;
    }
    sqsum = sqsum * sqsum;
    System.out.println(sqsum - sumsq);
  }
}