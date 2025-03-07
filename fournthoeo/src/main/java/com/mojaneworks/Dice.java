package com.mojaneworks;

import java.util.Random;

public class Dice {

    private Random dice;
    private int diceRoll;
    private Player diceRoller;

    public Dice(Player diceRoller){

        this.diceRoller = diceRoller;
        
        this.dice = new Random();
        this.diceRoll = this.dice.nextInt(1, 7);
    }

    public int getDiceRoll(){

        return this.diceRoll;
    }

    public Player getDiceRoller(){

        return this.diceRoller;
    }
    
    
}
