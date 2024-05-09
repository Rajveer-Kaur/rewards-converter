import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        var scanner = new Scanner(System.in);
        
        // Displaying a welcome message
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Choose an option:");
        System.out.println("1. Convert cash to miles");
        System.out.println("2. Convert miles to cash");
        
        // Getting user input for choice
        int choice;
        try {
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException exception) {
            // Catching exception if input cannot be parsed as an integer
            System.out.println("Invalid choice, exiting");
            return; // Exiting the program
        }

        double value;
        String resultType;
        
        switch (choice) {
            case 1:
                // Converting cash to miles
                System.out.println("Enter cash value to convert to miles: ");
                resultType = "miles";
                break;
            case 2:
                // Converting miles to cash
                System.out.println("Enter miles value to convert to cash: ");
                resultType = "cash";
                break;
            default:
                System.out.println("Invalid choice, exiting");
                return;
        }

        // Getting user input for value
        try {
            value = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException exception) {
            // Catching exception if input cannot be parsed as a double
            System.out.println("Invalid value, exiting");
            return; // Exiting the program
        }
        
        // Creating a RewardValue object based on user's choice
        var rewardsValue = new RewardValue(value, resultType);
        
        // Displaying the result
        if (resultType.equals("miles")) {
            System.out.println("$" + value + " is worth " + rewardsValue.getMilesValue() + " miles");
        } else {
            System.out.println(rewardsValue.getCashValue() + " miles is worth $" + value);
        }
    }
}
