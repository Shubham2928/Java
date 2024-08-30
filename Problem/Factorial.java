// Find Factorial for given no program in java

import java.util.*;
class Factorial
{
    public static void main(String args[])
    {
        int No;
        int fact = 1;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        No = sobj.nextInt();

        if(No < 0)
        {
            System.out.println("Number should not be negative");
        }
        else
        {
            for(int i = 1; i <= No; i++)
            {
                fact = fact * i;
            }
            System.out.println("Factorial of "+No+"is = "+fact);
        }
    }
}