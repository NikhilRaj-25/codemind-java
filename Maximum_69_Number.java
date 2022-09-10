import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,i=0;
        int x=n,count=0;
        while(x!=0)
        {
            count++;
            r=x%10;
            x=x/10;
        }
        int arr[]=new int[count];
        while(n!=0)
        {
            r=n%10;
            arr[i]=r;
            i++;
            n=n/10;
        }
        for(i=count-1;i>=0;i--)
        {
            if(arr[i]==6)
            {
                arr[i]=9;
                break;
            }
        }
        for(i=count-1;i>=0;i--)
        {
            System.out.print(arr[i]+"");
        }
    }
}