package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
    System.out.println("TOPIC 5: Division in the Integer: Prime Number and Prime Factorization");
    System.out.println("----------------------------------------------------------------------");
    System.out.println("Press 1 : Prime Number");
    System.out.println("Press 2 : Prime Factorization");
    System.out.print("Choose 1 or 2  : ");
    int choose = scan.nextInt();

    if (choose == 1) {
        System.out.println("Prime Number");
        System.out.println("------------");
        primeNumber();
    } else if (choose == 2) {
        System.out.println("Prime Factorization");
        System.out.println("-------------------");
        primeFactor();
    }

    }

    private static void primeNumber() {
        int i,m,flag=0;
        System.out.print("Enter Number  :: ");
        int n =scan.nextInt();
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }//end of else
    }

    private static void primeFactor() {
        System.out.println("Enter a number ::");
        int number = scan.nextInt();

        for(int i = 2; i< number; i++) {
            while(number%i == 0) {
                System.out.println(i+" ");
                number = number/i;
            }
        }
        if(number >2) {
            System.out.println(number);
        }
    }
}
