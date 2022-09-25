import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(i==j || i+j==a+1){
                    System.out.print(b+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            b--;
            System.out.println();
        }
    }
}