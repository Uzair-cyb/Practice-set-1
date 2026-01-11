import java.util.Scanner;

public class code7 {
 public static void main(String[] args) {
    
 
    Scanner read;
    read = new Scanner (System.in);
    System.out.print("Enter length of side a: ");
    double a = read.nextDouble();
    System.out.print("Enter length of side b: ");
    double b = read.nextDouble();
    System.out.print("Enter length of side c: ");
    double c = read.nextDouble();
    
    double s = (a+b+c)/2;
    double Area = (s*(s-a)*(s-b)*(s-c));
    System.out.print("Area is");
    System.out.print(Area);
}
}