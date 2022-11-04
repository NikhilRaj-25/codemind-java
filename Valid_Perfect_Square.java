import java.util.*;
import java.lang.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int q=0;q<t;q++){
            int a=sc.nextInt();
            int c=0;
            for(int i=1;i<=(a/2);i++){
                if(i*i==a){
                    c=1;
                    System.out.println("True");
                    break;
                }
            }
            if(c==0){
                System.out.println("False");
            }
        }
    }
}
