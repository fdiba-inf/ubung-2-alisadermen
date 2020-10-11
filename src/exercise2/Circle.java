package exercise2;
import java.util.Scanner;
public class Circle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    int radius = input.nextInt();
    System.out.println("Circumference: " + 2*radius*Math.PI);
    System.out.println("Area: " + Math.pow(radius,2)*Math.PI);
  }
}