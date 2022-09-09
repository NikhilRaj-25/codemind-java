import java.util.*;
public class file{
    public static void main(String[] args){
        Scanner ab=new Scanner(System.in);
        double c,f;
        f=ab.nextDouble();
        c=(f-32)/1.8;
        System.out.printf("%.2f",c);
    }
}