import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=1;i<=N;i++){
            int temp=i,sum=0;
            while (temp>0){
                int d=temp%10;
                sum+=d*d*d;
                temp/=10;
            }
            if (sum==i)
                System.out.print(i+" ");
        }
    }
}
