import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int b=0,a=0,l=0,o=0,n=0,ss=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b')
            {
                b+=1;
            }
            else if(s.charAt(i)=='a')
            {
                a+=1;
            }
            else if(s.charAt(i)=='l')
            {
                l+=1;
            }
            else if(s.charAt(i)=='o')
            {
                o+=1;
            }
            else if(s.charAt(i)=='n')
            {
                n+=1;
            }
            else if(s.charAt(i)=='s')
            {
                ss+=1;
            }
        }
        int ans=0;
        while(true){
            if(b<1 || a<1 || l<2 || o<2 || n<1){
                break;
            }
            else{
                ans+=1;
                b-=1;
                a-=1;
                l-=2;
                o-=2;
                n-=1;
            }
        }
        System.out.println(ans);
    }
}