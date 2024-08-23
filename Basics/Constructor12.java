class Constructor12 
{

  Constructor12()
  {
   System.out.println("Inside 0 arg Constructor");
  }
  Constructor12()
  {
  this();
  }
  Constructor12(int x , int y )
  {
   this(10);
  }
 public static void main(String args[])
 {
 }
}