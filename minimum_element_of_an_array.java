import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int x[]=new int[a];
        int b=9999;
        for(int i=0;i<a;i++){
            x[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            if(b>x[i]){
                b=x[i];
            }
        }
        System.out.println(b);
    }
}