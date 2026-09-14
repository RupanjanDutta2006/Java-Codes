import java.util.Scanner;
class string_index_out_of_bounds_exception
{
    public static void main(String[] args) {
        try
        {
        String x;
        int i;
        Scanner ob =new Scanner(System.in);
        System.out.print("Enter the String = ");
        x=ob.nextLine();
        for(i=0;i<=x.length();i++)
         {
            System.out.print(x.charAt(i));
         }
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.print("\nString index out of Range ");
        }
        catch(Exception e)
        {
            System.out.print("Exception !!!! ");
        }
    }
}