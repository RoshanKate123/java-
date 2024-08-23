class Demo
{
  int a = 100;
   }
   
   class Demo1
   {
     void m1()
	 {
	 System.out.println("inside m1 method...");
	 }
	 
   }
   
   class Sample
   {
    static Demo def = new Demo();
	static Demo1 def2= new Demo1();
	}
	
class StaticRefVar3 
{
 public static  void main(String args[])
 {
    System.out.println("Start @ cyber success");
	System.out.println(Sample.def.a);
	Sample.def2.m1();
	System.out.println("stop @ cyber success");
	a
 }
}