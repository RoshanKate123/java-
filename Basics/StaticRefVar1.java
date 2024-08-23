class Demo{

 int a = 100;
 
 void m1()
 {
 System.out.println("Inside m1 Method.......");
 
 } 
 
 }
 
 class StaticRefVar1 {
   
  static  Demo d = new Demo();
   
 
 public static void main(String args[])
 {
   
    System.out.println("Start @ cyber success");
	
	System.out.println(d.a);
     d.m1();
	
	System.out.println("Stop @ cyber sucess");
 
 }
}