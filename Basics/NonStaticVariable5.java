class NonStaticVariable5
{
	public static void main(String args[])
	{
		
		System.out.println("Start @ cyber success");
		NonStaticVariable5 ref = new NonStaticVariable5();
		
		int a= 10;
		float b = 20.5f;
		float res = ref.m1(a , b);
		System.out.println(res);
		System.out.println("Stop @ Cyber successs");
	}
	
	float m1( int a , float b)
	{
		System.out.println("Inside nont static method");
		float result = a + b;
		return result;
	}
}