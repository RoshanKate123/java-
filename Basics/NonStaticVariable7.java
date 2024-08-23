class NonStaticVariable7
{

  int a = 200;
  
  static {
   NonStaticVariable7 ns = new NonStaticVariable7();
   System.out.println(ns.a);
   }
   public static void main(String args[])
   {
	   new NonStaticVariable7();
   }
}