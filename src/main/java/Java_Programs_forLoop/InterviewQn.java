package Java_Programs_forLoop;

import java.util.Scanner;

public class InterviewQn {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();   // user enters 1,2,3...

        int num = 11;   // first table starts from 11   

        for(int i=1; i<=input; i++) {      // how many tables to print
            for(int j=1; j<=10; j++) {     // each table from 1 to 10
                System.out.println((num*j));
            }
            num++;  // next table (11 → 12 → 13 ...)
        }
    }
}
