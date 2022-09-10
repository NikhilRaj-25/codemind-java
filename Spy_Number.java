import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rem,i,sum=0,product=1;
        while(a!=0)
	    {
    		rem=a%10;
            product=product*rem;
            sum=sum+rem;
            a=a/10;
	    }
	    if(sum==product)
	    {
    		System.out.println("Spy Number");
	    }
	    else
	    {
    		System.out.println("Not Spy Number");
	    }
    }
}