import java.util.Scanner;
public class code2 {
    public static void main(String[] args) {
        Scanner read;
        read = new Scanner(System.in);
        System.out.print("Enter radius of Circle: ");
        double radius = read.nextDouble();
        double Circum = 2.0 * (3.142) * radius;
        System.out.print("Circumference is: ");
        System.out.print(Circum);
        double Area = 3.142 * radius * radius;
        System.out.print("Area is: ");
        System.out.print(Area);

    }
}
