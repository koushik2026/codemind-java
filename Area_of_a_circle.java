import java.util.Scanner;
public class key{
    public static void main(String args[]){
        Float r,a;
        Scanner sc=new Scanner(System.in);
        r=sc.nextFloat();
        
        a=3.14f*r*r;
        System.out.printf("%.2f",a);
    }
}