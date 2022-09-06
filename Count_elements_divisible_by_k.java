import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x[]=new int[a];
        int c=0;
        for(int i=0;i<a;i++){
            x[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            if(x[i]%b==0){
                c++;
            }
        }
        System.out.println(c);
    }
}