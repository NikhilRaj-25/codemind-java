import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sq1=a*a,b=a,r=0,s=0;
        while(b!=0){
            r=b%10;
            s=s*10+r;
            b=b/10;
        }
        int sq2=s*s;
        r=0;
        s=0;
        while(sq2!=0){
            r=sq2%10;
            s=s*10+r;
            sq2=sq2/10;
        }
        if(sq1==s){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}