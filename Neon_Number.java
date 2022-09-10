import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a*a,r=0,s=0;
        while(b!=0){
            r=b%10;
            s+=r;
            b=b/10;
        }
        if(a==s){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not Neon Number");
        }
    }
}