class Cyber
{
  int x = 100;
}
class Success
{
  static int y = 200;
}
class Training
{
  int temp;
}
class NonStaticVariable3
{
public static void main(String args[])
{

 System.out.println("Strat @ cyber successs");
   Cyber c = new Cyber();
   Training t = new Training();
   
   t.temp = c.x ;
    c.x = Success.y;
	Success.y = t.temp;
	
	System.out.println(c.x);
	System.out.println(Success.y);
	
	 System.out.println("Stop @ cyber successs");
	
}
}