import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a binary number:");
        String binary=scanner.nextLine();
        int countOne=0,countZero=0;
        
        for(char ch:binary.toCharArray()){
            if(ch=='1'){
                countOne++;
            } else if(ch=='0'){
                countZero++;
            }
        }
        
        System.out.println("Number of 1s:"+countOne);
        System.out.println("Number of 0s:"+countZero);
    }
}
