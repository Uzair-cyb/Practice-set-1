import java.util.Scanner;
public class code5{

    public static void main(String[] args){
        Scanner read;
        read = new Scanner(System.in);
        System.out.print("Enter voltage count: ");
        double volt = read.nextDouble();
        System.out.print("Enter current count: ");
        double current = read.nextDouble();
        double power = volt * current;
        System.out.print("The total power draw of a system is: ");
        System.out.print(power);
    }
}