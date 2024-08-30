// Find Largest No in java Program

import java.util.*;

class LargestNumber
{
    public static void main(String args[])
    {
        int No1,No2,No3;

        Scanner sobj = new Scanner(System.in);
         
        System.out.print("Enter First Number : ");
        No1 = sobj.nextInt();

        System.out.print("Enter Second Number : ");
        No2 = sobj.nextInt();

        System.out.print("Enter Third Number : ");
        No3 = sobj.nextInt();

        if(No1 > No2 && No1 > No3)
        {
            System.out.println("First number is largest number");
        }
        else if(No2 > No1 && No2 > No3)
        {
            System.out.println("Second number is largest number");
        }
        else if(No3 > No1 && No3 > No2)
        {
            System.out.println("Third number is largest number");
        }
    }
}

