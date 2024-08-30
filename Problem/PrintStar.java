// Print star console using loop

import java.util.*;

class star
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int No,Star;

        System.out.print("Enter number that you want to print * :");
        No = sobj.nextInt();

        for(int i = 1; i <= No; i++)
        {
            for(Star = 1; Star <= i; Star++)
            {
                System.out.print(" * ");
            }
            System.out.println();
            
        }

    }
}