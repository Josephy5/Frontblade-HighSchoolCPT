/*
Frontblade.java
Description: A text-based adventure, RPG, dungeon crawler game
Author's Name: Joseph Yong
Date created: 17, May, 2019
Last modified: 6, June, 2019
Version 1.1

Update log: 
1.1
Bug fixes
minor adjustments to the texts
added some thread.sleep to slow the pace down
adjusted the some threadsleeps timing
added else statement to combat (when prompt to attck or run and choose something else, it will
now syas that nothing happhens).
1.0
Base game
 */
package cpt;

import java.util.Random;
import java.util.Scanner;

public class CPT {

    public static String name = "";
    public static String input = "";
    public static int playerHp = 10;
    public static int playerHpCap = 15;
    public static int playerAtk = 3;

    //Display player's stats
    public static String stats() {
        String output = "";
        output += "Hp: " + playerHp + " ";
        output += "Hp Cap: " + playerHpCap + " ";
        output += "Atk: " + playerAtk + " ";
        return output;
    }

    //introduction
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        String user = "";
        //text art
        System.out.println(
                "                          ,                                                              \n"
                + "                          ,.                                                                 \n"
                + "                          ,,.                                                         \n"
                + "                          .,...                                                               \n"
                + "                          .,.,,                                                             \n"
                + "                          .*,/*                                                        \n"
                + "     .*****               .*,/*,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,...                                                      \n"
                + "    ,,,,****##############/*//*////////////////////////////////////////////////////////////////,....                                                   \n"
                + "    , ..,***##############/*//*&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,,..                                                   \n"
                + "     ,,..**............... ///*,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,...                                                     \n"
                + "                          *,/*...............................................................                                                         \n"
                + "                          *,/* @@@@*                          @@@@   @@            @@                                                                 \n"
                + "                          *,,. @@                         @   @  @@  @@            @@                                                                 \n"
                + "                          *,.  @@    ,, @   @#   ,, @,   @@,  @  %@  @@   &&     &%@@   %&                                                            \n"
                + "                          /.   @@@@  @@%  @@ .@  @@  @&  @@   @@@@   @@  .  @.  @, @@  @  @                                                           \n"
                + "                          *    @@    @@   @(  @% @@  @&  @@   @  .@, @@    @@. @@  @@ ,@@@@%                                                          \n"
                + "                               @@    @@   @&  @* @@  @&  @@   @   @( @@  @  @. @@  @@  @                                                              \n"
                + "                               @@    @@   .@@@@  @@  @&  @@@  @@@@#  @@ ,@@@@@  @@@@@  @@@@                                                           \n");
        System.out.println("Hello, Welcome to FrontBlade");
        Thread.sleep(1500);
        //prompts user if he or she wants to quit or start
        System.out.println("Do you want to start?");
        System.out.println("\nYes - start"
                + "\nNo - quit");
        System.out.print("\nEnter: ");
        user = s.next();
        String check = user.toLowerCase();
        //if logics
        if ("yes".equals(check)) {
            System.out.println("\n\tLet us begin\n\n");
            Thread.sleep(2000);
            game();
        } else if ("no".equals(check)) {
            System.out.println("\nHave a great day!");
            //if input wrong word
        } else {
            do {
                System.out.println("\nError, please say yes or no");
                check = s.next();
            } while (!check.equals("no") && !check.equals("yes"));
            if ("yes".equals(check)) {
                System.out.println("\n\tLet us begin");
                Thread.sleep(2000);
                game();
            } else if ("no".equals(check)) {
                System.out.println("\nHave a great day!");
            }
        }
    }

    public static void game() throws InterruptedException {
        //The actual game method
        Scanner s = new Scanner(System.in);
        String user = "";
        int num = 0, end = 0, retry = 0, begin = 0, count = 1;
        //character naming
        System.out.println("\nYou waken up in some kind of a dungeon");
        Thread.sleep(2000);
        System.out.println("\nYou look around your surroundings...");
        Thread.sleep(2000);
        System.out.println("\nYou are in some kind of a cell");
        Thread.sleep(2000);
        System.out.println("\nYou manage to break free of your chains");
        Thread.sleep(2000);
        System.out.println("\nYou try to recollect yourself");
        Thread.sleep(2000);
        System.out.println("\nYou are... (Enter Name)");
        name = s.nextLine();
        System.out.println("\nYou are..." + name);
        Thread.sleep(2000);
        System.out.println("\nYou stand up, and walked out of your cell\n");
        do {
            //heritage system
            if (count != 1) {
                if (count == 2) {
                    System.out.println("\nYou waken up in some kind of a dungeon");
                    Thread.sleep(2000);
                    System.out.println("\nYou look around your surroundings...");
                    Thread.sleep(2000);
                    System.out.println("\nYou are in some kind of a cell");
                    Thread.sleep(2000);
                    System.out.println("\nYou manage to break free of your chains");
                    Thread.sleep(2000);
                    System.out.println("\nYou try to recollect yourself");
                    Thread.sleep(2000);
                    System.out.println("\nYou are..." + name + " the " + count + "nd");
                    playerHpCap = 15;
                    playerAtk = 3;
                } else if (count == 3) {
                    System.out.println("\nYou waken up in some kind of a dungeon");
                    Thread.sleep(2000);
                    System.out.println("\nYou look around your surroundings...");
                    Thread.sleep(2000);
                    System.out.println("\nYou are in some kind of a cell");
                    Thread.sleep(2000);
                    System.out.println("\nYou manage to break free of your chains");
                    Thread.sleep(2000);
                    System.out.println("\nYou try to recollect yourself");
                    Thread.sleep(2000);
                    System.out.println("\nYou are..." + name + " the " + count + "rd");
                    playerHpCap = 15;
                    playerAtk = 3;
                } else {
                    System.out.println("\nYou waken up in some kind of a dungeon");
                    Thread.sleep(2000);
                    System.out.println("\nYou look around your surroundings...");
                    Thread.sleep(2000);
                    System.out.println("\nYou are in some kind of a cell");
                    Thread.sleep(2000);
                    System.out.println("\nYou manage to break free of your chains");
                    Thread.sleep(2000);
                    System.out.println("\nYou try to recollect yourself");
                    Thread.sleep(2000);
                    System.out.println("\nYou are..." + name + " the " + count + "th");
                    playerHpCap = 15;
                    playerAtk = 3;
                }
                Thread.sleep(2000);
                System.out.println("\n\nYou stood up, and walk out of your cell\n");
            }
            end = 0;
            num = rng();
            //Game logics
            do {
                Thread.sleep(2000);
                //if player dies
                if (playerHp <= 0) {
                    Thread.sleep(1500);
                    System.out.println("\nYou died");
                    break;
                }
                //if hp is over the cap
                if (playerHp > playerHpCap) {
                    playerHp = playerHpCap;
                }

                if (num < 15) {
                    num = hallway(num);
                } else if (num < 30) {
                    num = hallway2(num);
                } else if (num < 45) {
                    num = treasure(num);
                } else if (num < 75) {
                    num = combat(num);
                } else if (num < 90) {
                    num = deadend(num);
                } else if (num < 98) {
                    num = boss(num);
                } else if (begin == 1 || num < 100) {
                    end = end(num);
                    if (end == 0) {
                        num = rng();
                    }
                }
                //to prevent form having the ending at the start
                if (begin == 0) {
                    begin = 1;
                }
            } while (end != 1);
            //quit or retry
            if (end == 1 || playerHp <= 0) {
                System.out.println("\nDo you want to quit or retry?");
                user = s.next();
                String check = user.toLowerCase();
                if ("retry".equals(check)) {
                    System.out.println("\n\tLet us begin\n\n");
                    count++;
                    playerHp = 10;
                    Thread.sleep(2000);
                } else if ("quit".equals(check)) {
                    System.out.println("\nHave a great day!");
                    retry = 1;
                    break;
                    //if input wrong word
                } else {
                    do {
                        System.out.println("\nError, please say quit or retry");
                        check = s.next();
                    } while (!check.equals("quit") && !check.equals("retry"));
                    if ("retry".equals(check)) {
                        System.out.println("\n\tLet us begin");
                        count++;
                        playerHp = 10;
                        Thread.sleep(2000);
                    } else if ("quit".equals(check)) {
                        System.out.println("\nHave a great day!");
                        retry = 1;
                        break;
                    }
                }
            }
        } while (retry != 1);
    }

    public static int hallway(int x) {
        Scanner s = new Scanner(System.in);
        System.out.println("You see a dark hallway\nWhat will you do?"
                + "\nWalk | Back | Stats");
        do {
            input = s.next();
            String result = input.toLowerCase();
            //if player wants to walk forwards or backwards
            if ("walk".equals(result)) {
                System.out.println("You moved forward\n");
                x = rng();
                break;
            } else if ("back".equals(result)) {
                System.out.println("You moved backwards\n");
                x = rng();
                break;
            } else if ("stats".equals(result) || "stat".equals(result)) {
                System.out.println(stats());
                //if input didn't sastify any ifs above
            } else {
                System.out.println("Nothing Happened");
            }
        } while (true);
        return x;
    }

    public static int hallway2(int x) {
        Scanner s = new Scanner(System.in);
        System.out.println("You see a dark corridor, you see doors to your left and right\nWhat will you do?"
                + "\nWalk | Left | Right | Back | Stats");
        do {
            input = s.next();
            String result = input.toLowerCase();
            //if the players want to go forward, backwards, left or right
            if ("walk".equals(result)) {
                System.out.println("You moved forward\n");
                x = rng();
                break;
            } else if ("back".equals(result)) {
                System.out.println("You moved backwards\n");
                x = rng();
                break;
            } else if ("left".equals(result)) {
                System.out.println("You opened the left door\n");
                x = rng();
                break;
            } else if ("right".equals(result)) {
                System.out.println("You opened the right door\n");
                x = rng();
                break;
                //if player asks for his stats
            } else if ("stats".equals(result)) {
                System.out.println(stats());
                //if input didn't sastify any ifs above
            } else {
                System.out.println("Nothing Happened");
            }
        } while (true);
        return x;
    }

    public static int treasure(int x) throws InterruptedException {
        int open = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("You see a room with a treasure chest in it,  What will you do?"
                + "\nOpen | Back | Stats");
        do {
            input = s.next();
            String result = input.toLowerCase();
            //if player wants to exit room
            if ("back".equals(result)) {
                System.out.println("You exited the room\n");
                x = rng();
                break;
                //LOOT RNG
            } else if ("open".equals(result)) {
                if (open == 1) {
                    System.out.println("You already opened the chest");
                } else if (open == 0) {
                    System.out.println("You opened the chest");
                    x = rng();
                    Thread.sleep(2000);
                    System.out.println("Da da da da!!");
                    Thread.sleep(1500);
                    if (x < 25) {
                        System.out.println("You found a HP potion. +5 HP");
                        playerHp += 5;
                    } else if (x < 40) {
                        System.out.println("You found a better Sword. +1 ATK");
                        playerAtk += 1;
                    } else if (x < 55) {
                        System.out.println("The chest was trapped, You were hurted, -2HP");
                        playerHp -= 2;
                    } else if (x < 90) {
                        System.out.println("You found nothing");
                    } else {
                        System.out.println("You found a HP orb, You feel like your HP cap has increased, +1 more HP");
                        playerHpCap += 1;
                    }
                    open = 1;
                }
            } else if ("stats".equals(result) || "stat".equals(result)) {
                System.out.println(stats());
                //if input didn't sastify any ifs above
            } else {
                System.out.println("Nothing Happened");
            }
        } while (true);
        return x;
    }

    //Random number generator method
    public static int rng() {
        return (int) (Math.random() * (100 - 1)) + 1;
    }
