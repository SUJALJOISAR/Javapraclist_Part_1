import java.util.Scanner;
/*class Test
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Non-Negative value:");
        String s1=sc.next();
        System.out.println("Enter seconf Non-Negative value: ");
        String s2=sc.next();
        if(s1.charAt(0)==s2.charAt(0))
        System.out.println("true");
        else
        System.out.println("false");
    }
}*/

class Prac1_3
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Non-Negative value:");
        int n1=sc.nextInt();
        System.out.println("Enter second Non-Negative value: ");
        int n2=sc.nextInt();
        int rem1=0,rem2=0;
        while(n1>0)
        {
            rem1=n1%10;
            n1=n1/10;
        }
        
        while(n2>0)
        {
            rem2=n2%10;
            n2=n2/10;
        }
        if(rem1==rem2)
        System.out.println("true");
        else
        System.out.println("false");
        System.out.println("This program is made by 21ce046_joisar sujal");
    }
}