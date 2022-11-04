import java.util.*;
import java.lang.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0,d=0,e=a;
        c=(int)Math.pow(10,b);
        d=a%c;
        int r=0,s=0;
        while(a!=0){
            r=a%10;
            s=s*10+r;
            a=a/10;
        }
        int f=s%c;
        s=0;
        r=0;
        while(f!=0){
            r=f%10;
            s=s*10+r;
            f=f/10;
        }
        System.out.println(Math.abs(d-s));
    }
}