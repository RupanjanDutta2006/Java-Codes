import java.util.*;
class input_mismatch_exception 
{
    public static void main(String[] args) 
    {
       try
       {
       int x;
       Scanner ob =new Scanner(System.in);
       System.out.print("Enter the No. = ");
       x=ob.nextInt();
       System.out.println("Data = "+x); 
       }
       catch(InputMismatchException e)
       {
          System.out.print("\nYou must enter integer input ");
       }   
       catch(Exception e)
       {
        System.out.print("Exception !!!! ");
       }
    }  
}