//A palindromic number reads the same both ways.
//The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.

package Projecteuler;

class Palendrome {
	public static void main(String args[]) {
		int a = 999, mult, max = 1;
		while (a > 99) {
			int b = 999;
			while (b > 99) {
				mult = a * b;
				if (palendromecheck(mult)) {
					if (mult > max) {
						System.out.println(mult);
						max = mult;
						break;
					}
				}
				b--;
			}
			a--;
		}
		System.out.println(max);
	}

	public static boolean palendromecheck(int in) {
		String org = "" + in;
		String rev = "";
		for (int i = org.length() - 1; i >= 0; i--) {
			rev += org.charAt(i);
		}
		if (org.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}
}