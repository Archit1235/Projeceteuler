//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?

package Projecteuler;

import java.util.Scanner;

class LargestPrime {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long in = sc.nextLong();
		sc.close();
		for (long i = in / 2; i >= 1; i--) {
			if (in % i == 0 && primecheck(i) == true) {
				System.out.println("Largest prime factor is: " + i);
				break;
			}
		}
	}

	public static boolean primecheck(long a) {
		for (long i = 2; i <= a / 2; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
}
