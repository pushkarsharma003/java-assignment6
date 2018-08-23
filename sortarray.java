//import java.util.Scanner;
class Sortarray 
{
    public static void main(String[] args) 
    {
        int n=8, temp;
        int a[] ={1,1,1,1,0,0,1,0};        
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("after sort");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + " ");
        }
        System.out.print(a[n - 1]);
    }
}