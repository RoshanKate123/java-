class Demo
{
   int a  = 100;
   void m1()
   {
   System.out.println("Inside mi method...");
   }
   
   
}

class Sample{
   
   static Demo def = new Demo();
   
}

class StaticRefVar2
{
 
 public static void main(String args[])
 {
    System.out.println("Start@ cuber success");
	
	System.out.println(Sample.def.a);
	Sample.def.m1();
	System.out.println("Stop @ cyber success");
 }
}