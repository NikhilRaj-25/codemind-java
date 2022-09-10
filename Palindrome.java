import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n,r=0,s=0;
        while (m!=0){
            r=m%10;
            s=s*10+r;
            m=m/10;
        }
        if(s==n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}