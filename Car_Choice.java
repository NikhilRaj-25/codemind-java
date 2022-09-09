import java.util.*;
public class file{
    public static void main(String[] args){
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(int i=0;i<a;i++){
            float b,c,d,e;
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            e=sc.nextInt();
            if((d/b)>(e/c)){
                System.out.println("1");
            }
            else if((d/b)==(e/c)){
                System.out.println("0");
            }
            else{
                System.out.println("-1");
            }
        }
    }
}