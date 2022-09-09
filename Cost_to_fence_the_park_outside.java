import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        int B=sc.nextInt();
        int W=sc.nextInt();
        int C=sc.nextInt();
        int area=0,Total=0;
        if(L<=W+W || B<=W+W)
        { 
            area=((L+2*W)*(B+2*W))-L*B; 
            Total=area*C; 
            System.out.println(Total);
        }
        else 
        { 
            System.out.println("IMPOSSIBLE");
        } 
    }
}