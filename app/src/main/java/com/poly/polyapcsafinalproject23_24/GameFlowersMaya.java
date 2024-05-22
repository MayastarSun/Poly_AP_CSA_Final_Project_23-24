package com.poly.polyapcsafinalproject23_24;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.nio.file.Path;
import java.util.Scanner;

public class GameFlowersMaya extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;
    //private Player player; (optional)


    public void run()
    {
        //initialize number of lives
        numLives = 4;
        //create a scanner object for user input
        scan = new Scanner(System.in);

        //create a player object (optional)
        //player = new Person(...)

        //display project title and description
        Util.clearConsole();
        System.out.println("Hiking Adventure!");
        System.out.println("It’s hiking day and you are lost in the middle of the woods. What will you do?  You have 4 lives, Good Luck ");
        Util.pauseConsole();
        start();

    }

    private void start()
    {
        //start adventure here
        System.out.println("You are lost. What will you do?");
        System.out.println("1. Pull out your phone\n2. Keep adventuring hoping to find a way out\n3. Camp For The Night");
        int Choice = Util.enterInt(1,3);

        if (Choice == 1)
        {
            PullOutPhone();
        }

        if (Choice == 2)
        {
            KeepAdventuring();
        }

        if (Choice == 3)
        {
            CampForTheNight();
        }
    }

    private void PullOutPhone()
    {
        Util.clearConsole();

        System.out.println("You pulled out your phone and realize you can only");
        System.out.println("1. Call 911\n2. Play video games");
        int Choice = Util.enterInt(1, 2);

        if (Choice == 1)
        {
            Call911();
        }

        if (Choice == 2)
        {
            PlayVideoGames();
        }
    }

    private void Call911()
    {
        Util.clearConsole();

        double chance = Math.random();

        if (chance > .9)
        {
            System.out.println("They thought this call was fake and hung up on you.");
            Util.pauseConsole();
            defeat();
        }
        else
        {
            RescueMission();

        }

    }

    private void RescueMission()
    {
        Util.clearConsole();
        System.out.println("They got your call and sent out a rescue mission");

        double chance = Math.random();

        if (chance > .5)
        {
            System.out.println("They could not find you and stopped saving you. You were trapped in the woods. You Died");
            Util.pauseConsole();
            defeat();
        }
        else
        {
            Util.pauseConsole();
            FoundCivilization();
        }

    }

    private void PlayVideoGames()
    {
        Util.clearConsole();

        double chance = Math.random();

        if (chance > .9)
        {
            System.out.println("You can’t play any games, you have no cellular data on your phone. You died by natural causes.");
            Util.pauseConsole();
            defeat();
        }
        else if (chance > .7)
        {
            System.out.println("You play video games but then realize you don't know how to play any games on your phone. You died by natural causes.");
            Util.pauseConsole();
            defeat();
        }
        else if (chance > .5)
        {
            System.out.println("You stay playing games for too long and got eaten by a bear. You died");
            Util.pauseConsole();
            defeat();
        }
        else
        {
            PlayRPG();
        }

    }

    private void PlayRPG()
    {
        Util.clearConsole();
        System.out.print("You decided to play a rpg game and it taught you how to make it out of the woods. ");

        double chance = Math.random();

        if (chance > .7)
        {
            FoundCivilization();
        }
        else
        {
            System.out.println("It did not help, it made you get even more lost and you got bitten to death by wild bats. You died");
            Util.pauseConsole();
            defeat();

        }

    }

    private void KeepAdventuring()
    {
        Util.clearConsole();
        System.out.println("You kept adventuring and came across; a old house, a dark cave, and a path that leads to somewhere. What will you pick?");
        System.out.println("1. A old house\n2. A dark cave\n3. A path that leads to somewhere.");
        int Choice = Util.enterInt(1,3);

        if (Choice == 1)
        {
            AOldHouse();
        }
        if (Choice == 2)
        {
            ADarkCave();
        }
        if (Choice == 3)
        {
            APathThatLeadsToSomewhere();
        }

    }

    private void AOldHouse()
    {
        Util.clearConsole();
        System.out.println("You went inside the old house.");
        System.out.println("It was very dark inside, and you could not see anything. You deciced to take out your flash light out of your bag. You saw a huge table with a huge feast filled with chicken and ribs. You decided to...");
        System.out.println("1. Eat everything off the table\n2. Take only a bite\n3. Leave the food alone");
        int Choice = Util.enterInt(1,3);

        if (Choice == 1)
        {
            double chance = Math.random();

            if (chance > .7)
            {
                System.out.println("You ate everyting and felt really happy. You started to make the old house your home");
                Util.pauseConsole();
                YouWon();
            }

            else
            {
                System.out.println("You ate everthing and you started to have a irritating stomach ache. It hurted so much to where you passed out. You died.");
                Util.pauseConsole();
                defeat();
            }
        }
        if (Choice == 2)
        {
            double chance = Math.random();

            if (chance > .9)
            {
                defeat();
                System.out.println("You ate one bite and felt really happy. You started to make the old house your home");
                Util.pauseConsole();
                YouWon();
            }

            if (chance > .5)
            {
                System.out.println("You took one bite and felt nothing. You didnt know what else to do ever since you took that one bite. It seems nothing in your life matters anymore, you couldn't do anything else and you didnt feel happy anymore. There was nothing to entertain you... 2 months later. No one came for you and you felt really unhappy, lonely, and empty. You died unhappy.");
                Util.pauseConsole();
                defeat();
            }

            else
            {
                System.out.println("You took one bite and threw up. You died from a sickness");
                Util.pauseConsole();
                defeat();
            }
        }

        if (Choice == 3)
        {
            double chance = Math.random();

            if (chance > .5)
            {
                defeat();
                System.out.println("You ate nothing and felt really happy. You started to make the old house your home");
                Util.pauseConsole();
                YouWon();
            }

            if (chance > .7)
            {
                System.out.println("You ate nothing and felt nothing. You didnt know what else to do ever since you didnt eat anything. It seems nothing in your life matters anymore, you couldn't do anything else and you didnt feel happy anymore. There was nothing to entertain you... 2 months later, No one came for you and you felt really unhappy, lonely, and empty. You died unhappy.");
                Util.pauseConsole();
                defeat();
            }

            else
            {
                System.out.println("You ate nothing and the food started to rot leaving the house sinking. After a hour the smell was getting really toxic to where you started choking. You died from choking to death.");
                Util.pauseConsole();
                defeat();
            }
        }
    }


    private void ADarkCave()
    {
        Util.clearConsole();
        System.out.println("It was very dark inside, and you could not see anything. You deciced to take out your flash light out of your bag; you then saw two tunnels. One of tunnels lead to hungry wild animals and the other was a old mines shaft. What will you chose?");
        System.out.println("1. The tunnel with the hungry wild animals\n2. The mines shaft");
        int Choice = Util.enterInt(1,2);

        if (Choice == 1)
        {
            HungryWildAnimals();
        }
        if (Choice == 2)
        {
            Mining();
        }
    }

    private void HungryWildAnimals()
    {
        Util.clearConsole();
        System.out.println("You went inside the tunnel with the hungry wild animals");
        Util.pauseConsole();

        double chance = Math.random();

        if (chance > .9)
        {
            System.out.println("You got eaten");
            Util.pauseConsole();
            defeat();
        }
        if (chance > .7)
        {
            System.out.println("The hungry animals did not eat you. Instead they just stared at you. I mean you have been stuck in the wood for over 3 years. You havent been showering or eating healthy, you've just been waiting and waiting for someone to come look for you. The hungry animals walked away while you just stand there quietly depressed. You Died tragically");
            Util.pauseConsole();
            defeat();
        }

        if (chance > .5)
        {
            System.out.println("The Hungry animals left you alone in the empty tunnel, but you felt really hungry so you could either...");
            System.out.println("1. Kill the hungry animals\n2. Or leave the hungry animals alone.");
            int Choice = Util.enterInt(1,2);

            if (Choice == 1)
            {

                if (chance > .7)
                {
                    System.out.println("You tried to kill the animals but they attacked you. You died. ");
                    Util.pauseConsole();
                    defeat();
                }

                if (chance > .5)
                {
                    System.out.println("You attempt to you kill the animals, but you only manage to kill one which was the Hyena. The rest of the animals didnt do anything. Do you want to kill the rest of the animals?");
                    System.out.println("1. Yes\n2. No");
                    int choice = Util.enterInt(1,2);

                    if (choice == 1)
                    {

                        if (chance > .9)
                        {
                            System.out.println("The rest of the animals killed you");
                            Util.pauseConsole();
                            defeat();
                        }
                        if (chance > .5)
                        {
                            System.out.println("You manage to kill the rest of the animals. And it seem like there was a opening outside the tunnel ");
                            System.out.println("You Choose to...");
                            System.out.println("1. Stay in the cave\n2. Or walk toward the outside");
                            int option = Util.enterInt(1,2);

                            if (option == 1)
                            {
                                System.out.println("You stay inside the very dark cave. While inside two killer bats came inside the cave and started to bite you very hard. You died from killer bats");
                                Util.pauseConsole();
                                defeat();
                            }

                            if (option == 2)
                            {
                                System.out.println("You walked toward the ouside. Outside the tunnel was a small little city");
                                Util.pauseConsole();
                                FoundCivilization();
                            }
                        }
                    }
                }
            }
        }
    }

    private  void Mining()
    {
        Util.clearConsole();
        System.out.println("You went inside the mining shaft");
        System.out.println("Inside was pretty empty, there was only a few mine carts that were filled with items. You went to go see what's inside each cart.");
        System.out.println("One had stone and iron, other one had gold bricks, and the last one had copper");
        System.out.println("Which one will you choose?");
        System.out.println("1. The cart with the stone and iron\n2. The cart with the gold bricks\n3. The cart with copper");
        int choice = Util.enterInt(1,3);

        if (choice == 1)
        {
            System.out.println("You pick the cart with the stone and iron. You didn't know what to do with it. Everything else was pretty boring. You didnt die but you pretty bored and lonely. You have a choice you can exit the mines and go to the other tunnel with the hungry animals or you can stay here and rot.");
            System.out.println("1. Go to the tunnel with the hungry animals\n2. Or stay here");
            int Choice = Util.enterInt(1,2);

            if (Choice == 1)
            {
                System.out.println("You exit the mines and went into the tunnel with the hungry animals");
                Util.pauseConsole();
                HungryWildAnimals();
            }

            if (Choice == 2)
            {
                System.out.println("You choosed to stay in the mines. After a week living in the mines shaft, you got really skinny to where you could see your actual bones. You didnt have any food so you just starved. You died from stavation");
                Util.pauseConsole();
                defeat();
            }
        }

        if (choice == 2)
        {
            System.out.println("You pick the cart with the gold bricks. You felt rich but you didn't know what to do with the gold bricks. You put 4 gold bricks in your bag. Everything else was pretty boring. You didnt die but you pretty bored and lonely. You have a choice you can exit the mines and go to the other tunnel with the hungry animals or you can stay here and rot.");
            System.out.println("1. Go to the tunnel with the hungry animals\n2. Or stay here");
            int option = Util.enterInt(1,2);

            if (option == 1)
            {
                System.out.println("You exit the mines and went into the tunnel with the hungry animals");
                Util.pauseConsole();
                HungryWildAnimals();
            }
            if (option == 2)
            {
                System.out.println("You choosed to stay in the mines. After a week living in the mines shaft, you got really skinny to where you could see your actual bones. You didnt have any food so you just starved. You died from stavation");
                Util.pauseConsole();
                defeat();
            }
        }

        if (choice == 3)
        {
            System.out.println("You pick the cart with the copper. You didn't know what to do with it. Everything else was pretty boring. You didnt die but you pretty bored and lonely. You have a choice you can exit the mines and go to the other tunnel with the hungry animals or you can stay here and rot.");
            int Option = Util.enterInt(1,2);

            if (Option == 1)
            {
                System.out.println("You exit the mines and went into the tunnel with the hungry animals");
                Util.pauseConsole();
                HungryWildAnimals();
            }
            if (Option == 2)
            {
                System.out.println("You choosed to stay in the mines. After a week living in the mines shaft, you got really skinny to where you could see your actual bones. You didnt have any food so you just starved. You died from stavation");
                Util.pauseConsole();
                defeat();

            }
        }

    }

    private void APathThatLeadsToSomewhere()
    {
        Util.clearConsole();
        System.out.println("You followed the path");
        System.out.println("The path lead up to two different paths. One leading left and the one leading right");
        System.out.println("Which one will you pick");
        System.out.println("1. The left path\n2. The right path");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            System.out.println("The left path lead to a cliff. Down the cliff you saw a small little city. You decide to try and get down off the cliff.");
            double chance = Math.random();

            if (chance > .5)
            {
                Util.pauseConsole();
                System.out.println("You did not make it off the cliff sucessfully. You fell down, tripped and filped over a bunch of times. You landed on top of a pointy rock and died.");
                Util.pauseConsole();
                defeat();
            }

            if (chance > .7)
            {
                Util.pauseConsole();
                System.out.print("You sucessfully made it down the cliff and walked towards the city");
                Util.pauseConsole();
                Util.clearConsole();
                continuedWithAdventure();
            }
        }

        if (choice == 2)
        {
            System.out.println("The right path lead to a different old house");
            Util.pauseConsole();
            AOldHouse();
        }
    }


    private void CampForTheNight()
    {
        Util.clearConsole();
        System.out.println("You decided to camp for the night.");
        System.out.println("You found three places to set up camp");
        System.out.println("One place had a lot of trees and rocks. Another place was by a river. The last was a open field, barely any trees or rocks");
        System.out.println("You decided...");
        System.out.println("1. The place with a lot of trees and rocks\n2. The place by a river\n3. The open field");
        int option = Util.enterInt(1, 3);

        if (option == 1)
        {
            System.out.println("You decided to camp at the place with a lot of trees and rocks.");
            System.out.println("You couldn't find a spot to put your tent, so you just tried to make a campfire ");
            Util.pauseConsole();
            double chance = Math.random();

            if (chance > .9)
            {
                System.out.println("You wasn't able to build a campfire. Your clothes caught on fire and the fire started to spead through out the whole forest. The fire was starting to burn you and the smoke was hard to breathe in. You died from burning to death");
                Util.pauseConsole();
                defeat();
            }
            if (chance > .5)
            {
                System.out.println("You built the campfire, but you didnt know what else to do. You couldnt build a tent since there was no room and you had no tools so you couldnt chop any of the trees down. After a while the fire started to become bigger. You tried putting the fire out but you couldn't. Your clothes started to catch on fire and the fire started to spead through out the whole forest. The fire was starting to burn you and the smoke was hard to breathe in. You died from burning to death");
                Util.pauseConsole();
                defeat();
            }
        }

        if (option == 2)
        {
            System.out.println("You decided to camp the place by a river");
            System.out.println("You set up your tent, and made a campfire, and since there was a river you could fish for food. You were feeling really happy. Couple of days later you started to want to just stay here for the rest you life living in the wood. There was everything that you needed and you felt at home. Overtime you eventually started to make a wooden house for yourself to live off of. This was the best decision you ever made :).");
            Util.pauseConsole();
            YouWon();

        }

        if (option == 3)
        {
            System.out.println("You decided to set up camp in the open field.");
            System.out.println("You setted up your tent, but you really couldn't do anything else. There was no wood to make a campfire and there wasnt any food. A couple of hours had gone by you felt really hungry. You then saw a bald eagle flying around. You decided to...");
            System.out.println("1. Try to kill the bald eagle\n2. leave the eagle alone");
            int Choice = Util.enterInt(1, 2);

            if (Choice == 1)
            {
                double chance = Math.random();

                if (chance > .9)
                {
                    System.out.println("You tried to kill the bald eagle, but the eagle faught back and kept biting you really hard. You died from a bald eagle.");
                    Util.pauseConsole();
                    defeat();
                }

                if (chance > .5)
                {
                    System.out.println("You managed to kill the bald eagle and you ate it. Ten minutes later you started to feel really sick. You threw up and passed out. You then died. You died of food poisoning.");
                    Util.pauseConsole();
                    defeat();
                }

                if (chance > .7)
                {
                    System.out.println("You missed and you then collapsed on to the ground. You died from starvation.");
                    Util.pauseConsole();
                    defeat();

                }

                if (Choice == 2)
                {
                    System.out.println("You left the bald eagle alone. Ten minutes later, you then collapsed on to the ground. You died from starvation.");
                }
            }
        }
    }

    private void FoundCivilization()
    {
        Util.clearConsole();
        System.out.println("You made it out of the woods and found a city. will you continue on with your adventure?");
        System.out.println("1. Yes\n2. No");
        int Choice = Util.enterInt(1, 2);

        if (Choice == 1)
        {
            System.out.println("You continue on with your adventure");
            Util.pauseConsole();
            Util.clearConsole();
            continuedWithAdventure();
        }
        if (Choice == 2)
        {
            System.out.println("You did not want to go out to the city. You stayed in the woods but didnt know what else to do. You died of boredem");
            Util.pauseConsole();
            defeat();
        }
    }

    private void continuedWithAdventure()
    {
        System.out.println("You went inside the local city, and you manage to find a few people to talk to:");
        System.out.println("Addie, Williams, and Jay ");
        Util.pauseConsole();
        Util.clearConsole();
        System.out.println("\nAddie is a very strong person, she loves wrestling, friendly, and very weathly. You do not want to get on her bad side");
        Util.pauseConsole();
        Util.clearConsole();
        System.out.println("\nWilliams is shy person, he is a nerd, and get very envious of other people");
        Util.pauseConsole();
        Util.clearConsole();
        System.out.println("\nJay is a great person but then very mean when once you get to know him");
        Util.pauseConsole();
        Util.clearConsole();
        System.out.println("\nWho do you want to talk to");
        System.out.println("1. Addie\n2. Williams\n3. Jay");
        int choice = Util.enterInt(1, 3);

        if (choice == 1)
        {
            System.out.println("You walked towards Addie and said: hello");
            Util.pauseConsole();
            Addie();

        }

        if (choice == 2)
        {
            System.out.println("You walked towards Williams and said: hello");
            Util.pauseConsole();
            Williams();

        }

        if (choice == 3)
        {
            System.out.println("You walked toward Jay and said: hello");
            Util.pauseConsole();
            Jay();
        }
    }

    private void Addie()
    {
        Util.clearConsole();
        System.out.println("Addie: Hey, so I heard that you got stuck in the middle of the woods? ");
        System.out.println("1. Yes\n2. No");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            System.out.println("+1 Heart");
            System.out.println("Addie: You did? Wow, how was it like? Were you scared?");
            System.out.println("1. It was okay, I wasn't really scared\n2. It was really nerve-racking, I felt very alone\n3. No comment");
            int option = Util.enterInt(1, 3);

            if (option == 1)
            {
                Util.pauseConsole();
                Addie2();
            }

            if (option == 2)
            {
                Util.pauseConsole();
                Addie3();
            }

            if (option == 3)
            {
                Util.pauseConsole();
                System.out.println("...I see that you don’t want to talk. I’ll just leave you be. Bye..");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Williams and Jay now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Williams\n2. Jay");
                int Choice = Util.enterInt(1, 2);

                if (Choice == 1)
                {
                    System.out.println("You walked towards Williams and said: hello");
                    Util.pauseConsole();
                    Williams();
                }

                if (Choice == 2)
                {
                    System.out.println("You walked toward Jay and said: hello");
                    Util.pauseConsole();
                    Jay();
                }


            }


        }

        if (choice == 2)
        {
            System.out.println("Addie: No? But I thought heard someone say that- you know what nevermind if your not gonna tell that’s fine. I can talk to someone else. Bye!");
            Util.pauseConsole();
            Util.clearConsole();
            System.out.println("...You can only talk to Willams and Jay now.");
            System.out.println("Who do you want to talk to?");
            System.out.println("1. Williams\n2. Jay");
            int Choice = Util.enterInt(1, 2);

            if (Choice == 1)
            {
                System.out.println("You walked towards Williams and said: hello");
                Util.pauseConsole();
                Williams();
            }

            if (Choice == 2)
            {
                System.out.println("You walked toward Jay and said: hello");
                Util.pauseConsole();
                Jay();
            }
        }


    }

    private void Addie2()
    {
        Util.clearConsole();
        System.out.println("-1 Heart");
        System.out.println("Really? That’s it? Okay well I see that you don’t want to talk about it. How about we go grab food together?");
        System.out.println("1. Yes\n2. No");
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            System.out.println("You both went to a food stand");
            System.out.println("Addie: So how did you make it out of the woods");
            System.out.println("1. No comment\n2. I called 911\n3. I played an RPG game and it helped me\n4. I went through a cave of hungry animals and it lend me here\n5. climbed down the edge of a cliff");
            int option = Util.enterInt(1,5);

            if (option == 1)
            {
                System.out.println("Addie: Hey why aren't you talking to me? …Fine ill just go.");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Willams and Jay now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Williams\n2. Jay");
                int Choice = Util.enterInt(1, 2);

                if (Choice == 1)
                {
                    System.out.println("You walked towards Willams and said: hello");
                    Util.pauseConsole();
                    Williams();
                }

                if (Choice == 2)
                {
                    System.out.println("You walked toward Jay and said: hello");
                    Util.pauseConsole();
                    Jay();

                }
            }

            if (option == 2)
            {
                Util.clearConsole();
                System.out.println("Addie: Wow that so cool. I’m glad that you made it out.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Addie that you didn't have anywhere to stay.");
                System.out.println("Addie: I’m sorry but I really can’t do anything about that. I have a couple of people staying over and it would just cause a huge mess. I’m sorry, but I saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 3)
            {
                Util.clearConsole();
                System.out.println("Addie: Wow that so cool. I’m glad that you made it out.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Addie that you didn't have anywhere to stay.");
                System.out.println("Addie: I’m sorry but I really can’t do anything about that. I have a couple of people staying over and it would just cause a huge mess. I’m sorry, but I saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 4)
            {
                Util.clearConsole();
                System.out.println("Addie: Wow that so cool. I’m glad that you made it out.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Addie that you didn't have anywhere to stay.");
                System.out.println("Addie: I’m sorry but I really can’t do anything about that. I have a couple of people staying over and it would just cause a huge mess. I’m sorry, but I saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 5)
            {
                Util.clearConsole();
                System.out.println("Addie: Wow that so cool. I’m glad that you made it out.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Addie that you didn't have anywhere to stay.");
                System.out.println("Addie: I’m sorry but I really can’t do anything about that. I have a couple of people staying over and it would just cause a huge mess. I’m sorry, but I saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }



        }

        if (choice == 2)
        {
            System.out.println("Addie: No? Oh okay i'll just go somewhere else.");
            Util.pauseConsole();
            Util.clearConsole();
            System.out.println("...You can only talk to Willams and Jay now.");
            System.out.println("Who do you want to talk to?");
            System.out.println("1. Williams\n2. Jay");
            int Choice = Util.enterInt(1, 2);

            if (Choice == 1)
            {
                System.out.println("You walked towards Williams and said: hello");
                Util.pauseConsole();
                Williams();
            }

            if (Choice == 2)
            {
                System.out.println("You walked toward Jay and said: hello");
                Util.pauseConsole();
                Jay();

            }
        }
    }

    private void Addie3()
    {
        Util.clearConsole();
        System.out.println("+1 Heart");
        System.out.println("Addie:It was? Oh I’m sorry. If I was there I would've try and rescue you… So you want to go grab food together?");
        System.out.println("1. Yes\n2. No");
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            System.out.println("You both went to a cafe");
            System.out.println("So how did you make it out of the woods");
            System.out.println("1. No comment\n2. I called 911\n3. I played an RPG game and it helped me\n4. I went through a cave of hungry animals and it lend me here\n5. climbed down the edge of a cliff");
            int option = Util.enterInt(1,5);

            if (option == 1)
            {
                System.out.println("Addie: Hey why aren't you talking to me? …Fine ill just go.");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Willams and Jay now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Williams\n2. Jay");
                int Choice = Util.enterInt(1, 2);

                if (Choice == 1)
                {
                    System.out.println("You walked towards Willams and said: hello");
                    Util.pauseConsole();
                    Williams();
                }

                if (Choice == 2)
                {
                    System.out.println("You walked toward Jay and said: hello");
                    Util.pauseConsole();
                    Jay();

                }
            }

            if (option == 2)
            {
                Util.clearConsole();
                System.out.println("Addie: Wow that so cool. I’m glad that you made it out so we could hang.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Addie that you didn't have anywhere to stay.");
                System.out.println("Addie Addie offers to let you stay the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 3)
            {
                Util.clearConsole();
                System.out.println("Addie: Wow that so cool. I’m glad that you made it out so we could hang.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Addie that you didn't have anywhere to stay.");
                System.out.println("Addie Addie offers to let you stay the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 4)
            {
                Util.clearConsole();
                System.out.println("Addie: Wow that so cool. I’m glad that you made it out so we could hang.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Addie that you didn't have anywhere to stay.");
                System.out.println("Addie Addie offers to let you stay the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 5)
            {
                Util.clearConsole();
                System.out.println("Addie: Wow that so cool. I’m glad that you made it out so we could hang.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Addie that you didn't have anywhere to stay.");
                System.out.println("Addie Addie offers to let you stay the night.");
                Util.pauseConsole();
                YouMadeIt();
            }
        }
        if (choice == 2)
        {
            System.out.println("-1 Heart");
            System.out.println("Oh well then do you want to go to a park?");
            System.out.println("1. No\n2. Yes");
            int Choice = Util.enterInt(1, 2);

            if (Choice == 1)
            {
                Util.clearConsole();
                System.out.println("Addie: So how did you make it out of the woods");
                System.out.println("1. No comment\n2. I called 911\n3. I played an RPG game and it helped me\n4. I went through a cave of hungry animals and it lend me here\n5. climbed down the edge of a cliff");
                int option = Util.enterInt(1,5);

                if (option == 2)
                {
                    Util.clearConsole();
                    System.out.println("Addie: Wow that so cool. I’m glad that you made it out.");
                    System.out.println("You told Addie that you didn't have anywhere to stay.");
                    System.out.println("Addie: I’m sorry but I really can’t do anything about that. I have a couple of people staying over and it would just cause a huge mess. I’m sorry, but I saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

                if (option == 3)
                {
                    Util.clearConsole();
                    System.out.println("Addie: Wow that so cool. I’m glad that you made it out.");
                    System.out.println("You told Addie that you didn't have anywhere to stay.");
                    System.out.println("Addie: I’m sorry but I really can’t do anything about that. I have a couple of people staying over and it would just cause a huge mess. I’m sorry, but I saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

                if (option == 4)
                {
                    Util.clearConsole();
                    System.out.println("Addie: Wow that so cool. I’m glad that you made it out.");
                    System.out.println("You told Addie that you didn't have anywhere to stay.");
                    System.out.println("Addie: I’m sorry but I really can’t do anything about that. I have a couple of people staying over and it would just cause a huge mess. I’m sorry, but I saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

                if (option == 5)
                {
                    Util.clearConsole();
                    System.out.println("Addie: Wow that so cool. I’m glad that you made it out.");
                    System.out.println("You told Addie that you didn't have anywhere to stay.");
                    System.out.println("Addie: I’m sorry but I really can’t do anything about that. I have a couple of people staying over and it would just cause a huge mess. I’m sorry, but I saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

            }

            if (Choice == 2)
            {
                System.out.println("Oh…fine whatever ill just go.");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Williams and Jay now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Williams\n2. Jay");
                int Choose = Util.enterInt(1, 2);

                if (Choose == 1)
                {
                    System.out.println("You walked towards Williams and said: hello");
                    Util.pauseConsole();
                    Williams();
                }

                if (Choose == 2)
                {
                    System.out.println("You walked toward Jay and said: hello");
                    Util.pauseConsole();
                    Jay();

                }

            }
        }
    }

    private void Williams()
    {
        Util.clearConsole();
        Util.clearConsole();
        System.out.println("Williams: Hi, so um I got told that you got stuck in the middle of the woods");
        System.out.println("1. Yes\n2. No");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            System.out.println("+1 Heart");
            System.out.println("William: Interesting.. so how was it? Did you get scared?");
            System.out.println("1. It was okay, I wasn't really scared\n2. It was really nerve-racking, I felt very alone\n3. No comment");
            int option = Util.enterInt(1, 3);

            if (option == 1)
            {
                Util.pauseConsole();
                Williams2();
            }

            if (option == 2)
            {
                Util.pauseConsole();
                Williams3();
            }

            if (option == 3)
            {
                Util.pauseConsole();
                System.out.println("...You dont walk to talk? Oh okay I can just go this way..");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Addie and Jay now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Addie\n2. Jay");
                int Choice = Util.enterInt(1, 2);

                if (Choice == 1)
                {
                    System.out.println("You walked towards Addie and said: hello");
                    Util.pauseConsole();
                    Addie();
                }

                if (Choice == 2)
                {
                    System.out.println("You walked toward Jay and said: hello");
                    Util.pauseConsole();
                    Jay();
                }


            }


        }

        if (choice == 2)
        {
            System.out.println("Williams: Oh... I'm sorry, I'll just leave you be");
            Util.pauseConsole();
            Util.clearConsole();
            System.out.println("...You can only talk to Addie and Jay now.");
            System.out.println("Who do you want to talk to?");
            System.out.println("1. Addie\n2. Jay");
            int Choice = Util.enterInt(1, 2);

            if (Choice == 1)
            {
                System.out.println("You walked towards Addie and said: hello");
                Util.pauseConsole();
                Addie();
            }

            if (Choice == 2)
            {
                System.out.println("You walked toward Jay and said: hello");
                Util.pauseConsole();
                Jay();
            }
        }


    }

    private void Williams2()
    {
        Util.clearConsole();
        System.out.println("-1 Heart");
        System.out.println("Williams: Oh That was it? Okay um... Hey how about we go grab food together?");
        System.out.println("1. Yes\n2. No");
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            System.out.println("You both went to a food stand");
            System.out.println("Williams: So how did you make it out of the woods");
            System.out.println("1. No comment\n2. I called 911\n3. I played an RPG game and it helped me\n4. I went through a cave of hungry animals and it lend me here\n5. climbed down the edge of a cliff");
            int option = Util.enterInt(1,5);

            if (option == 1)
            {
                System.out.println("Williams: ...I guess I understand why you're not talking. Maybe I should go.");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Addie and Jay now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Addie\n2. Jay");
                int Choice = Util.enterInt(1, 2);

                if (Choice == 1)
                {
                    System.out.println("You walked towards Addie and said: hello");
                    Util.pauseConsole();
                    Addie();
                }

                if (Choice == 2)
                {
                    System.out.println("You walked toward Jay and said: hello");
                    Util.pauseConsole();
                    Jay();

                }
            }

            if (option == 2)
            {
                Util.clearConsole();
                System.out.println("Williams: Nice! That really cool.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Williams: I’m sorry but I really can’t do anything about that. I can't have people staying over right now, but I did saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 3)
            {
                Util.clearConsole();
                System.out.println("Williams: Nice! That really cool.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Addie that you didn't have anywhere to stay.");
                System.out.println("Williams: I’m sorry but I really can’t do anything about that. I can't have people staying over right now, but I did saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 4)
            {
                Util.clearConsole();
                System.out.println("Williams: Nice! That really cool.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Williams: I’m sorry but I really can’t do anything about that. I can't have people staying over right now, but I did saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 5)
            {
                Util.clearConsole();
                System.out.println("Williams: Nice! That really cool.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Williams: I’m sorry but I really can’t do anything about that. I can't have people staying over right now, but I did saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }



        }

        if (choice == 2)
        {
            System.out.println("Oh okay I should just leave you be. I'll just go somewhere else.");
            Util.pauseConsole();
            Util.clearConsole();
            System.out.println("...You can only talk to Addie and Jay now.");
            System.out.println("Who do you want to talk to?");
            System.out.println("1. Addie\n2. Jay");
            int Choice = Util.enterInt(1, 2);

            if (Choice == 1)
            {
                System.out.println("You walked towards Addie and said: hello");
                Util.pauseConsole();
                Addie();
            }

            if (Choice == 2)
            {
                System.out.println("You walked toward Jay and said: hello");
                Util.pauseConsole();
                Jay();

            }
        }
    }

    private void Williams3()
    {
        Util.clearConsole();
        System.out.println("+1 Heart");
        System.out.println("It was? Oh I’m sorry that you got stuck. If I was there I would've helped you... Hey do you want to go grab something to eat?");
        System.out.println("1. Yes\n2. No");
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            System.out.println("You both went to a cafe");
            System.out.println("Williams: So how did you make it out of the woods");
            System.out.println("1. No comment\n2. I called 911\n3. I played an RPG game and it helped me\n4. I went through a cave of hungry animals and it lend me here\n5. climbed down the edge of a cliff");
            int option = Util.enterInt(1,5);

            if (option == 1)
            {
                System.out.println("Williams: ...I guess I understand why you're not talking. Maybe I should go.");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Addie and Jay now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Addie\n2. Jay");
                int Choice = Util.enterInt(1, 2);

                if (Choice == 1)
                {
                    System.out.println("You walked towards Addie and said: hello");
                    Util.pauseConsole();
                    Addie();
                }

                if (Choice == 2)
                {
                    System.out.println("You walked toward Jay and said: hello");
                    Util.pauseConsole();
                    Jay();

                }
            }

            if (option == 2)
            {
                Util.clearConsole();
                System.out.println("Williams: Nice...Hey I’m glad that you made it out so we could hang.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Williams offers to let you stay the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 3)
            {
                Util.clearConsole();
                System.out.println("Willams: Nice...Hey I’m glad that you made it out so we could hang.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Willams offers to let you stay the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 4)
            {
                Util.clearConsole();
                System.out.println("Williams: Nice...Hey I’m glad that you made it out so we could hang.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Williams offers to let you stay the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 5)
            {
                Util.clearConsole();
                System.out.println("Williams: Nice...Hey I’m glad that you made it out so we could hang.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Williams offers to let you stay the night.");
                Util.pauseConsole();
                YouMadeIt();
            }
        }
        if (choice == 2)
        {
            System.out.println("-1 Heart");
            System.out.println("Williams: Oh well then do you want to go to a park?");
            System.out.println("1. No\n2. Yes");
            int Choice = Util.enterInt(1, 2);

            if (Choice == 1)
            {
                Util.clearConsole();
                System.out.println("Williams: So how did you make it out of the woods");
                System.out.println("1. No comment\n2. I called 911\n3. I played an RPG game and it helped me\n4. I went through a cave of hungry animals and it lend me here\n5. climbed down the edge of a cliff");
                int option = Util.enterInt(1,5);

                if (option == 2)
                {
                    Util.clearConsole();
                    System.out.println("Williams: Nice! That really cool.");
                    System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                    System.out.println("Williams: I’m sorry but I really can’t do anything about that. I can't have people staying over right now, but I did saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

                if (option == 3)
                {
                    Util.clearConsole();
                    System.out.println("Williams: Nice! That really cool.");
                    System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                    System.out.println("Williams: I’m sorry but I really can’t do anything about that. I can't have people staying over right now, but I did saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

                if (option == 4)
                {
                    Util.clearConsole();
                    System.out.println("Williams: Nice! That really cool.");
                    System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                    System.out.println("Williams: I’m sorry but I really can’t do anything about that. I can't have people staying over right now, but I did saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

                if (option == 5)
                {
                    Util.clearConsole();
                    System.out.println("Williams: Nice! That really cool.");
                    System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                    System.out.println("Williams: I’m sorry but I really can’t do anything about that. I can't have people staying over right now, but I did saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

            }

            if (Choice == 2)
            {
                System.out.println("Williams: Oh okay I should just leave you be. I'll just go somewhere else.");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Addie and Jay now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Addie\n2. Jay");
                int choose = Util.enterInt(1, 2);

                if (choose == 1)
                {
                    System.out.println("You walked towards Addie and said: hello");
                    Util.pauseConsole();
                    Addie();
                }

                if (choose == 2)
                {
                    System.out.println("You walked toward Jay and said: hello");
                    Util.pauseConsole();
                    Jay();

                }

            }
        }
    }



    private void Jay()
    {
        Util.clearConsole();Util.clearConsole();
        Util.clearConsole();
        System.out.println("Jay: So I over heard that told that you got stuck in the middle of the woods");
        System.out.println("1. Yes\n2. No");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            System.out.println("+1 Heart");
            System.out.println("Jay: Cool.. so how was it? Did someone get scared?");
            System.out.println("1. It was okay, I wasn't really scared\n2. It was really nerve-racking, I felt very alone\n3. No comment");
            int option = Util.enterInt(1, 3);

            if (option == 1)
            {
                Util.pauseConsole();
                Jay2();
            }

            if (option == 2)
            {
                Util.pauseConsole();
                Jay3();
            }

            if (option == 3)
            {
                Util.pauseConsole();
                System.out.println("Jay: ...What you do want to talk? Alright if you wont talk then I wont talk..");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Addie and Williams now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Addie\n2. Williams");
                int Choice = Util.enterInt(1, 2);

                if (Choice == 1)
                {
                    System.out.println("You walked towards Addie and said: hello");
                    Util.pauseConsole();
                    Addie();
                }

                if (Choice == 2)
                {
                    System.out.println("You walked toward Williams and said: hello");
                    Util.pauseConsole();
                    Williams();
                }


            }


        }

        if (choice == 2)
        {
            System.out.println("Jay: You sure? Cause then I'll just go. Bye dude!");
            Util.pauseConsole();
            Util.clearConsole();
            System.out.println("...You can only talk to Addie and Williams now.");
            System.out.println("Who do you want to talk to?");
            System.out.println("1. Addie\n2. Williams");
            int Choice = Util.enterInt(1, 2);

            if (Choice == 1)
            {
                System.out.println("You walked towards Addie and said: hello");
                Util.pauseConsole();
                Addie();
            }

            if (Choice == 2)
            {
                System.out.println("You walked toward Williams and said: hello");
                Util.pauseConsole();
                Williams();
            }
        }


    }

    private void Jay2()
    {
        Util.clearConsole();
        System.out.println("-1 Heart");
        System.out.println("Jay: Wow That's it? Okay... Hey why dont we how go grab food together?");
        System.out.println("1. Yes\n2. No");
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            System.out.println("You both went to a food stand");
            System.out.println("Jay: So how did you make it out of the woods");
            System.out.println("1. No comment\n2. I called 911\n3. I played an RPG game and it helped me\n4. I went through a cave of hungry animals and it lend me here\n5. climbed down the edge of a cliff");
            int option = Util.enterInt(1,5);

            if (option == 1)
            {
                System.out.println("Jay: Hey you can't just stop talking. I mean fine I'll just go.");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Addie and Williams now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Addie\n2. Williams");
                int Choice = Util.enterInt(1, 2);

                if (Choice == 1)
                {
                    System.out.println("You walked towards Addie and said: hello");
                    Util.pauseConsole();
                    Addie();
                }

                if (Choice == 2)
                {
                    System.out.println("You walked toward Williams and said: hello");
                    Util.pauseConsole();
                    Williams();

                }
            }

            if (option == 2)
            {
                Util.clearConsole();
                System.out.println("Jay: That sick, I mean I would probably do something more cool.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Jay: Sorry but I really can’t do anything about that. You see I don't like when people stay over, but I think saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 3)
            {
                Util.clearConsole();
                System.out.println("Jay: That sick, I mean I would probably do something more cool.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Jay: Sorry but I really can’t do anything about that. You see I don't like when people stay over, but I think saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 4)
            {
                Util.clearConsole();
                System.out.println("Jay: That sick, I mean I would probably do something more cool.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Jay: Sorry but I really can’t do anything about that. You see I don't like when people stay over, but I think saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 5)
            {
                Util.clearConsole();
                System.out.println("Jay: That sick, I mean I would probably do something more cool.");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                System.out.println("Jay: Sorry but I really can’t do anything about that. You see I don't like when people stay over, but I think saw a hotel nearby maybe you can stay there. Bye..");
                System.out.println("You went to the hotel and stayed the night.");
                Util.pauseConsole();
                YouMadeIt();
            }



        }

        if (choice == 2)
        {
            System.out.println("Nothing? Alright bye.");
            Util.pauseConsole();
            Util.clearConsole();
            System.out.println("...You can only talk to Addie and Williams now.");
            System.out.println("Who do you want to talk to?");
            System.out.println("1. Addie\n2. Williams");
            int Choice = Util.enterInt(1, 2);

            if (Choice == 1)
            {
                System.out.println("You walked towards Addie and said: hello");
                Util.pauseConsole();
                Addie();
            }

            if (Choice == 2)
            {
                System.out.println("You walked toward Jay and said: hello");
                Util.pauseConsole();
                Williams();

            }
        }
    }

    private void Jay3()
    {
        Util.clearConsole();
        System.out.println("+1 Heart");
        System.out.println("Wasn't it now? Well I guess sorry if you were feeling that way... Hey do you want to go grab something to eat?");
        System.out.println("1. Yes\n2. No");
        int choice = Util.enterInt(1, 2);

        if (choice == 1)
        {
            System.out.println("You both went to a cafe");
            System.out.println("Jay: So how did you make it out of the woods");
            System.out.println("1. No comment\n2. I called 911\n3. I played an RPG game and it helped me\n4. I went through a cave of hungry animals and it lend me here\n5. climbed down the edge of a cliff");
            int option = Util.enterInt(1,5);

            if (option == 1)
            {
                System.out.println("Nothing? Alright bye.");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Addie and Williams now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Addie\n2. Williams");
                int Choice = Util.enterInt(1, 2);

                if (Choice == 1)
                {
                    System.out.println("You walked towards Addie and said: hello");
                    Util.pauseConsole();
                    Addie();
                }

                if (Choice == 2)
                {
                    System.out.println("You walked toward Jay and said: hello");
                    Util.pauseConsole();
                    Williams();

                }
            }

            if (option == 2)
            {
                Util.clearConsole();
                System.out.println("Jay: That sick, I mean I would probably do something more cool. It feels nice to hang out with you tho");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Jay that you didn't have anywhere to stay.");
                System.out.println("Jay offers you to stay over.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 3)
            {
                Util.clearConsole();
                System.out.println("Jay: That sick, I mean I would probably do something more cool. It feels nice to hang out with you tho");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Jay that you didn't have anywhere to stay.");
                System.out.println("Jay offers you to stay over.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 4)
            {
                Util.clearConsole();
                System.out.println("Jay: That sick, I mean I would probably do something more cool. It feels nice to hang out with you tho");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Jay that you didn't have anywhere to stay.");
                System.out.println("Jay offers you to stay over.");
                Util.pauseConsole();
                YouMadeIt();
            }

            if (option == 5)
            {
                Util.clearConsole();
                System.out.println("Jay: That sick, I mean I would probably do something more cool. It feels nice to hang out with you tho");
                System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Jay that you didn't have anywhere to stay.");
                System.out.println("Jay offers you to stay over.");
                Util.pauseConsole();
                YouMadeIt();
            }
        }
        if (choice == 2)
        {
            System.out.println("-1 Heart");
            System.out.println("Jay: Then do you want to go to a park?");
            System.out.println("1. No\n2. Yes");
            int Choice = Util.enterInt(1, 2);

            if (Choice == 1)
            {
                Util.clearConsole();
                System.out.println("Jay: So how did you make it out of the woods");
                System.out.println("1. No comment\n2. I called 911\n3. I played an RPG game and it helped me\n4. I went through a cave of hungry animals and it lend me here\n5. climbed down the edge of a cliff");
                int option = Util.enterInt(1,5);

                if (option == 2)
                {
                    Util.clearConsole();
                    System.out.println("Jay: That sick, I mean I would probably do something more cool.");
                    System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                    System.out.println("Jay: Sorry but I really can’t do anything about that. You see I don't like when people stay over, but I think saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

                if (option == 3)
                {
                    Util.clearConsole();
                    System.out.println("Jay: That sick, I mean I would probably do something more cool.");
                    System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                    System.out.println("Jay: Sorry but I really can’t do anything about that. You see I don't like when people stay over, but I think saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

                if (option == 4)
                {
                    Util.clearConsole();
                    System.out.println("Jay: That sick, I mean I would probably do something more cool.");
                    System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                    System.out.println("Jay: Sorry but I really can’t do anything about that. You see I don't like when people stay over, but I think saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

                if (option == 5)
                {
                    Util.clearConsole();
                    System.out.println("Jay: That sick, I mean I would probably do something more cool.");
                    System.out.println("You both ordered food and drinks and kept talking. Afterwards, You told Williams that you didn't have anywhere to stay.");
                    System.out.println("Jay: Sorry but I really can’t do anything about that. You see I don't like when people stay over, but I think saw a hotel nearby maybe you can stay there. Bye..");
                    System.out.println("You went to the hotel and stayed the night.");
                    Util.pauseConsole();
                    YouMadeIt();
                }

            }

            if (Choice == 2)
            {
                System.out.println("Jay: Wow so you really dont wanna hang? I'll just go then.");
                Util.pauseConsole();
                Util.clearConsole();
                System.out.println("...You can only talk to Addie and Williams now.");
                System.out.println("Who do you want to talk to?");
                System.out.println("1. Addie\n2. Williams");
                int choose = Util.enterInt(1, 2);

                if (choose == 1)
                {
                    System.out.println("You walked towards Addie and said: hello");
                    Util.pauseConsole();
                    Addie();
                }

                if (choose == 2)
                {
                    System.out.println("You walked toward Williams and said: hello");
                    Util.pauseConsole();
                    Williams();
                }
            }

        }

    }

    private void YouWon()
    {

        numLives++;

        System.out.println("You won the game or did you really?");
        System.out.println("+1 Life");

        if (numLives > 0)
        {
            Util.pauseConsole();
            Util.clearConsole();
            start();
        }
    }

    private void YouMadeIt()
    {
        Util.clearConsole();
        System.out.println("You made it out of the woods. You finished the game.");
        Util.pauseConsole();
        Util.clearConsole();
        run();

    }

    private void defeat()
    {

        numLives--;

        System.out.println(" ");

        if (numLives > 0)
        {
            start();
        }
        else
        {
            System.out.println("You lost all your lives and did not make it out of out the wood. \nGAME OVER");
            Util.pauseConsole();
            Util.clearConsole();
            run();
        }

    }
}