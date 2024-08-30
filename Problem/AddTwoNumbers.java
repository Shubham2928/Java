// How to add two number program in java

import java.util.*;


class AddNumber
{
    public static int add(int value1, int value2)
    {
        int result;
        result = value1 + value2;
        return result;
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        int No1,No2;
        int Addition;

        System.out.print("Enter first number : ");
        No1 = sobj.nextInt();

        System.out.print("Enter Second number : ");
        No2 = sobj.nextInt();

        Addition = add(No1,No2);

        System.out.print("Addition is : "+Addition);
    }
}