import java.util.*;
public class file{
    public static boolean ispalindrome(int a){
        int b=(int)Math.log10(a);
        int c=0,d=0,e=1;
        while(a!=0){
            c=a/(int)Math.pow(10,b);
            d=a%10;
            if(c!=d){
                e=0;
                break;
            }
            a=a%(int)Math.pow(10,b);
            a=a/(int)Math.pow(10,b);
            b-=2;
        }
        if(e==1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        for(int i=a;i<=b;i++) {
            if (ispalindrome(i)) {
                    System.out.print(i + " ");
            }
        }
    }
}
