import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int x[]=new int[a];
        for(int i=0;i<a;i++){
            x[i]=sc.nextInt();
        }
        int o=0;
        for(int i=0;i<a;i++){
            if(x[i]%2!=0){
                o=i;
            }
        }
        System.out.println(o);
    }
}