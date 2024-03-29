//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a2 + b2 = c2
//For example, 32 + 42 = 9 + 16 = 25 = 52.
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.

package Projecteuler;

class Pytha1000 {
  public static void main(String args[]) {
    for (int a = 1; a < 1000; a++) {
      for (int b = a + 1; b < 1000; b++) {
        if ((a + b + (Math.sqrt((a * a) + (b * b)))) == 1000) {
          System.out.println("THe product of abc: " + a * b * (Math.sqrt((a * a) + (b * b))));
          break;
        }
      }
    }
  }
}
