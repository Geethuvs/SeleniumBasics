package com.obs.sample;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        int flag=0;
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=sc.nextInt();
        if(a==0||a==1)
        {
            System.out.println("Not a prime number");

        }
        else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Prime number");
            }
            if (flag == 1) {
                System.out.println("Not a Prime number");

            }
        }

        }

    }

