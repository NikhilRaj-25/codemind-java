import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s=s1+s2;
        int num=65;
        for(int i=0;i<100;i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==num){
                    System.out.print(s.charAt(j)+"");
                }
            }
            num++;
        }
    }
}