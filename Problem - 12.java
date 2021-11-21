package Projecteuler;

import java.util.Scanner;

class TriangleNumFacts {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    long in = sc.nextLong();
    sc.close();
    long num = 1, j = 1, facts = 0;
    while (facts < in) {
      num = (j * (j + 1)) / 2;
      facts = 1;
      for (long i = 1; i <= (num / 2); i++) {
        if (num % i == 0) {
          facts++;
        }
      }
      j++;
    }
    System.out.println("The triangular number which has " + in + " or more number of factors is " + num);
  }
}