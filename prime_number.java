import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r=0;
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                r=1;
                break;
            }
        }
        if(r==0){
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }
    }
}