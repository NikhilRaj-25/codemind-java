import java.util.Scanner;
import java.lang.Math;
public class file{
    public static boolean isprime(int a){
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c1=0,c2=0;
        if(isprime(a)){
            System.out.println("0");
        }
        else{
            for(int i=a;i<a+100;i++){
                if(isprime(i)){
                        c1=i;
                    break;
                }
            }
            for(int i=a;i>a-100;i--){
                if(isprime(i)){
                    c2=i;
                    break;
                }
            }
            if((c1-a)>(a-c2)){
                System.out.println(a-c2);
            }
            else{
                System.out.println(c1-a);
            }
        }
    }
}