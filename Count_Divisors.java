import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int k=sc.nextInt();
        int c=0;
        for(int i=a;i<=b;i++){
            if(i%k==0){
                c++;
            }
        }
        System.out.println(c);
    }
}