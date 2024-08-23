class Demo
{
 int a = 100;
 static float b ;
 }
 
 class Sample
 {
 static int x ;
 float y = 200.5f;
 }
 class NonStaticVariable1
 {
    public static void main(String args[])
	{
	System.out.println("STring @ cyber success");
	
	Demo d  = new Demo();
	Sample s = new Sample();
	s.x = d.a;
	d.b = s.y;
	System.out.println(s.x);
	System.out.println(d.b);
	System.out.println("Stop @ cyber success");
	}
 }
 