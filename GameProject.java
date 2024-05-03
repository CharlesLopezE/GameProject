import java.util.Scanner;
import java.util.Random;

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
        // Introduce a 3-second delay
        try {
            Thread.sleep(2000); // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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
        Scanner gameInput = new Scanner (System.in);
        Random random = new Random();

        boolean validHero = false;

        while(!validHero){

        System.out.println();
        System.out.print("Enter: ");
        String heroName = gameInput.nextLine();

        System.out.println();
        System.out.println("Welcome " + heroName + "! Let your journey commence!");
        System.out.println();

        try {
            Thread.sleep(2000); // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        switch (heroName){
            case "Knight":
                System.out.println( "Your quest is to save the princess that is held captive in a castle!");
                validHero = true;
                if (heroName.equals("Knight")){
                  String knightInv;
                    knightInv = "Iron Sword, Wooden Shield, Iron Armor";
                    System.out.println();
                    System.out.println("Your Starting equipment will be " + knightInv);
                    System.out.println();
                    int health = 100;
                    System.out.println("Your health: " + health);
                    System.out.println();
                }
            break;
            case "Mage":
                System.out.println("Your quest is to stop the corrupt Wizard from destroying the town!");
                validHero = true;
                if (heroName.equals("Mage")){
                    String mageInv;
                      mageInv = "Magic Staff, Scroll of Fireball, Light Iron Armor";
                      System.out.println();
                      System.out.println("Your Starting equipment will be " + mageInv);
                      System.out.println();
                      int health = 80;
                      System.out.println("Your health: " + health);
                      System.out.println();
                }
                try {
                    Thread.sleep(2000); // 2000 milliseconds = 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("You come across a town and a townfolk aproaches you.");
                System.out.println();
                System.out.println("Townfoll: 'You there! are you a mage!?'");
                System.out.println();
                System.out.print("Enter 'yes' to continue or 'no' to end game: ");
                String userResp = gameInput.nextLine();

                while (!userResp.equalsIgnoreCase("yes") && !userResp.equalsIgnoreCase("no")){
                    System.out.println();
                    System.out.println("Townfolk: 'I didn't quiet get that.' Choose 'yes' or 'no'.");
                    System.out.println();
                    System.out.print("Enter 'yes' to continue or 'no' to end the game: ");
                    userResp = gameInput.nextLine();
                }

                try {
                    Thread.sleep(2000); // 2000 milliseconds = 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (userResp.equalsIgnoreCase("yes")){
                    System.out.println();
                    System.out.println("Townfolk: 'Ah, you are! Then you are well enough to take down the corrupted wizard!'");
                    System.out.println();
                    System.out.println("Townfolk: 'Head to the cathedral to stop him!'");
                    System.out.println();
                    System.out.println("You head to the cathedral but encounter a chest.");
                    System.out.println();
                    System.out.print("Open the chest to see what is inside. ");

                    String chestUse = gameInput.nextLine();

                    try {
                        Thread.sleep(2000); // 2000 milliseconds = 2 seconds
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (chestUse.equalsIgnoreCase("yes")){
                        System.out.println();
                        System.out.println("You opened the chest and found the following items:");
                        System.out.println();
                        System.out.println("1. Scroll of Lightning...");
                        System.out.println("2. Health Potion...");
                        System.out.println("3. Metal Shield...");
                        System.out.println();
                        System.out.print("Choose an item by choosing its number:");
                        int selectItem = gameInput.nextInt();
                        System.out.println();
                        

                        switch (selectItem) {
                            case 1: 
                                System.out.println("You have chosen the Scroll of Lightning! You feel a spark!");
                            break;
                            case 2: 
                                System.out.println("You have taken a Health Potion! You feel lavished!");
                            break;
                            case 3: 
                                System.out.println("You have taken a Metal Shield! Great durability!");
                            default: 
                                System.out.println("No decision was made, you left the chest untouched.");
                        }
                    } else {
                        System.out.println("You decided not to open the chest. You continue ur walk to the cathedral...");
                    }
                }

                else if (userResp.equalsIgnoreCase("no")){
                    System.out.println();
                    System.out.println("Well then, I guess we are doomed...");
                    System.out.println();
                    System.out.println("Game over. Thanks for playing!");
                    System.out.println();
                    System.exit(0);
                } 
                System.out.println();
                System.out.println("You have reached the entrance of the cathedral.");
                System.out.println();
                try {
                    Thread.sleep(2000); // 2000 milliseconds = 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("You decided to enter to face the wizard.");
                System.out.println();
                try {
                    Thread.sleep(2000); // 2000 milliseconds = 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("The air crackles with magic, and at the altar stands the corrupted wizard...");
                System.out.println();
                try {
                    Thread.sleep(2000); // 2000 milliseconds = 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("He slowly turns to face you, eyes glowing with malevolence...");
                System.out.println();
                try {
                    Thread.sleep(2000); // 2000 milliseconds = 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("The battle begins immediately!");
                System.out.println();

                int playerHP = 80;
                int wizardHP = 100;

                while (playerHP > 0 && wizardHP > 0) {
                    System.out.println("Your Health: " + playerHP);
                    System.out.println("Wizard Health: " + wizardHP);
                    System.out.println();
                    System.out.println("Choose your action:");
                    System.out.println("1. Attack");
                    System.out.println("2. Cast spell");
                    int playerAct = gameInput.nextInt();
                    gameInput.nextLine();

                    switch (playerAct){
                        case 1:
                            if(random.nextDouble() < 0.8){
                                int playerDam = 20;
                                wizardHP -= playerDam;
                                System.out.println();
                                System.out.println("You dealt damage to the wizard with your staff! Wizard's health -" + playerDam);
                                System.out.println();
                            } else {
                                System.out.println();
                                System.out.println("Your attack missed!");
                                System.out.println();
                            }
                            break;
                        case 2:
                        if(random.nextDouble() < 0.7){
                            int spellDam = 30;
                            wizardHP -= spellDam;
                            System.out.println();
                            System.out.println("You striked the wizard with your spell! Wizard's health -" + spellDam);
                        } else {
                            System.out.println("Your attack misses!");
                            System.out.println();
                        }
                        break;
                    default:
                        System.out.println("Invalid action. You hesistated...");
                        System.out.println();
                    }

                    if (random.nextDouble() < 0.7){
                        int wizardDam = 25;
                        playerHP -= wizardDam;
                        System.out.println();
                        System.out.println("The wizard retaliates with dark magic! Your health-" + wizardDam);
                        System.out.println();
                    } else {
                        System.out.println("The wizard's attack misses!");
                        System.out.println();
                    }
                }

                if (playerHP <= 0) {
                    System.out.println("You have been defeated. The corrupted wizard triumphs the town.");
                    System.out.println();
                } else {
                    System.out.println("Congrats! You have defeated the corrupted wizard!");
                    System.out.println();
                    System.out.println("You emerge victorius and restore peace to the land.");
                }
            break;
            case "Assassin":
                System.out.println("You will find the ancient artifact to save the creed!");
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
