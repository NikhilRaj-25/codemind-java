import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        char ch=ab.next().charAt(0); 
        if(ch =='r' || ch=='R')
        {
            System.out.println("Red");
        }
        else if(ch=='g' || ch=='G')
        {
            System.out.println("Green");
        }
        else if(ch=='v' || ch=='V')
        {
            System.out.println("Violet");
        }else if(ch=='i' || ch=='I')
        {
            System.out.println("Indigo");
        }
        else if(ch=='b' || ch=='B'){
            System.out.println("Blue");
        }
        else if(ch=='y' || ch=='Y')
        {
            System.out.println("Yellow");
        }
        else if(ch=='O' || ch=='o')
        {
            System.out.println("Orange");
        }
        else{
            System.out.println("-1");
        }
    }
}