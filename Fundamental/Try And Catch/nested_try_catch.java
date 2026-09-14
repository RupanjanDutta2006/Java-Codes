//nested try & catch
import java.util.*;
class nested_try_catch
{
    public static void main(String[] args) {
        try{
        int a,b,c,i,n;
        Scanner ob =new Scanner(System.in);
        System.out.print("Enter the 1st No. = ");
        a=ob.nextInt();
        System.out.print("Enter the 2nd No. = ");
        b=ob.nextInt();
        c=a/b;
        System.out.print("division = "+c);
           try
            {
               System.out.print("Enter the Range = ");
               n=ob.nextInt();
               int p[]=new int[n];
               //input
               for(i=0;i<n;i++)
               {
                  System.out.print("Enter the No. = ");
                  p[i]=ob.nextInt();
               }
               //output
               System.out.println("Array List = ");
               for(i=0;i<n;i++)
               {
                  System.out.print(" "+p[i]);
               }
               p[i]=80;
            }
            catch(ArithmeticException e)
            {
               System.out.print("Arithmetic exception !!!!");  
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
          System.out.print("Array index out of range ");
        }
        catch(Exception e)
        {
          System.out.print("zero division error");
        }
    }
}