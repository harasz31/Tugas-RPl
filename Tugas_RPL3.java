import java.util.Scanner;

public class ComputerServiceCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for computer amount and service time
        System.out.print("Enter the number of computers: ");
        int computerAmount = scanner.nextInt();
        System.out.print("Is the service time in business hours? (Y/N): ");
        String serviceTime = scanner.next();
        System.out.print("Is the customer willing to drop off and pick up? (Y/N): ");
        String dropOffPickUp = scanner.next();
        
        int baseFee = 0;
        int additionalFee = 0;
        if (computerAmount == 1 || computerAmount == 2) {
            baseFee = 50;
            additionalFee = 0;
        } else if (computerAmount >= 3 && computerAmount <= 10) {
            baseFee = 100;
            additionalFee = 10;
        } else if (computerAmount > 10) {
            baseFee = 500;
            additionalFee = 10;
        }
        
       
        if (serviceTime.equalsIgnoreCase("N")) {
            baseFee *= 2;
        }
        
        
        if (dropOffPickUp.equalsIgnoreCase("Y")) {
            baseFee /= 2;
        }
        int totalFee = baseFee + additionalFee * computerAmount;
        
        System.out.println("Base fee: $" + baseFee);
        System.out.println("Additional fee: $" + additionalFee + " per peripheral");
        System.out.println("Total fee: $" + totalFee);
    }
}
