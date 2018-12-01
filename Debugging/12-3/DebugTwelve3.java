// Catch exceptions for array index out of bounds
// or dividing by 0 
import java.util.*;
public class DebugTwelve3
{
   public static void main(String[] args) 
   {
      Scanner input = new Scanner(System.in);
      String inStr;
      int num, result;
      int[] array = {12, 4, 6, 8};
      System.out.println("Enter a number ");
      inStr = input.nextLine();
      num = Integer.parseInt(inStr);
      try
      {
         for(int x = 0; x < array.length; ++x)
         {
            result =  array[x] / num;
            System.out.println("Result of division is " + result);
            result = array[num];
            System.out.println("Result accessing array is " + result);
         }
      }
      catch(ArithmeticException error)
      {
          System.out.println("Arithmetic error - division by 0");
      }
      catch(IndexOutOfBoundsException error)
      {
         System.out.println("Index error - subscript out of range");
      }
   }
}
