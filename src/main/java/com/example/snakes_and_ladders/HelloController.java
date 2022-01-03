package com.example.snakes_and_ladders;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
//import javafx.scene.media.Media;
//import javafx.scene.media.MediaPlayer;
//import javafx.scene.media.MediaView;

public class HelloController{
    private boolean gameStarted = false;

    @FXML
    private  ImageView dice_animation;

    @FXML
    private Button back;

    @FXML
    private ImageView back_img;

    @FXML
    private Pane back_pane;

    @FXML
    private Button back_to_game;

    @FXML
    private Button back_to_menu;

    @FXML
    private ImageView background;

    @FXML
    private ImageView background1;

    @FXML
    private ImageView blue_player;

    @FXML
    private ImageView board;

    @FXML
    private Label coords;

    @FXML
    private ImageView dice_1;

    @FXML
    private ImageView dice_2;

    @FXML
    private ImageView dice_3;

    @FXML
    private ImageView dice_4;

    @FXML
    private ImageView dice_5;

    @FXML
    private ImageView dice_6;

    @FXML
    private Button dice_click;

    @FXML
    private ImageView green_player;

    @FXML
    private Label loser_label;

    @FXML
    private Pane menu;

    @FXML
    private ImageView menu_ss;

    @FXML
    private ImageView p1_layout;

    @FXML
    private ImageView p2_layout;

    @FXML
    private Button replay_button;

    @FXML
    private Button start_button;

    @FXML
    private Label winner_label;

    @FXML
    private Button winner_menu_button;

    @FXML
    private Pane winner_screen;

    @FXML
    private Rectangle player1_black;

    @FXML
    private Rectangle player2_black;

    public void initialize(){
        //file=new File("animation.mp4");
        //media=new Media(file.toURI().toString());
        player1_black.setVisible(false);
        Bounds bis=tap.localToScene(tap.getBoundsInLocal());
        orgx=bis.getMinX();
        orgy=bis.getMinY();
        tap.setVisible(false);
        dice_animation.setVisible(false);

    }

    @FXML
    void hide_backmenu(ActionEvent event) {
        back_pane.setVisible(false);
    }

    @FXML
    void hidee(ActionEvent event) {
        menu.setVisible(false);
        back_pane.setVisible(false);
        winner_screen.setVisible(false);
        Media m=new Media(new File("start.wav").toURI().toString());
        MediaPlayer mediaPlaye=new MediaPlayer(m);
        mediaPlaye.play();
    }

    @FXML
    void showBackScreen(ActionEvent event) {
        back_pane.setVisible(true);
    }

    @FXML
    void show_menu(ActionEvent event) {
        menu.setVisible(true);
        resetGame();
    }

    private Player player1;
    private Player player2;
    Board gameboard = new Board();


    // unlock player
    public void unlockPlayer(Player player){
        player.setUnlocked(true);
        player.setCurrentTile(getStartTile());
    }

    private Tile getStartTile() {
        // return tile with tileNumber = 1
        return Board.getTile(1);
    }

    // roll dice and move forward
    public void rollDice(Player player, int diceValue){

        // roll dice
        // move forward
        if (player1.isWinner() || player2.isWinner()) {
            // scene change
            
        } else {
            if (player.isUnlocked()) {
                player.move(diceValue, player.image);

                player.setChance(false);
            } else {
                if ( diceValue == 1) {
                    player.setCurrentTile(getStartTile());
                    player.setUnlocked(true);
                    player.setChance(false);
                    player.image.setTranslateX(9);
                    player.image.setTranslateY(-37);
                }
                else {
                    player.setChance(false);
                }
            }
        }
        
    }




