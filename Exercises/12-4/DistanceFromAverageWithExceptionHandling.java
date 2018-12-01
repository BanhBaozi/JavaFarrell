//In Chapter 8, you wrote an application named DistanceFromAverage that allows a user to enter up to 15 double values and then displays each entered value and its distance from the average. Now, modify that program to first prompt the user to enter an integer that represents the array size. Java generates a NumberFormatException if you attempt to enter a noninteger value using nextInt(); handle this exception by displaying an appropriate error message.

//Create an array using the integer entered as the size. Java generates a NegativeArraySizeException if you attempt to create an array with a negative size; handle this exception by setting the array size to a default value of five. If the array is created successfully, use exception-handling techniques to ensure that each entered array value is a double before the program calculates each element’s distance from the average.


import java.util.*;
public class DistanceFromAverageWithExceptionHandling
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      double[] numbers;
      double entry = 0;
      int enteredSize = 0;
      double total = 0;
      double average = 0;
      final int QUIT = 99999;
      boolean isArrayNegative = false;
      boolean canCreateArray = true;
      boolean isValOk = false;
      int x = 0, y;
      
      try
      {
          System.out.print("Please enter a value for the array size:");
          enteredSize = input.nextInt();
      }
      catch(Exception e)
      {
          System.out.println("Invalid value for array size");
          canCreateArray = false;
          input.nextLine();
      }
       
       while(enteredSize < 0)
       {
           System.out.print("Array cannot be negative. Array set to value of size 5 >>");
           enteredSize = 5;
           input.nextLine();
       }
       
       if(canCreateArray)
       {
           numbers = new double[enteredSize];
           while(!isValOk)
           {
               try
               {
                   System.out.print("Enter a numeric value or " + QUIT + " to quit >> ");
                   entry = input.nextDouble();
                   isValOk = true;
               }
               catch(Exception e)
               {
                   isValOk = false;
                   input.nextLine();
               }
           }
           while(entry != QUIT && x < numbers.length)
           {
               numbers[x] = entry;
               ++x;
               if(x < numbers.length)
               {
                   try
                   {
                       System.out.print("Enter next numeric value or " +
                                        QUIT + " to quit >> ");
                       entry = input.nextDouble();
                   }
                   catch(Exception e)
                   {
                       --x;
                       input.nextLine();
                   }
               }
           }
           if(x == 0)
               System.out.println("Average cannot be computed because no numbers were entered");
           else
           {
               for(int a = 0; a < numbers.length; ++a)
                   total += numbers[a];
               average = total / x;
               System.out.println("You entered " + x + " numbers and their average is " + average);
                   for(y = 0; y < x; ++y)
                       System.out.println(numbers[y] + " is " +
                                          (average - numbers[y]) + " away from the average");
         }
     }           
  }
}
