import java.util.Scanner;
public class code6{

    public static void main(String[] args){
        Scanner read;
        read = new Scanner(System.in);
        System.out.print("Enter the length of side a of a Trapezium: ");
        double a = read.nextDouble();
        System.out.print("Enter length of side b: ");
        double b = read.nextDouble();
        System.out.print("Enter the perpendicular height between these sides: ");
        double h = read.nextDouble();
        double Area = h*(a+b)/2;
        System.out.print("The Area of Trapezium is: ");
        System.out.print(Area);



    }}