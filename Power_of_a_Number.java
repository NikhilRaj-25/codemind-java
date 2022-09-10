import java.util.*;
import java.lang.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int y=sc.nextInt();
        int m=sc.nextInt();
        double ans=Math.pow(a,y);
        System.out.printf("%.0f",ans%m);
    }
}