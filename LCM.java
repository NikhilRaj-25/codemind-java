import java.util.*;
public class file{
    public static void main(String[] args){
	    int a,b,i,c,count=0;
	    Scanner sc=new Scanner(System.in);
	    a=sc.nextInt();
	    b=sc.nextInt();
	    for(i=1;i<=b;i++)
	    {
    		c=a*i;
	    	if(c%b==0)
		    {
    			System.out.println(c);
	    		break;
    		}
	    	count++;
	    }
    }
}