// Print multipliation table program java

import java.util.*;

class MultiplicationTable
{
    public static void main(String args[])
    {
        int Value1 = 0;
        int Value2 = 0;
        int multi = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter range of number to print their multiplication table : ");
        Value1 = sobj.nextInt();
        Value2 = sobj.nextInt();

        multable abc = new multable();

        abc.Table(Value1,Value2); 
    }
}

class multable
{
 
    public void Table(int No1,int No2)
    {
        int ans = 0;

        for(int i = No1; i <= No2; i++)
        {
            for(int j = 1; j <= 10; j++)
            {
                ans = i * j;
                System.out.println(i+" * "+j+" = "+ans);
            }
            System.out.println();
        }
    }
}