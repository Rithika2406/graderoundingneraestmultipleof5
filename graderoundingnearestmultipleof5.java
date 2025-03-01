import java.util.Scanner;
public class Main{
    public static void main(String[]args)
    {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=S.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=38)
            {
                int next5=(arr[i]/5+1)*5;
                if(next5-arr[i]<3)
                {
                    arr[i]=next5;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
            
    }
}