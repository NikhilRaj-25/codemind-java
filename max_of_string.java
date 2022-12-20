import java.util.*;
class file{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ans=' ';
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if(ans<temp){
                ans=temp;
            }
        }
        System.out.println(ans);
    }
}