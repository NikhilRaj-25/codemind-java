import java.util.*;
import java.math.*;
public class file{
    public static boolean isprime(int a){
        if(a<2)
            return false;
        else{
            for(int i=2;i<=Math.sqrt(a);i++){
                if(a%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
    }
}