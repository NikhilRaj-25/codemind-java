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
        int r=0,c=0;
        if(isprime(a)){
            while(a!=0){
                r=a%10;
                a=a/10;
                if(isprime(r)){
                    c=2;
                }
                else{
                    c=1;
                    break;
                }
            }
        }
        else{
            System.out.println("Not Mega Prime");
        }
        if(c==1){
            System.out.println("Not Mega Prime");
        }
        else if(c==2){
            System.out.println("Mega Prime");
        }
    }
}
