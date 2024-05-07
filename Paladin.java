case "Assassin":
    System.out.println("You will find the ancient artifact to save the creed!");
    validHero = true;
    if (heroName.equals("Assassin")){
        String AssassinInv;
          AssassinInv = "Iron Dagger, Assassin Robes, Crossbow, Hidden Blade.";
          System.out.println();
          System.out.println("Your starting equipment will be " + AssassinInv);
          System.out.println();
          int health = 85;
          System.out.println("Your health: " + health);
          System.out.println();
    }
    try {
        Thread.sleep(2000); // 2000 milliseconds = 2 seconds
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("You Head into the lair of the Brotherhood");
    System.out.println();
    System.out.println("Brother: 'Assassin, We have a mission for you will you accept?'");
    System.out.println();
    System.out.print("Enter 'yes' to continue or 'no' to end game: ");
    String AssassinResp = gameInput.nextLine();

    while (!AssassinResp.equalsIgnoreCase("yes") && !AssassinResp.equalsIgnoreCase("no")){
        System.out.println();
        System.out.println("Brother: 'I didn't quite get that.' Choose 'yes' or 'no'.");
        System.out.println();
        System.out.print("Enter 'yes' to continue or 'no' to end the game: ");
        AssassinResp = gameInput.nextLine();
    }

    try {
        Thread.sleep(2000); // 2000 milliseconds = 2 seconds
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    if (AssassinResp.equalsIgnoreCase("yes")){
        System.out.println();
        System.out.println("Brother 'Excellent! Take this map and head to the headmaster to be debriefed'");
        System.out.println();
        System.out.println("Headmaster: 'Welcome! Your mission is to go to the Underground Church and steal the Sword of Eden'");
        System.out.println();
        System.out.println("Headmaster: To be better equipped here is a chest with supplies you may need, but you only get one... You're not the only Assassin in this Brotherhood");
        System.out.println();
        System.out.print("Will You open the chest to see what is inside? ");

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
            System.out.println("1. Cloak of Invisibility...");
            System.out.println("2. Health Potion...");
            System.out.println("3. Hidden Blade Gun");
            System.out.println();
            System.out.print("Choose an item by choosing its number:");
            int selectItem = gameInput.nextInt();
            System.out.println();


            switch (selectItem) {
                case 1:
                    System.out.println("You have chosen the Invisibility, You now hide in the shadows more effectively");
                break;
                case 2:
                    System.out.println("You have taken a Health Potion! You feel lavished!");
                break;
                case 3:
                    System.out.println("You have taken the Hidden Blade Gun, Caution It'll cause a lot of noise, not very Assassin like");
                default:
                    System.out.println("No decision was made, you left the chest untouched.");
            }
        } else {
            System.out.println("You decided not to open the chest. You go to your mission location");
        }
    }

    else if (AssassinResp.equalsIgnoreCase("no")){
        System.out.println();
        System.out.println("Traitor!, You will be exiled from the Brotherhood!");
        System.out.println();
        System.out.println("Game over. Thanks for playing!");
        System.out.println();
        System.exit(0);
    }
    System.out.println();
    System.out.println("You have reached the entrance of the former Church");
    System.out.println();
    try {
        Thread.sleep(2000); // 2000 milliseconds = 2 seconds
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("You decided to enter stealthly to steal the Sword of Eden");
    System.out.println();
    try {
        Thread.sleep(2000); // 2000 milliseconds = 2 seconds
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("The quiet Church suddenly got filled with the chorus of the Templars");
    System.out.println();
    try {
        Thread.sleep(2000); // 2000 milliseconds = 2 seconds
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("The Templar Grandmaster spots you!");
    System.out.println();
    try {
        Thread.sleep(2000); // 2000 milliseconds = 2 seconds
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("The battle begins immediately!");
    System.out.println();

    int AssassinHP = 85;
    int TemplarHP = 120;

    while (AssassinHP > 0 && TemplarHP > 0) {
        System.out.println("Your Health: " + AssassinHP);
        System.out.println("Templar Health: " + TemplarHP);
        System.out.println();
        System.out.println("Choose your action:");
        System.out.println("1. Attack");
        System.out.println("2. Use Projectile");
        int playerAct = gameInput.nextInt();
        gameInput.nextLine();

        switch (playerAct){
            case 1:
                if(random.nextDouble() < 0.8){
                    int playerDam = 40;
                    TemplarHP -= playerDam;
                    System.out.println();
                    System.out.println("You dealt damage to the Templar with your Hidden blade! Templar's health -" + playerDam);
                    System.out.println();
                } else {
                    System.out.println();
                    System.out.println("Your attack missed!");
                    System.out.println();
                }
                break;
            case 2:
            if(random.nextDouble() < 0.7){
                int ProjectileDam = 44;
                TemplarHP -= ProjectileDam;
                System.out.println();
                System.out.println("You Shot the Templar! Templar's health -" + ProjectileDam);
            } else {
                System.out.println("Your attack misses!");
                System.out.println();
            }
            break;
        default:
            System.out.println("Invalid action. You hesistated...");
            System.out.println();
        }

        if (random.nextDouble() < 0.6){
            int TemplarDam = 30;
            AssassinHP -= TemplarDam;
            System.out.println();
            System.out.println("The Templar Strikes back with the Sword Of Eden! Your health-" + TemplarDam);
            System.out.println();
        } else {
            System.out.println("The Templar's attack misses!");
            System.out.println();
        }
    }

    if (AssassinHP <= 0) {
        System.out.println("You have been Killed. The Brotherhood was destroyed");
        System.out.println();
    } else {
        System.out.println("Congrats! You have Killed the Templar Grandmaster");
        System.out.println();
        System.out.println("You stole the Sword Of Eden and protected the Brotherhood");
    }
break;
