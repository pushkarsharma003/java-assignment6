import java.util.Scanner;
class Armstrong 
{
 public static void main(String[] args)
{
int arm=0,a,b,c,d,n; 
Scanner s=new Scanner(System.in);
System.out.println("Enter any num :");
n=s.nextInt();
d=n;
while(n>0)
{
a=n%10;
n=n/10;
arm=arm+a*a*a;
}
if(arm==d)
{
System.out.println("number is armstrong");
}
else
{
System.out.println("number is not armstrong");
}
}
}