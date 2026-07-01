/*
Q6. Print Table of 3
Problem Description

Print first five multiples of 3 that is :
3 6 9 12 15


Problem Constraints

No constraints.


Input Format

No need to take input.


Output Format

Print 3 6 9 12 15 in single line, keep space between every multiple.


Example Input

No input reuired.


Example Output

Output :
3 6 9 12 15


Example Explanation

Self Explanatory.
*/

public class Q6PrintTableof3 {
    public static void main(String[] args) {
        for(int i=1; i<6; i++){
            System.out.print(3*i);
            if(i==5){
               break; 
               
            }
            System.out.print(" ");
        }
    }
}
