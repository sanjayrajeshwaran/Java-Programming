import java.util.Scanner;
public class Main{
    static int magic(int n) {
        while (n>9){
            int sum=0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            n=sum;
        }
        return n;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for (int i=1;i<=N;i++){
            if (magic(i)==1)
                System.out.print(i+" ");
        }
    }
}

