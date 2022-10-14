import java.util.Scanner;
import java.lang.Math;
public class file{
    public static void main(String args[]){
        
        int i=1,j=0;
        double b=0,c=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(b<=a){
            b=Math.pow(2,i);
            c=Math.pow(2,j);
            i++;
            j++;
        }
        int d=0,e=0;
        d=(int)b;
        e=(int)c;
        if((d-a)<(a-e)){
            System.out.print(d-a);
        }
        else{
            System.out.println(a-e);
        }
    }
}