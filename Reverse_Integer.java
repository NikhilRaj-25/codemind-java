import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r=0,s=0,b=a;
        if(a>0){
            while(b!=0){
                r=b%10;
                s=s*10+r;
                b=b/10;
            }
            System.out.println(s);
        }
        else{
            int a1=a-a-a;
            b=a1;
            while(b!=0){
                r=b%10;
                s=s*10+r;
                b=b/10;
            }
            int ans=s-s-s;
            System.out.println(ans);
        }
    }
}