// Combat for normal enemies

    public static int combat(int x) throws InterruptedException {
        int turn = 0, rng = 0;
        String user = "", user1 = "";
        Scanner s = new Scanner(System.in);
        System.out.println("You encountered a monster, will you attack it or run?"
                + "\nAttack | Run");
        user = s.next();
        //if players chooses to run
        if ("run".equals(user)) {
            int check = rng();
            //if you managed to run away
            if (check < 40) {
                System.out.println("You managed to run away");
                x = rng();
                return x;
                //if you didn't managed to run away
            } else if (check < 100) {
                System.out.println("You failed to run away");
                Thread.sleep(2000);
                System.out.println("The monster notices you");
                rng = rng();
                //turn system by RNG
                if (rng < 60) {
                    turn = 1;
                } else if (rng < 100) {
                    turn = 2;
                }
                enemy a;
                a = new enemy();
                Thread.sleep(1000);
                System.out.println("\nA " + a.FirstTrait + " " + a.SecondTrait + " " + a.name + " has appeared");
                do {

                    //if enemy dies
                    if (a.hp <= 0) {
                        Thread.sleep(1500);
                        System.out.println("\nThe"+a.FirstTrait + " " + a.SecondTrait + " " + a.name + " has been defeated\n");
                        //if enemy dropped something
                        if (rng < 20) {
                            System.out.println("Hm...You found something");
                            Thread.sleep(2000);
                            rng = rng();
                            //loot drop rng
                            if (x < 25) {
                                System.out.println("You found a HP potion. +5 HP");
                                playerHp += 5;
                            } else if (x < 40) {
                                System.out.println("You found a better Sword. +1 ATK");
                                playerAtk += 1;
                            } else if (x < 55) {
                                System.out.println("You found an amulet. +2 HP");
                                playerHp += 2;
                            } else if (x < 90) {
                                System.out.println("You found a fire scroll. +3 ATK");
                                playerAtk += 3;
                            } else {
                                System.out.println("You found a HP orb, You feel like your HP cap has increased, +1 more HP");
                                playerHpCap += 1;
                            }
                            Thread.sleep(2000);
                            System.out.println("You continue on your journey\n");
                            x = rng();
                            return x;
                        } else if (rng < 100) {
                            Thread.sleep(2000);
                            System.out.println("You continue on your journey\n");
                            x = rng();
                            return x;
                        }
                        //if player dies
                    } else if (playerHp <= 0) {
                        return x;
                    }
                    //displays whose turn
                    if (turn == 1) {
                        System.out.println("\nPlayer's turn");
                    } else if (turn == 2) {
                        System.out.println("\nEnemy's turn");
                    }
                    Thread.sleep(1500);
                    //player turn
                    if (turn == 1) {

                        System.out.println("What will you do?"
                                + "\nFight | Stats | Run");
                        user1 = s.next();
                        user = user1.toLowerCase();
                        //if player wants to fight
                        if ("fight".equals(user)) {
                            rng = rng();
                            if (rng < 80) {
                                System.out.println("You hit the enemy");
                                a.setEnemyHp(a.hp - playerAtk);
                                turn = 2;
                            } else if (rng < 100) {
                                System.out.println("You missed the enemy");
                                turn = 2;
                            }
                            //if player wants to see stats
                        } else if ("stats".equals(user) || "stat".equals(user)) {
                            System.out.println(stats());
                        } else if ("run".equals(user)) {
                            rng = rng();
                            if (rng < 30) {
                                System.out.println("You managed to run away");
                                x = rng();
                                return x;
                            } else if (rng < 100) {
                                System.out.println("You failed to run away from the enemy");
                                turn = 2;
                            }
                            //if input is wrong
                        } else {
                            System.out.println("Nothing Happened");
                        }
                        //AI's turn
                    } else if (turn == 2) {
                        rng = rng();
                        //if enemy hits or miss
                        if (rng < a.acc) {
                            System.out.println("The enemy successfully hits you");
                            playerHp -= a.atk;
                            turn = 1;
                        } else {
                            System.out.println("The enemy missed");
                            turn = 1;
                        }
                    }
                } while (true);
            }
        } else if ("attack".equals(user)) {
            rng = rng();
            if (rng < 60) {
                turn = 1;
            } else if (rng < 100) {
                turn = 2;
            }
            enemy a;
            a = new enemy();
            Thread.sleep(1000);
            System.out.println("\nYou prepare to fight"
                    + "\nA " + a.FirstTrait + " " + a.SecondTrait + " " + a.name + " has appeared");
            do {
                //if enemy dies
                if (a.hp <= 0) {
                    Thread.sleep(1500);
                    System.out.println("\nThe "+a.FirstTrait + " " + a.SecondTrait + " " + a.name + " has been defeated\n");
                    //if enemy dropped something
                    if (rng < 20) {
                        System.out.println("Hm...You found something");
                        Thread.sleep(2000);
                        rng = rng();
                        //loot drop rng
                        if (x < 25) {
                            System.out.println("You found a HP potion. +5 HP");
                            playerHp += 5;
                        } else if (x < 40) {
                            System.out.println("You found a better Sword. +1 ATK");
                            playerAtk += 1;
                        } else if (x < 55) {
                            System.out.println("You found a HP amulet. +2 HP");
                            playerHp += 2;
                        } else if (x < 90) {
                            System.out.println("You found a fire scroll. +3 ATK");
                            playerAtk += 3;
                        } else {
                            System.out.println("You found a HP orb, You feel like your HP cap has increased, +1 HP");
                            playerHpCap += 1;
                        }
                        Thread.sleep(2000);
                        System.out.println("You continue on your journey\n");
                        x = rng();
                        return x;
                    } else if (rng < 100) {
                        Thread.sleep(2000);
                        System.out.println("You continue on your journey\n");
                        x = rng();
                        return x;
                    }
                    //if player dies
                } else if (playerHp <= 0) {
                    return x;
                }
                //displays whose turn
                if (turn == 1) {
                    System.out.println("\nPlayer's turn");
                } else if (turn == 2) {
                    System.out.println("\nEnemy's turn");
                }
                Thread.sleep(1500);
                //player turn
                if (turn == 1) {

                    System.out.println("What will you do?"
                            + "\nFight | Stats | Run");
                    user1 = s.next();
                    user = user1.toLowerCase();
                    //if player wants to fight
                    if ("fight".equals(user)) {
                        rng = rng();
                        if (rng < 80) {
                            System.out.println("You hit the enemy");
                            a.setEnemyHp(a.hp - playerAtk);
                            turn = 2;
                        } else if (rng < 100) {
                            System.out.println("You missed the enemy");
                            turn = 2;
                        }
                        //if player wants to see stats
                    } else if ("stats".equals(user) || "stat".equals(user)) {
                        System.out.println(stats());
                    } else if ("run".equals(user)) {
                        rng = rng();
                        if (rng < 30) {
                            System.out.println("You managed to run away");
                            x = rng();
                            return x;
                        } else if (rng < 100) {
                            System.out.println("You failed to run away from the enemy");
                            turn = 2;
                        }
                        //if input is wrong
                    } else {
                        System.out.println("Nothing Happened");
                    }
                    //AI's turn
                } else if (turn == 2) {
                    rng = rng();
                    //if enemy hits or miss
                    if (rng < a.acc) {
                        System.out.println("The enemy successfully hits you");
                        playerHp -= a.atk;
                        turn = 1;
                    } else {
                        System.out.println("The enemy missed");
                        turn = 1;
                    }
                }
            } while (true);
        }
        else {
                System.out.println("Nothing Happened");
            }
        rng = rng();
        return x;
    }

    public static int end(int x) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.out.println("You see a bright light in front of you"
                + "\nWalk | Back | Stats");
        input = s.next();
        String result = input.toLowerCase();
        //if player want to end
        if ("walk".equals(result)) {
            System.out.println("You moved towards the light");
            Thread.sleep(2000);
            System.out.println("You feel the light enveloping you");
            Thread.sleep(2000);
            System.out.println("As you open your eyes to finally see the world outside of what you known");
            Thread.sleep(2000);
            System.out.println("You smile at last, as you leave the dungeon behind, and into the light");
            return 1;
            //if player wants to go back
        } else if ("back".equals(result)) {
            System.out.println("You went back to the darkness of the dungeon");
            x = rng();
            return 0;
            //if player wants to see stats
        } else if ("stats".equals(result) || "stat".equals(result)) {
            System.out.println(stats());
            //if player inputs wrong word
        } else {
            System.out.println("Nothing Happened");
        }
        return 1;
    }

    public static int deadend(int x) {
        Scanner s = new Scanner(System.in);
        System.out.println("You see a dead end\nWhat will you do?"
                + "\nBack | Stats");
        do {
            input = s.next();
            String result = input.toLowerCase();
            //if player wants to go back
            if ("back".equals(result)) {
                System.out.println("You moved backwards\n");
                x = rng();
                break;
                //if player wants to see stats
            } else if ("stats".equals(result) || "stat".equals(result)) {
                System.out.println(stats());
                //if player inputs wrong word
            } else {
                System.out.println("Nothing Happened");
            }
        } while (true);
        return x;
    }

    public static int boss(int x) throws InterruptedException {
        int turn = 0, rng = 0;
        String user = "", user1 = "";
        boss a;
        a = new boss();
        Scanner s = new Scanner(System.in);
        System.out.println("\nYou find a huge room");
        Thread.sleep(2000);
        System.out.println("\nThe door shuts behind you");
        Thread.sleep(2000);
        System.out.println("\nA " + a.FirstTrait + " " + a.SecondTrait + " " + a.name + " Has appeared");
        rng = rng();
        if (rng < 70) {
            turn = 1;
        } else if (rng < 100) {
            turn = 2;
        }

        do {
            if (a.hp <= 0) {
                Thread.sleep(1500);
                System.out.println("\nThe " + a.FirstTrait + " " + a.SecondTrait + " " + a.name + " has been defeated\n");
                if (rng < 20) {
                    System.out.println("Hm...You found something");
                    rng = rng();
                    Thread.sleep(2000);
                    if (x < 25) {
                        System.out.println("You found a HP potion. +5 HP");
                        playerHp += 5;
                    } else if (x < 40) {
                        System.out.println("You found a better Sword. +1 ATK");
                        playerAtk += 1;
                    } else if (x < 55) {
                        System.out.println("You found an amulet.+2 HP");
                        playerHp += 2;
                    } else if (x < 90) {
                        System.out.println("You found a fire scroll. +3 ATK");
                        playerAtk += 3;
                    } else {
                        System.out.println("You found a HP orb, You feel like your HP cap has increased, +1 HP");
                        playerHpCap += 1;
                    }
                    Thread.sleep(2000);
                    System.out.println("You continue on your journey\n");
                    x = rng();
                    return x;
                } else if (rng < 100) {
                    Thread.sleep(2000);
                    System.out.println("You continue on your journey\n");
                    x = rng();
                    return x;
                }
            } else if (playerHp <= 0) {
                return x;
            }
            if (turn == 1) {
                System.out.println("\nPlayer's turn");
            } else if (turn == 2) {
                System.out.println("\nEnemy's turn");
            }
            Thread.sleep(1500);
            if (turn == 1) {
                System.out.println("What will you do?"
                        + "\nFight | Stats | Run");
                user1 = s.next();
                user = user1.toLowerCase();
                if ("fight".equals(user)) {
                    rng = rng();
                    if (rng < 80) {
                        System.out.println("You hit the enemy");
                        a.setEnemyHp(a.hp - playerAtk);
                        turn = 2;
                    } else if (rng < 100) {
                        System.out.println("You missed the enemy");
                        turn = 2;
                    }
                } else if ("stats".equals(user) || "stat".equals(user)) {
                    System.out.println(stats());
                } else if ("run".equals(user)) {
                    System.out.println("You cannot run from a boss, duh");
                } else {
                    System.out.println("Nothing Happened");
                }
            } else if (turn == 2) {
                rng = rng();
                if (rng < a.acc) {
                    System.out.println("The enemy successfully hits you");
                    playerHp -= a.atk;
                    turn = 1;
                } else {
                    System.out.println("The enemy missed");
                    turn = 1;
                }
            }
        } while (true);
    }
}
