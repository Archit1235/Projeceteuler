//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

package Projecteuler;

class Div20 {
  public static void main(String args[]) {
    boolean cont = true;
    long in = 1;
    while (cont == true) {
      System.out.println(in);
      if (divto20(in) == true) {
        System.out.println(in);
        break;
      }
      in++;
    }
  }

  public static boolean divto20(long in) {
    for (int i = 1; i < 21; i++) {
      if (in % i != 0) {
        return false;
      }
    }
    return true;
  }
}
