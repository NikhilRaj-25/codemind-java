import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<3){
            System.out.println("The pattern is not possible");
        }
        else{
            for(int i=0;i<a;i++){
                for(int j=0;j<i+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=0;i<a-1;i++){
                for(int j=a-1;j>i;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}