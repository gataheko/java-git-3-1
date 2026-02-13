import java.util.Scanner;
import java.text.NumberFormat;

public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            double miles = Double.parseDouble(sc.nextLine());
            
            System.out.print("Enter gallons of gas used: ");
            double gallons = Double.parseDouble(sc.nextLine());
            
            double mpg = miles / gallons;
            mpg = Math.round(mpg * 100.0) / 100.0;
            
            NumberFormat number = NumberFormat.getNumberInstance();
            number.setMaximumFractionDigits(2);
            number.setMinimumFractionDigits(2);
            
            System.out.println("Miles per gallon is " + number.format(mpg) + ".");
            System.out.println();
            
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        
        System.out.println("Goodbye!");
        sc.close();
    }
}