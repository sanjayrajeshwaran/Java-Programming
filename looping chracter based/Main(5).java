import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a string:");
        String input=scanner.nextLine().toLowerCase();
        System.out.println("Vowels:");
        for (char ch:input.toCharArray()){
            if ("aeiou".indexOf(ch)!=-1){
               System.out.print(ch+" ");
            }
        }
        
        System.out.println("\nConsonants:");
        for(char ch:input.toCharArray()){
            if("aeiou".indexOf(ch)==-1&&Character.isLetter(ch)){
                System.out.print(ch+" ");
            }
        }
    }
}
