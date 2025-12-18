import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0,count=0;
        while (count<N){
            int num=sc.nextInt();
            if (num>0){
                sum+=num;
                count++;
            }
        }
        System.out.println("Sum="+sum);
    }
}

