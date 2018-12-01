// A PhoneBook is a Book with a city
import java.util.*;
public class DebugTen3
{
   public static void main(String[] args)
   {
      String area, inStr;
       int pages;
      Scanner input = new Scanner(System.in);

      System.out.println("Enter city for phone book");
      area = input.next();
      System.out.println("Enter number of pages in " + area + "'s phone book");
      inStr = input.next();
      pages = Integer.parseInt(inStr);
      DebugPhoneBook pb = new DebugPhoneBook(pages, area);
      pb.display();
   }
}
