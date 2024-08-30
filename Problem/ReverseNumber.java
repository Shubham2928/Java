// Print Reverse number in java

import java.util.*;

class ReverseNumber
{
    public static void main(String args[])
    {
        int No = 0;
        int Reverse = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number : ");
        No = sobj.nextInt();

        while(No != 0)
        {
            Reverse = Reverse * 10;
            Reverse = No%10;
            Reverse = Reverse + Reverse;
            No = No/10;
        }
        System.out.println("Reverse of entered number is "+Reverse);
    }   
}