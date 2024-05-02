import java.util.Scanner;

public class GameProject {
    public static void main(String[] args) {
        Scanner numInt = new Scanner(System.in);

        System.out.println();
        System.out.println("Welcome to Medieval Dungeons");
        System.out.println();
        //This is the start of the game, if press 1 you may continue, press 2 a little warning,
        //and anything other than 1 or 2 the game will hate you...
        while (true) {
            System.out.print("Start Game: ");
            int start = numInt.nextInt();

            switch (start) {
                case 1:
                    System.out.println("You may continue!");
                    // Add your game logic here
                    playGame();
                    return;
                case 2:
                    System.out.println("Please enter the correct key to continue...");
                    break;
                default:
                    System.out.println("Invalid input. Please enter 1.");
            }
        }
    }

    // Placeholder for character selection
    private static void playGame() {
        // // Introduce a 3-second delay
        // try {
        //     Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // Continue with the game...
        System.out.println();
        System.out.println("Choose your Hero!");
        System.out.println();
        // Add more character selection logic here
        System.out.println("Heroes:");
        System.out.println();

        //makes the list of charcaters tha are inside the string...
        String[] characterNames = {"Knight", "Mage", "Assassin", "Paladin"};
        for (String name : characterNames){
            System.out.println("- " + name);
        }
        // allows to input the chracter names that is above inside the string...
        Scanner chrInput = new Scanner (System.in);

        boolean validHero = false;

        while(!validHero){

        System.out.println();
        System.out.print("Enter: ");
        String heroName = chrInput.nextLine();

        System.out.println();
        System.out.println("Welcome " + heroName + "! Let your journey commence!");
        System.out.println();

        // try {
        //     Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        switch (heroName){
            case "Knight":
                System.out.println( "Your quest is to save the princess that is held captive in a castle!");
                validHero = true;
                if (heroName.equals("Knight")){
                  String knightInv;
                    knightInv = "Iron Sword, Wooden Shield, Iron Armor";
                    System.out.println("");
                    System.out.println("Your Starting equipment will be " + knightInv);
                    System.out.println("");
                }
            break;
            case "Mage":
                System.out.println("Your quest is to stop the corrupt Wizard from destroying the town!");
                validHero = true;
            break;
            case "Assassin":
                System.out.println("You will find the ancient artifact to save the creed");
                validHero = true;
            break;
            case "Paladin":
                System.out.println("Your quest is to save the village from a horde of zombies!");
                validHero = true;
            break;
            default:
                System.out.println("Select the correct hero name to continue...");
            }
        }
    }
}
