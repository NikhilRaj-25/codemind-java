import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=a/1000000000;
        if(b>=6){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}