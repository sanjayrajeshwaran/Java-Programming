import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int num=2,countPrime=0;
        while (countPrime<N){
            int count=0;
            for(int i=1;i<=num;i++){
                if(num%i==0)count++;
            }
            if(count==2){
                System.out.print(num+" ");
                countPrime++;
            }
            num++;
        }
    }
}
