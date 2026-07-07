/*
Problem Description

Write a program to input a number(A) from user and print 1 if it is positive, -1 if it is negative, 0 if it's neither positive nor negative.



Problem Constraints

1 <= A <= 1000000



Input Format

One line containing an integer A.



Output Format

One line each 0/1/-1 as per the question.
*/

import java.util.Scanner;

public class CategoriesTheNumber {
     public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       if(n>0){
           System.out.println(1);
       }else if(n<0){
           System.out.println(-1);
       }else{
           System.out.println(0);
       }
    }
}
