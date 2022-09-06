import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a,r=0,ans=0;
        while(a!=0){
            r=a%10;
            ans=ans*10+r;
            a=a/10;
        }
        if(b==ans){
            System.out.println("2");
        }
        else{
            System.out.println("1");
        }
    }
}