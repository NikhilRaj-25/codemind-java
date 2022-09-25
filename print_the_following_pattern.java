import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int k=a;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(i==j){
                    System.out.print("x");
                    if(i==k){
                        k--;
                    }
                }
                else if(k==j){
                    System.out.print("x");
                    k--;
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}