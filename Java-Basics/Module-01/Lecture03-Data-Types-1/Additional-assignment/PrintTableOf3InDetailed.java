/*
Q5. Print Table of 3 Detailed
Solved
feature icon
Get your doubts resolved blazing fast with Chat GPT Help
Check Chat GPT
feature icon
Using hints except Complete Solution is Penalty free now
Use Hint
Problem Description

Print first five multiples of 3 in the following manner -
3*1 = 3
3*2 = 6
3*3 = 9
3*4 = 12
3*5 = 15


Problem Constraints

No constraints.


Input Format

No need to take input.


Output Format

Print output in 5 lines.
In 1st line : 3*1 = 3
In 2nd line : 3*2 = 6
In 3rd line : 3*3 = 9
In 4th line : 3*4 = 12
In 5th line : 3*5 = 15


Example Input

No input required.


Example Output

Output :
3*1 = 3
3*2 = 6
3*3 = 9
3*4 = 12
3*5 = 15


Example Explanation

Self Exaplanatory


*/
public class PrintTableOf3InDetailed {
    public static void main(String[] args) {

        for(int i=1; i<=5; i++){
            System.out.println("3"+"*"+i+" = "+(3*i));
        }
    }
}
