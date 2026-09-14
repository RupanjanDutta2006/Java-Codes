import java.util.*;
class array_index_out_of_bounds_exception
{
    public static void main(String[] args) {
        try
        {
        int i,n;
        Scanner ob =new Scanner(System.in);
        System.out.print("Enter the Range = ");
        n=ob.nextInt();
        int a[]=new int[n];
        //input
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the No. = ");
            a[i]=ob.nextInt();
        }
        //output
        System.out.println("Array list = ");
        for(i=0;i<n;i++)
        {
           System.out.print(" "+a[i]);
        }
        a[i]=70;
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
          System.out.print("\nArray index out of range "+e);
       }
       catch(Exception e)
       {
        System.out.print("Error !!!");
       }
    }
}