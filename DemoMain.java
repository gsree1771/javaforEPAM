import java.util.*;
public class DemoMain
{
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter first number");
   int n1=sc.nextInt();
   System.out.println("Enter second number");
   int n2=sc.nextInt();
System.out.println(n1+"^"+n2+" : "+Cal.powerInt(n1,n2));
         System.out.println(n1+"^"+n2+" : "+Cal.powerDouble(n1,n2));
}
}
 class Cal{
static double b,a;
    static double powerInt(int n1,int n2){
   a=Math.pow(n1,n2);
   return a;
}
static double powerDouble(double n1,int n2){
   b=Math.pow((double)n1,n2);
   return b;
}
}

