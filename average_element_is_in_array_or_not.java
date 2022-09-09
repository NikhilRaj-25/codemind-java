import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int x[]=new int[a];
        int b=0,c=0;
        for(int i=0;i<a;i++){
            x[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            b+=i;
        }
        b=b/a;
        for(int i=0;i<a;i++){
            if(x[i]==b){
                System.out.println("True");
                c=1;
                break;
            }
        }
        if(c==0){
            System.out.println("False");
        }
    }
}