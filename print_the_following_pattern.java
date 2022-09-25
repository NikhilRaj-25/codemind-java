import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=a;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print((char)(64+i)+" ");
            }
            System.out.println();
        }
    }
}