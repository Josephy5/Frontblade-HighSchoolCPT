/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpt;

import java.util.Random;

/**
 *
 * @author Joseph Yong
 */
public class enemy {

    String FirstTrait;
    String SecondTrait;
    String name;
    int hp;
    int atk;
    int acc;

    public enemy() {
        int temp = 0;
        Random r = new Random();
        temp = r.nextInt(100);
        if (temp < 20) {
            FirstTrait = "Giant";
            hp += 2;
            atk += 1;
            acc -= 5;
        } else if (temp < 40) {
            FirstTrait = "Small";
            hp -= 2;
            atk -= 2;
            acc += 5;
        } else if (temp < 60) {
            FirstTrait = "Weak";
            hp -= 3;
            atk -= 1;
            acc -= 2;
        } else if (temp < 80) {
            FirstTrait = "Armoured";
            hp += 2;
        } else {
            FirstTrait = "Average";
        }
        temp = r.nextInt(100);
        if (temp < 20) {
            SecondTrait = "Agerssive";
            atk += 3;
            acc -= 3;
        } else if (temp < 40) {
            SecondTrait = "Defensive";
            hp += 4;
            atk -= 3;
        } else if (temp < 60) {
            SecondTrait = "Devious";
            atk += 1;
            acc += 1;
        } else if (temp < 80) {
            SecondTrait = "Skilled";
            hp += 3;
            atk += 3;
            acc += 3;
        } else {
            SecondTrait = "Normal";
        }
        temp = r.nextInt(100);
        if (temp < 20) {
            name = "Orc";
            hp += 4;
            atk += 6;
            acc += 55;
        } else if (temp < 40) {
            name = "Skeleton";
            hp += 2;
            atk += 2;
            acc += 40;
        } else if (temp < 60) {
            name = "Slime";
            hp = 5;
            atk += 2;
            acc += 45;
        } else if (temp < 80) {
            name = "Undead";
            hp += 3;
            atk += 3;
            acc += 35;
        } else {
            name = "Goblin";
            hp += 1;
            atk += 2;
            acc += 40;

        }
        if (hp <= 0) {
            hp = 1;
        } else if (atk <= 0) {
            atk = 1;
        } else if (acc <= 0) {
            acc = 30;
        }
    }

    public void setEnemyHp(int x1) {
        hp = x1;
    }

    public String toString() {
        String output = "";
        output += "Name: " + name;
        output += "First Trait:" + FirstTrait;
        output += "Second Trait:" + SecondTrait;
        output += "HP: " + hp;
        output += "Atk: " + atk;
        output += "Acc: " + acc;
        return output;
    }    
}
