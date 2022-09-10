import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s1=0,s2=0,i;
        for(i=1;i<=a/2;i++){
            if(a%i==0){
                s1+=i;
            }
        }
        for(i=1;i<=b/2;i++){
            if(b%i==0){
                s2+=i;
            }
        }
        if(s1==b && s2==a){
            System.out.println("Amicable");
        }
        else{
            System.out.println("Not Amicable");
        }
    }
}