class NonStaticVariable8
{
  
   int nonStaticVar = 20;
   
   static 
   {
     NonStaticVariable8 obj = getNewInstance();
	 
	 System.out.println("Non-static variable (via static method returning instane ): " + obj.nonStaticVar);
	 
   }
   
    static NonStaticVariable8 getNewInstance()
	{
	  return new NonStaticVariable8();
	 }
 public static void main(String args[])
 {
    new NonStaticVariable8();
 }
}