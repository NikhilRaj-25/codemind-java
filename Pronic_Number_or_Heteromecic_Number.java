import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s=0,c=0;
        for(int i=1;i<a/2;i++){
            s=i*(i+1);
            if(s==a){
                c=1;
                break;
            }
        }
        if(c==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}