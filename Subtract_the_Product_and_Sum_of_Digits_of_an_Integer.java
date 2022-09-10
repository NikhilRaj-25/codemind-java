import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a,s=0,p=1,r=0;
        while(b!=0){
            r=b%10;
            s+=r;
            p*=r;
            b=b/10;
        }
        System.out.println(p-s);
    }
}