// Nested IfElse clause in java

import java.util.*;

class NEstedIfElse
{
    public static void main(String args[])
    {
        int ObtainedMarks,PassingMarks;

        char grade;

        Scanner sobj = new Scanner(System.in);
        PassingMarks = 40;

        System.out.print("Marks scored by student : ");
        ObtainedMarks = sobj.nextInt();

        if(ObtainedMarks >= PassingMarks)
        {
            if(ObtainedMarks > 90)
            {
                System.out.println("You pass the exam with Grade A");
            }
            else if(ObtainedMarks > 80)
            {
                System.out.println("You pass the exam with Grade B");
            }
            else if(ObtainedMarks > 70)
            {
                System.out.println("You pass the exam with Grade C");
            }
            else if(ObtainedMarks >= 40)
            {
                System.out.println("You pass the exam with Grade D");
            }
        } 
        else
        {
            System.out.println("You failed ..");
        }
    }
}