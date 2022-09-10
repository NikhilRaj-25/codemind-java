import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c,d,i=1,count=0;
        int b=sc.nextInt();
        c=a+b;
	    while(i<=c){
    		d=c+i;
		    count++;
		    int sum=0,j=1;
		    for(j=1;j<=d;j++){
    			if(d%j==0){
				    sum++;
			    }
		    }
		    if(sum==2){
    			System.out.println(count);
			    break;
		    }   
		    i++;
	    }
    }
}