import java.util.Scanner;
 public class code1{
    public static void main(String[] args) {
        Scanner read;
        read = new Scanner(System.in);
        System.out.print("Enter marks you obtained: ");
        int obtained_marks = read.nextInt();
        System.out.print("Enter total marks: ");
        int total_marks = read.nextInt();
        double percentage = 1.0 * obtained_marks/total_marks * 100; 
        System.out.print("Your percentage is: ");
        System.out.print(percentage);
    }
 }


