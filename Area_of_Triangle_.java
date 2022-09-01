import java.lang.*;
import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a,b,c,area,d,s;
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        s=(a+b+c)/2;
        d=s*(s-a)*(s-b)*(s-c);
        area=Math.sqrt(d);
        System.out.printf("%.2f",area);
    }
}