package Projecteuler;

import java.util.Scanner;

class SumOfMultiplesOf3_5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int in = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = 3; i < in; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of multiples of 3 or 5 below " + in + " is: " + sum);
    }
}
