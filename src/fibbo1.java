import java.util.*;
public class fibbo1
{public static void main(String[] args)
{int num1=0,num2=1,num3;
    System.out.println("Enter the value");
    Scanner scanner=new Scanner(System.in);
    num3=scanner.nextInt();
    for(int i=0; i<num3; i++)
    {System.out.println(num1);
        int sum=num1+num2;
        num1=num2;
        num2=sum;
    }}}