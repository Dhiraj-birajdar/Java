class Infa
{
	public static void main(String[] args)
	{	
		b s = new b();
		System.out.println(s.hello(3));
		s.ashow();
		s.dshow();
	}
}

interface a
{	
	void ashow()
	{	
		System.out.println("class a method show");
	}
	interface d
	{
		void dshow()
		{
			System.out.println("class d method show");			
		}
	}
}
class b implements a.d
{
	int hello(int c)
	{
		return c+c;
	}
}