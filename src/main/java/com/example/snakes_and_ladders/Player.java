package com.example.snakes_and_ladders;

import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.io.File;

//CLASS PLAYER------------------------------------------
class Player {
    public ImageView image;
    private Tile currentTile;
    private boolean isWinner;
    private boolean unlocked;
    private boolean chance;
    private String name;

    public Player(ImageView image) {
        this.currentTile = new Tile(0, 15, 541, TileType.HOME);
        this.isWinner = false;
        this.unlocked = false;
        this.chance = false;
        this.image = image;
    }

    public Tile getCurrentTile() {
        return this.currentTile;
    }

    public void setCurrentTile(Tile currentTile) {
        this.currentTile = currentTile;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        this.isWinner = winner;
    }

    public boolean isUnlocked() {
        return this.unlocked;
    }

    public void setUnlocked(boolean unlocked) {
    
        this.unlocked = unlocked;
    }

    public boolean isChance() {
        return this.chance;
    }

    public void setChance(boolean chance) {
        this.chance = chance;
    }

    public void movePiece(int diceValue, ImageView PlayerImage) {
        if (this.currentTile.getTileNumber() + diceValue <= 100) {
            // find the tile object of the current tile number + dice value
            Tile tile = Board.getTile(this.currentTile.getTileNumber() + diceValue);
            // translate the player image to the new tile
            //PlayerImage.setTranslateX(tile.getTileXPosition());
            //PlayerImage.setTranslateY(tile.getTileYPosition());

            //testing
            Media m=new Media(new File("movement.wav").toURI().toString());
            MediaPlayer mediaPlaye=new MediaPlayer(m);
            mediaPlaye.play();
            TranslateTransition translate = new TranslateTransition();
            translate.setNode(PlayerImage);
            translate.setDuration(new Duration(1000));
            translate.setByX(tile.getTileXPosition()-PlayerImage.getTranslateX());
            translate.setByY(tile.getTileYPosition()-PlayerImage.getTranslateY());
            translate.play();




            // set the current tile to the new tile
            this.currentTile = tile;
            Board.checkTile(this, PlayerImage);

            System.out.println("Player " + this + " is on tile " + this.currentTile.getTileNumber());
            System.out.println("Player " + this + " is on tile " + this.currentTile.toString());

        } else {
            // do nothing
        }
    }

    public void move(int rand, ImageView imagePlayer){
        if(this.isChance()){
            if(isUnlocked()){
                movePiece(rand, imagePlayer);
            }
        }
    }
    

    public int getPosition() {
        return this.currentTile.getTileNumber();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPosition(Tile tile) {
        this.currentTile = tile;
    }

    public void moveTo(Tile end, ImageView imagePlayer) { 
        //this.image.setTranslateX(end.getTileXPosition());
        //this.image.setTranslateY(end.getTileYPosition());

        //testing
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(this.image);
        translate.setDuration(new Duration(1000));
        translate.setByX(end.getTileXPosition()-this.image.getTranslateX());
        translate.setByY(end.getTileYPosition()-this.image.getTranslateY());
        translate.play();
        this.currentTile = end;
    }

    

}

