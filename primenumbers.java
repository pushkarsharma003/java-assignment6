import java.util.Scanner;
class Prime
{
	public static void main(String[] args)
	{
		int i,j,flag=0;
		int N;
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		for (i=2;i<=N;i++)
		{
			flag=0;
			for (j=2;j<=i/2;j++)
			{
				if (i%j==0)
				{
					flag=1;
					break;
				}
			}
			if (flag==0)
			{
				System.out.println(i);
			}
		}
	}
}