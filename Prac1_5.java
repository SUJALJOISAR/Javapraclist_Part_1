import java.util.Scanner;
public class Prac1_5 {
    public static void main(String[] args) {
        //triangle(0)->0
        //triangle(1)->1
        //triangle(2)->3
        Scanner sc=new Scanner(System.in);
        System.out.println("Input no of Rows:"+" ");
        int num=sc.nextInt();
        // int cnt=0;//loop
        // for(int i=1;i<=num;i++)
        // {
        //     cnt+=i;
        // }
        System.out.println("Number of Blocks in Triangle are"+" "+triangle(num));
        System.out.println("This program is made by 21ce046_joisar sujal");
    }

    public static int triangle(int row)
    {
        if(row==0)
        return 0;
        else
        return(row+triangle(row-1));//recursion
    }

    
}
