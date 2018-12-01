import java.util.*;
public class DebugPhoneBook extends DebugBook
{
   private String area;
   private String size;
   private final int CUTOFF = 30;
   DebugPhoneBook(int pages, String city)
   {
      super(pages);
      area = city;
      if(pages > CUTOFF)
         size = "big";
      else
         size = "small";
    }
   public void display()
   {
      System.out.println("The phone book for " + area +
         " has " + pages + " pages.\nThat is a " +
         size + " phone book."); 
   }
}
