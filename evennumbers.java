import java.util.Scanner;
class Even
{
	public static void main(String[] args)
	{
		int i,j,N;
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		for (i=2;i<=N;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}