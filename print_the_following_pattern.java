import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=a;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}