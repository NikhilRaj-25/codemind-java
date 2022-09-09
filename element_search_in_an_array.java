import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int x[]=new int[a];
        int b=0;
        for(int i=0;i<a;i++){
            x[i]=sc.nextInt();
        }
        int c=sc.nextInt();
        for(int i=0;i<a;i++){
            if(x[i]==c){
                System.out.println("True");
                b=1;
                break;
            }
        }
        if(b==0){
            System.out.println("False");
        }
    }
}
