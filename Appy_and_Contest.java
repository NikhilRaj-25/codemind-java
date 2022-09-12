import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int b,c,i,t,j;
        long a,d,ans=0;
        t=sc.nextInt();
        for(i=0;i<t;i++){
            ans=0;
            a=sc.nextLong();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextLong();
            for(j=1;j<=a;j++){
                if(j%a==0 && j%b!=0){
                    ans+=1;
                    if(ans>=d){
                        break;
                    }
                }
                else if(j%b==0 && j%a!=0){
                    ans+=1;
                    if (ans>=d){
                        break;
                    }   
                }   
            }
            if(ans>=d){
                System.out.println("Win");
            }
            else{
                System.out.println("Lose");
            }
        }
    }
}