import java.util.Scanner;
public class code4 {
    public static void main(String[] args) {
        Scanner read;
        read = new Scanner(System.in);
        System.out.print("Enter actual price: ");
        int price = read.nextInt();
        System.out.print("Enter how much discount you want: ");
        int discount =  read.nextInt();
        double actual_discount = price*(1.0*discount/100);
        double discounted_price = price - actual_discount;
        System.out.print("The price after discount is: ");
        System.out.print(discounted_price);

    }
    } 
