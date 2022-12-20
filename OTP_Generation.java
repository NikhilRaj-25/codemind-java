import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int a=Integer.parseInt(s1);
        int ans=0,r=0,s=0;
        while(a!=0){
            r=a%10;
            s=s*10+r;
            a=a/10;
        }
        while(s!=0){
            r=s%10;
            if(r%2!=0){
                r=r*r;
                System.out.print(r+"");
            }
            s=s/10;
        }
    }
}