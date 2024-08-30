// How to swap 2 no without using 3rd variable program in java


import java.util.*;
class SwapNumber
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int No1,No2;

        System.out.println("Enter the first number : ");
        No1 = sobj.nextInt();

        System.out.println("Enter the second number : ");
        No2 = sobj.nextInt();

        System.out.println("Before Swapping\n No1 = "+No1+"\n No2 = "+No2);

        No1 = No1 + No2;
        No2 = No1 - No2;

        No1 = No1 - No2;

        System.out.println("After Swapping\n No1 = "+No1+"\n No2 = "+No2);

        
    }
}