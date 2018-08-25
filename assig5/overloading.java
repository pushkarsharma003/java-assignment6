class over
{
	public void display()
	{
		System.out.println("nothing pass");
	}
	public void display(int a)
	{
		System.out.println(a);
	}
	public void display(float a)
	{
		System.out.println(a);
	}
}
class Overloading
{
	public static void main(String[] args)
	{
		over obj =new over();
		obj.display();
		obj.display(45);
		obj.display(56.7f);
	}
}