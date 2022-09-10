import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i,fact=1,temp,sum=0,rem;
        temp=a;
        while(a!=0)
	    {
    		fact=1;
		    rem=a%10;
		    for(i=1;i<=rem;i++)
		    {	
		    fact = fact*i;
		    }
		    sum=sum+fact;
		    a=a/10;
	    }
	    if(temp==sum)
	    {
	        System.out.println("The number "+temp+" is a strong number");

    	}
    	else
    	{
		    System.out.println("The number "+temp+" is not a strong number");
	    }
    }
}