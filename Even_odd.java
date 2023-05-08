import java.util.*;
class Even_odd
{
   public static void main(String[] args)
   {
       int n,c;
       String b;
       Scanner in = new Scanner(System.in);
       System.out.println("enter the value of n:");
       n=in.nextInt();
       b = n%2==0?"even":"odd";
       System.out.println("The number is:"+b);
   } 
}