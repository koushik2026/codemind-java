import java.util.Scanner;
public class key
{
    public static void main(String args[]){
        int p,t,r,si;
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        si=(p*t*r)/100;
        System.out.print(si);
    }
    
}