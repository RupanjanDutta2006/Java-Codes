//WAP to calc. area & circumference of Circle.
import java.util.Scanner;
class circle
{
   public static void main(String as[])
   {
      double r,ar,pr;
      Scanner ob =new Scanner(System.in);
      System.out.print("Enter the Radius = ");
      r=ob.nextDouble();
      ar=Math.PI*r*r;
      pr=2*Math.PI*r;
      System.out.print("Area = "+ar+"\nPerimeter = "+pr);
   }       
}