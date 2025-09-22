import java.util.Scanner;
// Java class named FootballPlayer
public class FootballPlayer {
    public static void main(String[] args) {
        // Declare a string variable to store the name
        String name;
        // Declare an integer variable to store the age
        int age;
        // Declare a double variable to store the height
        double height;
        // Declare a double variable to store the weight
        double weight;
        // Declare an integer variable to store the jersey number
        int jerseyNumber;
        // Create an object to take input from the user
        Scanner myObj = new Scanner(System.in);
        // Print the instructions on the screen and read their inputs
        System.out.print("Enter your name: ");
        name = myObj.nextLine();
        System.out.print("Enter your age: ");
        age = myObj.nextInt();
        System.out.print("Enter your height (in meters): ");
        height = myObj.nextDouble();
        System.out.print("Enter your weight (in pounds): ");
        weight = myObj.nextDouble();
        System.out.print("Enter your jersey number: ");
        jerseyNumber = myObj.nextInt();
        // Display the output
        System.out.println("Player Name - " + name);
        System.out.println("Age - " + age);
        System.out.println("Height - " + height + "m");
        System.out.println("Weight - " + weight + "lbs");
        System.out.println("Jersey Number - " + jerseyNumber);

        // TASK 2
        // Declare double variables and assign their corresponding values
        double POUND = 0.45359237;
        double METER = 100;
        double kilogram = POUND * weight;
        double centimeters = METER * height;
        // Convert the rounded weight from double into an integer
        int roundedWeight = (int)kilogram;
        // Display the output
        System.out.println("Player Name - " + name);
        System.out.println("Age - " + age);
        System.out.println("Height in centimeters - " + centimeters + "cm");
        System.out.println("Weight in Kilograms - " + roundedWeight + "Kg");
        System.out.println("Jersey Number - " + jerseyNumber);

        // TASK 3
        // Display the current age
        System.out.println("Player's age now: " + age);
        // Increase the player's age by 1
        age++;
        // Decrease jersey number by 1
        jerseyNumber--;
        // Output the updated values
        System.out.println("The player's new age is: " + age + " and their jersey number is now: " + jerseyNumber);

        // TASK 4
        // Boolean expression for eligibility
        boolean eligible = (age < 35 && age >= 18 && roundedWeight < 90);
        if (eligible) {
            System.out.println("Player is Eligible");
        } else {
            System.out.println("Player is not Eligible");
        }
        // boolean expression to check if there is a problem
        boolean hasProblems = (age < 18 || roundedWeight > 90);
        if (hasProblems){
            System.out.println("Player has a problem: either he is too young or overweight");
        }
        // Boolean expression to check if it is not eligible
        boolean notEligible = (!(age >= 18 && age <= 35 && roundedWeight <= 90));
        if (notEligible){
            System.out.println("Not Eligible");
        }
        else{
            System.out.println("Eligible");
        }

        // TASK 5
        // Declare a string variable to store the category
        String category;
        if (age < 20){
            category = "Rising star";
        }
        else if (age <= 30){
            category = "Prime Player";
        }
        else {
            category = "Veteran";
        }
        // Output the category
        System.out.println("The player is in " + category + " category");

        // TASK 6
        // Output the instruction for the coach
        System.out.print("Enter the jersey number of the player: ");
        // read the input from user
        int num = myObj.nextInt();
        // switch cases

        String position;
        switch (num) {
            case 1:
                position = "Goalkeeper";
                break;
            case 2:
                position = "Defender";
                break;
            case 6:
                position = "Midfielder";
                break;
            case 7, 11:
                position = "Winger";
                break;
            case 9:
                position = "Striker";
                break;
            case 10:
                position = "Playmaker";
                break;
            case 5:
                position = "Defender";
                break;
            case 8:
                position = "Midfielder";
                break;
            default:
                position = "Player position not found";
        }

        System.out.println(position);

        // TASK 7
        // PART A
        switch (jerseyNumber) {
            case 1:
                System.out.println("Goalkeeper");
                break;
            case 2:  // no break here
                System.out.println("Defender");
            case 6:
                System.out.println("Midfielder");
            case 7:  // no break here
                System.out.println("Winger");
            case 9:
                System.out.println("Striker");
                break;
            default:
                System.out.println("Player position not known");
        }

        //PART B
        switch (num) {
            case 1:
                position = "Goalkeeper";
                break;
            case 2:
            case 5:
                position = "Defender";
                break;
            case 6:
            case 8:
                position = "Midfielder";
                break;
            case 7:
            case 11:
                position = "Winger";
                break;
            case 9:
                position = "Striker";
                break;
            case 10:
                position = "Playmaker";
                break;
            default:
                position = "Player position not found";
        }

        System.out.println(position);

        // TASK 8
        String lineUp;
        if (category.equals("Prime Player")){
            if ( roundedWeight < 80){
                lineUp = "Starting";
            }
        }
        else{
            lineUp = "bench";
        }

        // TASK 9
        String finalDecision = eligible ? "Play" : "Rest";
        System.out.println("The player is " + finalDecision + "ing");







    }





}