import java.util.*;
import java.lang.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a*a;
        int c=a,co=0;
        while(c!=0){
            co++;
            c=c/10;
        }
        c=0;
        c=(int)Math.pow(10,co);
        int d=b%c;
        if(a==d){
            System.out.println("Automorphic Number");
        }
        else{
            System.out.println("Not an Automorphic Number");
        }
    }
}
