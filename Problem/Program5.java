//How to convert Fahrengeit to celcius program in java

import java.util.*;
class FehreneitToCelcius
{
    public static void main(String args[])
    {
        float temperature;
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit : ");
        temperature = sobj.nextInt();

        temperature = ((temperature-32)*5)/9;

        System.out.println("Temperature in celsius = "+temperature);
    }
}