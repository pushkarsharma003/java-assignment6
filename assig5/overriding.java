class Animal
{
	public void breed()
	{
		System.out.println("Breed A");
	}
	public void colour()
	{
		System.out.println("color 1");
	}
	public void speak()
	{
		System.out.println("speak");
	}
}
class Cat extends Animal
{
	public void speak()
	{
		System.out.println("speak cat");
	}
}
class Dog extends Animal
{
	public void speak()
	{
		System.out.println("speak dog");
	}
}
class Overriding
{
	public static void main(String[] args)
	{
		Cat a=new Cat();
		Dog b=new Dog();
		a.breed();
		a.colour();
		a.speak();
		b.breed();
		b.colour();
		b.speak();
	}
}