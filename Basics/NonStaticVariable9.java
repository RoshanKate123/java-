public class NonStaticVariable9
{

   int nonStaticVar = 30;
   
   class InnerClass
   {
      void printNonStaticVar()
	  {
	   System.out.println("Non-static variable (via inner class ): "+ nonStaticVar);
	  }
   }
   
   static {
   
   NonStaticVariable9 ns = new NonStaticVariable9();
   
   InnerClass in = ns.new InnerClass();
   
   in.printNonStaticVar();
   }
  public static void main(String args[])
  {
     new NonStaticVariable9();
  }
}