import java.util.Scanner;
class Test
{
 public static void main(String[] args) 
    {
        System.out.println("Enter phone Number:");
        Scanner sc=new Scanner(System.in);
        String pn=sc.next();//take string as input from user
        String arr[]=pn.split("-");
        System.out.println("Mobile System Operator Code is :"+arr[1]);
        System.out.println("MSC is :"+arr[2]);
        System.out.println("Unique Code is :"+arr[3]);
        System.out.println("This program is made by 21ce046_joisar sujal");
    }
}