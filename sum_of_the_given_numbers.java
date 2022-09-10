import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int sum=0;
            int b=sc.nextInt();
            int a=sc.nextInt();
            sum=a+b;
            System.out.println(sum);
        }
    }
}