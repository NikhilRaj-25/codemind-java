import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int x[]=new int[a];
        int c=0,d=0;
        for(int i=0;i<a;i++){
            x[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            int r=0,ans=0,b;
            b=x[i];
            d=b;
            while(d!=0){
                r=d%10;
                ans=ans*10+r;
                d=d/10;
            }
            if(b==ans){
                c++;
            }
        }
        System.out.println(c);
    }
}