    public void ask2move(ActionEvent event) throws InterruptedException {
//        AudioClip note=new AudioClip(this.getClass().getResource("move.wav").toString());
//        note.play();
        Media media=new Media(new File("move.mp4").toURI().toString());
        MediaPlayer mediaPlayer=new MediaPlayer(media);
        mediaPlayer.play();
        show_dice_animation();

        if (!gameStarted){
            // create 2 players
            //mediaPlayer.play();


            player1 = new Player(blue_player);
            player2 = new Player(green_player);
            // set player1's chance to true
            player1.setChance(true);
            Board.setup();
            gameStarted = true;
            //dice_animation.setVisible(true);
            int rand = Dice.diceRoll();
            // wait 1.5 second for animation to finish
            //Thread.sleep(1500);
            //dice_animation.setVisible(false);
            showDice(rand);
            if (rand ==1){
                player1.setUnlocked(true);
                player1.setCurrentTile(getStartTile());
                player1.image.setTranslateX(9);
                player1.image.setTranslateY(-37);
            }
            player1.setChance(false);
            player2.setChance(true);

            if(player1.isChance()==true){
                player1_black.setVisible(false);
                player2_black.setVisible(true);
            }
            if(player2.isChance()==true){
                player2_black.setVisible(false);
                player1_black.setVisible(true);
            }


        } else {

            int rand;
            rand = Dice.diceRoll();
        //dice_animation.setVisible(true);
        // wait for animation to finish
        //Thread.sleep(1500);
        //dice_animation.setVisible(false);
        showDice(rand);
        if (player1.isChance()){
            rollDice(player1, rand);
            player2.setChance(true);
        } else {
            rollDice(player2, rand);
            player1.setChance(true);
        }

            if(player1.isChance()==true){
                player1_black.setVisible(false);
                player2_black.setVisible(true);
            }
            if(player2.isChance()==true){
                player2_black.setVisible(false);
                player1_black.setVisible(true);
            }
            if(player1.isWinner()==true){
                winner_label.setText("Player 1");
                loser_label.setText("Player 2");
                winner_screen.setVisible(true);
                System.out.println("Winner 1");
                Media m=new Media(new File("winning.wav").toURI().toString());
                MediaPlayer mediaPlaye=new MediaPlayer(m);
                mediaPlaye.play();
            }
            if(player2.isWinner()==true){
                winner_label.setText("Player 2");
                loser_label.setText("Player 1");
                winner_screen.setVisible(true);
                System.out.println("Winner 2");
                Media m=new Media(new File("winning.wav").toURI().toString());
                MediaPlayer mediaPlaye=new MediaPlayer(m);
                mediaPlaye.play();
            }


        }



    }

    public void translation(ImageView img, int x, int y){
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(img);
        translate.setDuration(new Duration(1000));
        translate.setByX(100);
        translate.play();
    }

    private void showDice(int rand){
        if(rand==1){
            dice_1.setVisible(true);
            dice_2.setVisible(false);
            dice_3.setVisible(false);
            dice_4.setVisible(false);
            dice_5.setVisible(false);
            dice_6.setVisible(false);
        }
        if(rand==2){
            dice_1.setVisible(false);
            dice_2.setVisible(true);
            dice_3.setVisible(false);
            dice_4.setVisible(false);
            dice_5.setVisible(false);
            dice_6.setVisible(false);
        }
        if(rand==3){
            dice_1.setVisible(false);
            dice_2.setVisible(false);
            dice_3.setVisible(true);
            dice_4.setVisible(false);
            dice_5.setVisible(false);
            dice_6.setVisible(false);
        }
        if(rand==4){
            dice_1.setVisible(false);
            dice_2.setVisible(false);
            dice_3.setVisible(false);
            dice_4.setVisible(true);
            dice_5.setVisible(false);
            dice_6.setVisible(false);
        }
        if(rand==5){
            dice_1.setVisible(false);
            dice_2.setVisible(false);
            dice_3.setVisible(false);
            dice_4.setVisible(false);
            dice_5.setVisible(true);
            dice_6.setVisible(false);
        }
        if(rand==6){
            dice_1.setVisible(false);
            dice_2.setVisible(false);
            dice_3.setVisible(false);
            dice_4.setVisible(false);
            dice_5.setVisible(false);
            dice_6.setVisible(true);
        }
    }

    public void giveCoords(MouseEvent mouseEvent) {
        double x;
        double y;
        y=mouseEvent.getSceneY();
        x=mouseEvent.getSceneX();
        coords.setText(String.valueOf(x)+"  "+String.valueOf(y));
    }

    // reset game on going on menu
    public void resetGame() {
        gameStarted = false;
        player1.image.setTranslateX(0);
        player1.image.setTranslateY(0);
        player2.image.setTranslateX(0);
        player2.image.setTranslateY(0);
        player1.setUnlocked(false);
        player2.setUnlocked(false);
        player1.setCurrentTile(getStartTile());
        player2.setCurrentTile(getStartTile());
        player1.setChance(false);
        player2.setChance(false);
        player1.setWinner(false);
        player2.setWinner(false);

    }

    @FXML
    public void back_to_menu_from_winner(ActionEvent event) {
        winner_screen.setVisible(false);
        menu.setVisible(true);
        resetGame();
    }

    @FXML
    public void replay_game(ActionEvent event){
        resetGame();
        winner_screen.setVisible(false);
    }

    public void show_dice_animation(){
        dice_animation.setVisible(true);
        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dice_animation.setVisible(false);
        }).start();
    }


    //trial media view
    /*@FXML
    public MediaView dice_ani;
    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;*/

    @FXML
    private ImageView tap;

    double orgx=0;
    double orgy=0;


    @FXML
    void tap_ani(MouseEvent event){
        double x;
        double y;
        y=event.getSceneY();
        x=event.getSceneX();
        tap.setX(x-orgx-30);
        tap.setY(y-orgy-30);
        showTap();
    }
    public void showTap(){
        tap.setVisible(true);
        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tap.setVisible(false);
        }).start();
    }


}






