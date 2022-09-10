import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int x[]=new int[a];
        for(int i=0;i<a;i++){
            x[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        int c=0,ans=0;
        for(int i=0;i<a;i++){
            ans=x[i]+b;
            c=0;
            for(int j=0;j<a;j++){
                if(x[j]>ans){
                    c=1;
                    break;
                }
            }
            if(c==0){
                System.out.print("True ");
            }
            else{
                System.out.print("False ");
            }
        }
    }
}