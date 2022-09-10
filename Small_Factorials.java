import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int p=1;
            for(int j=1;j<=a;j++){
                p*=j;
            }
            System.out.println(p);
        }
    }
}