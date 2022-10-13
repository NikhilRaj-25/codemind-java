import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int a=0,b=1,co=0,c=0;
        while(c<=d)//0<5
        {
            if(c==d){
                co=1;
                System.out.println("True");
            }
            c=a+b;
            a=b;
            b=c;
        }
        if(co==0){
            System.out.println("False");
        }
    }
}