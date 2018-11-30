public class TeeShirt
{
   private int orderNumber;
   private String size;
   private String color;
   private double price;
   public void setOrderNumber(int num)
   {
       orderNumber = num;
   }
   public void setSize(String sz)
   {
       size = sz;
   }
   public void setColor(String clr)
   {
       color = clr;
   }
    public void setPrice(double pr)
   {
      price = pr;
   }
   public int getOrderNumber()
   {
       return orderNumber;
   }
   public String getSize()
   {
       return size;
   }
   public String getColor()
   {
       return color;
   }
   public double getPrice()
   {
      return price;
   }
}
