import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s=0;
        for(int i=0;i<a*b;i++){
            int c=sc.nextInt();
            s+=c;
        }
        System.out.println(s);
    }
}