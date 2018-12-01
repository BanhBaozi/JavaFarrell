import java.util.Scanner;
public class DebugNine4
{
   enum Planet {MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE};

   public static void main(String[] args)
   {
      Planet planet;
      String userEntry;
      int comparison;
      int position;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a planet in our solar system >> ");
      userEntry = input.nextLine().toUpperCase();
      planet = Planet.valueOf(userEntry);
      System.out.println("You entered " + planet);
      position =  planet.ordinal();
      System.out.println(planet + " is " + (position + 1) + " planet(s) from the sun");
   }
}
