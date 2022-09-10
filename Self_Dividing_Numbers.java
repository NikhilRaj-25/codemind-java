import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b,x,r;
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
	    {
    		int count=0;
	    	x=i;
    		while(x>0)
	    	{
		    	r=x%10;
			    if(r==0)
			    {
    				count++;
	    			break;
			    }
			    if(i%r!=0)
			    {
    				count++;
			    }
			    x=x/10;
		    }
		    if(count==0)
		    {
    			System.out.print(i+" ");
		    }
	    }
    }
}