public class NonStaticVariable10
{

   int a = 1000;
   
   static {
     accessNonStaticVar();
   }
   
   static void accessNonStaticVar()
   {
    NonStaticVariable10 ns = new NonStaticVariable10();
	System.out.println(" Non - static variable (via static Method access): " + ns.a);
	
   }
 public static void main(String args[])
 {
    new  NonStaticVariable10();
 }
}