import java.util.Scanner;
 public class key{
     public static void main(String[] args){
         Scanner t=new Scanner(System.in);
        int n=t.nextInt();
         int r,s=0;
         while(n!=0)
         {
            r=n%10;
            s=s*10+r;
            n=n/10;
         }
         System.out.println(s);
     }
 }

