class Inhe
{
	public static void main(String[] args)
	{	
		b s = new b();
		System.out.println(s.hello(3));
		s.show();
	}
}

class a
{	
	void show()
	{	
		System.out.println("class a method show");
	}
}
class b extends a
{
	int hello(int c)
	{
		return c+c;
	}
}