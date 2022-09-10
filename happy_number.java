import java.util.*;
import java.lang.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,x,r,ans=0;
        a=sc.nextInt();
	    while(a>0)
	    {  
		    r=a%10;
		    ans+=Math.pow(r,2);
		    a=a/10;
		    if(a==0 && ans<10)
		    {
    			if(ans==1 || ans==7)
	    		{
		    		System.out.println("True");
				    break;
			    }
			    else
			    {
				    System.out.println("False");
				    break;
    			}   
			
		    }
		    else if(a==0 && ans>=10)
		    {
			    a=ans;
			    r=0;
			    ans=0;
		    }
	    }
    }
}