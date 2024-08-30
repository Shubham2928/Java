// How to compare two string in java

import java.util.*;

class compareString
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        String s1,s2;
        System.out.print("Enter First String : ");
        s1 = sobj.nextLine();

        System.out.print("Enter second String : ");
        s2 = sobj.nextLine();

        if(s1.compareTo(s2) > 0)
        {
            System.out.println("First string is greater than second");
        }
        else if(s1.compareTo(s2) < 0)
        {
            System.out.println("Second string is greater than First");
        }
        else
        {
            System.out.println("both string are equal");
        }
    }
} 