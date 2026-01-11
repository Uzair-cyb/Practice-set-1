import java.util.Scanner;
public class code3 {
    public static void main(String[] args) {
        Scanner read;
        read = new Scanner(System.in);
        System.out.print("Enter actual price: ");
        int price = read.nextInt();
        double discount =  0.2 * price;
        double discounted_price = price - discount;
        System.out.print("The price after 20% of discount is: ");
        System.out.print(discounted_price);

    }
    }
