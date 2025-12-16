import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter a decimal number:");
        int num=sc.nextInt();
        int binary=0;
        int place=1;
        for(;num>0;num=num/2){
            int remainder=num%2;
            binary=binary+remainder*place;
            place=place*10;
        }
          System.out.println("Binary equivalent:"+binary);
    }
}
