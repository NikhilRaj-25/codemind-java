import java.util.*;
import java.lang.*;
public class file {
    public static boolean isprime(int a){
        if(a<2){
            return false;
        }
        else{
            for(int i=2;i<a;i++){
                if(a%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r=0,c=0,s=0;
        if(isprime(a)){
            while(a!=0){
                r=a%10;
                s=s*10+r;
                a=a/10;
            }
            if(isprime(s)){
                System.out.println("circular prime");
            }
            else{
                System.out.println("prime but not a circular prime");
            }
        }
        else{
            System.out.println("not prime");
        }
    }
}
