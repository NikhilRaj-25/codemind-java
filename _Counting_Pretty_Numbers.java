import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int j=0;j<a;j++){
            int d=0,r=0;
            int b=sc.nextInt();
            int c=sc.nextInt();
            for(int i=b;i<=c;i++){
                r=i%10;
                if(r==2 || r==3 || r==9){
                    d++;
                }
            }
            System.out.println(d);
        }
    }
}