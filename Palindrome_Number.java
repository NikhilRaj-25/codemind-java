import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int r=0,s=0,b=a;
            while(b!=0){
                r=b%10;
                s=s*10+r;
                b=b/10;
            }
            if(s==a){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
}