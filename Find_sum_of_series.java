import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double s=0;
        for(float i=1;i<=a;i++){
            s+=(float)(1/i);
        }
        System.out.printf("%.2f",s);
    }
}