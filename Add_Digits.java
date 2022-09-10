import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c,b=0,i,sum=0;
        c=a;
        while(true)
        {   
            sum=0;
            if(a<10)
            {
                System.out.println(c);
                break;
            }
            else
            {
                while(true)
                {
                    b=c%10;
                    c=c/10;
                    sum+=b;
                    if(c==0)
                    {
                        c=sum;
                        a=sum;
                        break;
                    }
                }
            }
        }
    }
}