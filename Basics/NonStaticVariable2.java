class Demo
{
	int a = 100;
	
}
class Sample
{
	
	static float x = 100.f;
	
}
class Cyber
{
	Demo d = new Demo();
	float result =  d.a + Sample.x;
	//float result ;
}

class NonStaticVariable2
{
	public static void main(String args[])
	{
		System.out.println("Start @ cyber successs");
	//	Demo d = new Demo();
	//  float result =  d.a + Sample.x;
		Cyber c = new Cyber();
		System.out.println(c.result);
		System.out.println("Stop @ cyber successs");
	}
}