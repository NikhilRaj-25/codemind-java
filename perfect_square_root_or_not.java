import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=0;
        for(int i=1;i<=(a/2);i++){
            if(i*i==a){
                b=1;
                System.out.println("True");
                break;
            }
        }
        if(b==0){
            System.out.println("False");
        }
    }
}