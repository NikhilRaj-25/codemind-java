import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int q=0;q<t;q++){
            int a=sc.nextInt();
            int arr[]=new int[a-1];
            for(int i=0;i<a-1;i++){
                arr[i]=sc.nextInt();
            }
            int c=0,b=a;
            while(b!=0){
                for(int i=0;i<a-1;i++){
                    c=0;
                    if(b==arr[i]){
                        c=1;
                        break;
                    }
                }
                if(c==0){
                    System.out.println(b);
                    break;
                }
                b--;
            }
        }
    }
}