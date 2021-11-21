package Projecteuler;

import java.util.Scanner;

class CollatzProblem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long in = sc.nextLong();
        sc.close();
        long leng = 0, temp, max = 0, num = 0;
        for (long i = 1; i <= in; i++) {
            temp = i;
            leng = 0;
            while (temp != 1) {
                if (temp % 2 == 0) {
                    temp = temp / 2;
                } else {
                    temp = (3 * temp) + 1;
                }
                leng++;
            }
            if (leng > max) {
                max = leng;
                num = i;
            }
        }
        System.out.println("Longest chain under " + in + " is produced by: " + num);
    }
}