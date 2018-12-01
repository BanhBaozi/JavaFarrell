// QuartsToGallonsInteractive.java
//In Chapter 2, you created an application named QuartsToGallonsInteractive that accepts a number of quarts from a user and converts the value to gallons. Now, add exception-handling capabilities to this program and continuously reprompt the user while any nonnumeric value is entered.





import java.util.Scanner;
class QuartsToGallonsWithExceptionHandling
{   
   public static void main(String[] args) 
   {  
      final int QUARTS_IN_GALLON = 4;
      int quartsNeeded = 18;
      int gallonsNeeded;
      int extraQuartsNeeded;
      boolean isGoodUserEntry = false;
      Scanner input = new Scanner(System.in);
       
      while(!isGoodUserEntry)
      {
          try
          {
              System.out.print("Enter quarts needed >> ");
              quartsNeeded = input.nextInt();
              isGoodUserEntry = true;
          }
          catch(Exception e)
          {
              input.nextLine();
              System.out.println("Invalid data entry");
          }
      }
      
      
      gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
      extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
      System.out.println("A job that needs " + quartsNeeded +
         " quarts requires " + gallonsNeeded + " gallons plus " +
         extraQuartsNeeded + " quarts.");
   }
}
