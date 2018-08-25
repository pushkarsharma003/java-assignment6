abstract class Vehicle
{
  abstract public void start();
  public void stop()
  {
	  System.out.println("vehicle stop");
  }
	
}
class Twowheeler extends Vehicle
{
	public void start()
	{
		System.out.println("2 wheeler start");
	}
	public void stop()
	{
		System.out.println("2 wheeler stop");
	}
}
class Fourwheeler extends Vehicle
{
	public void start()
	{
		System.out.println("4 wheeler start");
	}
	public void stop()
	{
		System.out.println("4 wheeler stop");
	}
}
class Abstractclass
{
	public static void main(String[] args)
	{
		Vehicle o1 = new Twowheeler();
		Vehicle o2 = new Fourwheeler();
		o1.start();
		o1.stop();
		o2.start();
		o2.stop();
	}
}
