import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=-9999,r=0;
        while(a!=0){
            r=a%10;
            if(s<r){
                s=r;
            }
            a=a/10;
        }
        System.out.println(s);
    }
}