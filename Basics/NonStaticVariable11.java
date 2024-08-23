public class NonStaticVariable11
{
   int nonStaticVar = 39;
 
  static 
{ 
   initialize();
}  
   static void initialize()
   {
     NonStaticVariable11 ns = new NonStaticVariable11();
	 System.out.println("Non-static variable (via static initialization method) ; " + ns.nonStaticVar);
	 
   }
   
   public static void main(String args[])
   {
     new NonStaticVariable11();
   }
}