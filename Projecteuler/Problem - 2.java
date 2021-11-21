package Projecteuler;

import java.util.Scanner;

class SumOfEvenFibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long in = sc.nextLong();
        sc.close();
        long sum = 0, f1 = 0, f2 = 1, f3 = 0;
        while (f3 <= in) {
            f3 = f1 + f2;
            if (f3 % 2 == 0) {
                sum += f3;
            }
            f1 = f2;
            f2 = f3;
        }
        System.out.println("Sum of even fibonacci below " + in + " is: " + sum);
    }
}
