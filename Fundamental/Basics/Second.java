//WAP to add,sub,multimdiv of 2 no.
import java.util.Scanner;
class Second 
{
    public static void main(String []as)
    {
       int a,b,s;
       Scanner ob =new Scanner(System.in);
       System.out.print("Enter the 1st No. = ");
       a=ob.nextInt();
       System.out.print("Enter the 2nd No. = ");
       b=ob.nextInt();
       s=a+b;
       System.out.println("Addition = "+s);
       System.out.println("Subtraction = "+(a-b));
       System.out.println("Multiplication = "+(a*b));
       System.out.print("Division = "+(a/b));
    }    
}