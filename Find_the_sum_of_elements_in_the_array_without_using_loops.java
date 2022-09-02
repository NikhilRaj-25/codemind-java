import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int x[]=new int[a];
        int sum=0;
        for(int j=0;j<a;j++){
            x[j]=sc.nextInt();
            sum+=x[j];
        }
        System.out.println(sum);
    }
}