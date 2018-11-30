//Mick’s Wicks makes candles in various sizes. Create a class for the business named Candle that contains the following data fields:

//color - of type String
//height - of type int
//price - of type double
//Create get methods for all three fields. Create set methods for color and height, but not for price. Instead, when height is set, determine the price as $2 per inch.

//Create a child class named ScentedCandle that contains an additional data field named scent (of type String) and methods to get and set it. In the child class, override the parent’s setHeight() method to set the price of a ScentedCandle object at $3 per inch.


public class Candle
{
   private String color;
   private int height;
   protected double price;
   public String getColor()
   {
      return color;
   }
   public int getHeight()
   {
      return height;
   }
   public double getPrice()
   {
      return price;
   }
   public void setColor(String c)
   {
      color = c;
   }
   public void setHeight(int h)
   {
      final double PER_INCH = 2;
      height = h;
      price = height * PER_INCH;
   }
}
