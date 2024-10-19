import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();
        
        for (int i = 0; i < numRows; i++) {
            int number = 1;
            // Print spaces to center-align the triangle
            for (int j = 0; j < numRows - i; j++) {
                System.out.print("   ");
            }
            
            for (int j = 0; j <= i; j++) {
                // Calculate and print the current number
                System.out.printf("%6d", number);
                
                // Calculate the next number using the previous number
                number = number * (i - j) / (j + 1);
            }
            
            // Move to the next line for the next row
            System.out.println();
        }
        
        scanner.close();
    }
}
