// Swap two numbers

import java.util.*;
class Swap
{
    public static void main(String args[])
    {
        int No1, No2;
        int temp;
        

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter First No : ");
        No1 = sobj.nextInt();

        System.out.print("Enter Second No : ");
        No2 = sobj.nextInt();

        System.out.println("Before Swapping\nNo1 = "+No1+"\nNo2 = "+No2);

        temp = No1;
        No1 = No2;
        No2 = temp;

        System.out.print("After Swapping\nNo1 = "+No1+"\nNo2 = "+No2);
    }
}