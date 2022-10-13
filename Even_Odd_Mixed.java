import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int r=0,e=0,o=0;
        while(a!=0){
            r=a%10;
            if(r%2==0){
                e++;
            }
            else{
                o++;
            }
            a=a/10;
        }
        if(e>0 && o>0){
            System.out.println("Mixed");
        }
        else if(e>0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}