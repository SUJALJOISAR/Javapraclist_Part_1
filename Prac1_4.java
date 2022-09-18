import java.util.Scanner;
public class Prac1_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Answer the following Multiple Choice Questions:-");
        //String s=new String();
        char[][] arr=new char[8][10];
        for(int i=0;i<8;i++)//8 students
        {
            System.out.print("Student"+i+" ");
            for(int j=0;j<10;j++)//10 questions
            {
                arr[i][j]=sc.next().charAt(0);
            }  
            System.out.print("\n");          
        }

        //Answer Key
        char[] arr1={'D','B','D','C','C','D','A','E','A','D'};
        // arr[0]='D';
        // arr[1]='B';
        // arr[2]='D';
        // arr[3]='C';
        // arr[4]='C';
        // arr[5]='D';
        // arr[6]='A';
        // arr[7]='E';
        // arr[8]='A';
        // arr[9]='D';
        //TO CONVERT STRING INTO CHAR ARRAY
        //THEN string[] s="javatpoint";
        //char[] arr=value.toCharArray();
        //char[] arr={'A','B'} also intilaize in this way
        for(int i=0;i<8;i++)
        {
           int cnt=0;
            for(int j=0;j<10;j++)
            {
                if(arr[i][j]==arr1[j])
                cnt++;
            }
            System.out.println("The correct Answers of Student" + " "+ i + "is" +cnt);
        }
        System.out.println("This program is made by 21ce046_joisar sujal");
    }
}
