import java.util.*;
import java.lang.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0,c=0;
        double co=0,s=0,ans=0;
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            b=arr[i];
            c=0;
            if(b>1){
                for(int j=2;j<=Math.sqrt(b);j++){
                if(b%j==0){
                        c=1;
                        break;
                    }
                }
                if(c==0){
                    s+=b;
                    co++;
                }
            }
        }
        ans=s/co;
        System.out.printf("%.2f",ans);
    }
}