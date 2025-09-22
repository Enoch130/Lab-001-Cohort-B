import java.util.Scanner;
public class PlayerSelection {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = myObj.nextLine();
        System.out.print("Enter your age: ");
        int age = myObj.nextInt();
        System.out.print("Enter your height (in meters): ");
        double height = myObj.nextDouble();
        System.out.print("Enter your weight (in pounds): ");
        double weight = myObj.nextDouble();
        System.out.print("Enter your jersey number: ");
        int jerseyNumber = myObj.nextInt();
        double POUND = 0.45359237;
        double METER = 100;
        double kilogram = POUND * weight;
        double heightCentimeters = METER * height;
        int roundedWeight = (int)kilogram;
        boolean eligible = (age < 35 && age >= 18 && roundedWeight < 90);
        if (eligible) {
            System.out.println("Player is Eligible");
        } else {
            System.out.println("Player is not Eligible");
        }
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
        String position;
        switch (jerseyNumber) {
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
        boolean isAttacker = (jerseyNumber == 7 || jerseyNumber == 9 || jerseyNumber == 10 || jerseyNumber == 11);
        String attackerStatus = isAttacker ? "Yes" : "No";

        String lineUp = "None";
        if (category.equals("Prime Player")){
            if ( roundedWeight < 80){
                lineUp = "Starting";
            }
        }
        else{
            lineUp = "bench";
        }

        String finalDecision = eligible ? "Play" : "Rest";

        System.out.println("Player: " + name);
        System.out.println("Age: " + age + "(" + category + ")");
        System.out.println("Height: " + heightCentimeters + "cm");
        System.out.println("Weight: " + roundedWeight + "kg");
        System.out.println("Jersey: " + jerseyNumber);
        System.out.println("Position: " + position);
        System.out.println("Attacker jersey: " + attackerStatus);
        System.out.println("Eligibility: " + eligible);
        System.out.println("Lineup Decision: " + lineUp);
        System.out.println("Final Decision: " + finalDecision);





    }
}