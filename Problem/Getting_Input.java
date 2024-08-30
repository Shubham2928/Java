
// How to get using input using Scanner program in java

import java.util.Scanner;
class GetInputFromUser
{
    public static void main(String args[])
    {
        int a;
        float b;
        String s;

        Scanner sobj = new Scanner(System.in);   // scanner object

        System.out.println("Enter a String : ");
        s = sobj.nextLine();
        System.out.println("You entered String "+s);

        System.out.println("Enter an integer");
        a = sobj.nextInt();
        System.out.println("You entered integer "+a);

        System.out.println("Enter a float");
        b = sobj.nextFloat();
        System.out.println("You entered float "+b);

    }   
}