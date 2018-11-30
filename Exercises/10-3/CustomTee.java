//Create a TeeShirt class for Toby’s Tee Shirt Company. Fields include:

//orderNumber - of type int
//size - of type String
//color - of type String
//price - of type double
//Create set methods for the order number, size, and color and get methods for all four fields. The price is determined by the size: $22.99 for XXL or XXXL, and $19.99 for all other sizes.

//Create a subclass named CustomTee that descends from TeeShirt and includes a field named slogan (of type String) to hold the slogan requested for the shirt, and include get and set methods for this field.



public class CustomTee extends TeeShirt
{
   private String slogan;
   public void setSlogan(String slgn)
   {
       slogan = slgn;
   }
   public String getSlogan()
   {
       return slogan;
   }
}
