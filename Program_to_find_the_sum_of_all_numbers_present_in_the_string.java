import java.util.*;
public class file{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if(temp=='0' || temp=='1' || temp=='2'|| temp=='3'||temp=='4'||temp=='5'||temp=='6'|| temp=='7'||temp=='8'||temp=='9'){
                sum+=(int)temp-48;
            }
        }
        System.out.println(sum);
    }
}