package com.example.snakes_and_ladders;

//CLASS DICE________________________________
class Dice {
    private static int diceValue;

    public static int diceRoll() {
        diceValue = (int) (Math.random() * 6 + 1);
        return diceValue;
    }

    public int getDiceValue() {
        return diceValue;
    }


}
