import java.util.*;
import java.lang.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,temp=0,fac;
        n=sc.nextInt();
        int k=n;
        while(true)
        {
            k++;
            int j,sum=0,res=0;
            for(j=1;j<=Math.sqrt(k);j++)
            {
                if(k%j==0)
                {
                    sum++;
                }
            }
            if(sum==1)
            {
                int x=k,a,ans=0;
                while(x>0)
                {
                    a=x%10;
                    ans=ans*10+a;
                    x=x/10;
                }
                if(ans==k)
                {
                    res=1;
                    break;
                }
            }
        }
        System.out.println(k);
    }
}