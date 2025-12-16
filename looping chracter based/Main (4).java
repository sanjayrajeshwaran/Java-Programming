import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first alphabet:");
        char start=scanner.next().charAt(0);
        System.out.print("Enter second alphabet:");
        char end=scanner.next().charAt(0);
        for (char ch=(char)(start+1);ch<end;ch++){
            System.out.print(ch+" ");
        }
    }
}
