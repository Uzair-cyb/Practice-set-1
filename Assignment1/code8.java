import java.util.Scanner;
public class code8 {
    public static void main(String[] args) {
        
        Scanner read;
        read = new Scanner (System.in);
        System.out.print("Enter a number: ");
        double num = read.nextDouble();

        if(num % 2 == 0){
            System.out.print("EVEN");
        }
        else{
            System.out.print("ODD");
        }
    }
}
