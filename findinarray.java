import java.util.Scanner;
class Findarray
{
    public static void main(String[] args) 
    {
        int n=7,search,flag=0;
        int a[] ={1,4,6,7,8,9,10};        
		System.out.print("enter num to search ");
		Scanner s=new Scanner(System.in);
		search=s.nextInt();
        for (int i = 0; i < n; i++) 
        {
			if(search==a[i])
			{
				System.out.print("found");
				flag=1;
				break;
			}
        }
		if (flag==0)
		{
			System.out.print("not found");
		}
    }
}