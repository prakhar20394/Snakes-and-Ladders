package com.example.snakes_and_ladders;

import java.io.File;
import java.util.ArrayList;

import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

//CLASS BOARD------------------------------------------
class Board {
    // create a 2D arraylist of tiles called board
    private static ArrayList<Tile> board = new ArrayList<>();
    // array for snakes and ladders tunnel
    private static ArrayList<Tunnel> snakes = new ArrayList<>();
    private static ArrayList<Tunnel> ladders = new ArrayList<>();
    private static int numberOfSnakes = 10;
    private static int numberOfLadders = 10;
    static int row = 10;
    static int column = 10;

    // initialise board with 10x10 tiles
    public static void setup() {
        initialiseBoard(board, row, column);
        initialiseSnakes(numberOfSnakes);
        initialiseLadders(numberOfLadders);
        initialiseStartAndEnd();
    }

    private static void initialiseStartAndEnd() {
        getTile(1).setType(TileType.START);
        getTile(100).setType(TileType.END);
    }

    public static void initialiseBoard(ArrayList<Tile> board, int rows, int columns) {
        // board of size 10x10
        // 100 99 98 ...91
        // 81 82 83 ... 90
        // 80 79 78 ... 71
        // 61 62 63 ... 70
        // 60 59 58 ... 51
        // 41 42 43 ... 50
        // 40 39 38 ... 31
        // 21 22 23 ... 30
        // 20 19 18 ... 11
        // 01 02 03 ... 10
        Tile Tile1 = new Tile(1,9, -37, TileType.START);
        board.add(Tile1);
        Tile Tile2 = new Tile(2,49, -37, TileType.NORMAL);
        board.add(Tile2);
        Tile Tile3 = new Tile(3,89, -37, TileType.NORMAL);
        board.add(Tile3);
        Tile Tile4 = new Tile(4,129, -37, TileType.NORMAL);
        board.add(Tile4);
        Tile Tile5 = new Tile(5,169, -37, TileType.NORMAL);
        board.add(Tile5);
        Tile Tile6 = new Tile(6,209, -37, TileType.NORMAL);
        board.add(Tile6);
        Tile Tile7 = new Tile(7,249, -37, TileType.NORMAL);
        board.add(Tile7);
        Tile Tile8 = new Tile(8,289, -37, TileType.NORMAL);
        board.add(Tile8);
        Tile Tile9 = new Tile(9,329, -37, TileType.NORMAL);
        board.add(Tile9);
        Tile Tile10 = new Tile(10,369, -37, TileType.NORMAL);
        board.add(Tile10);
        Tile Tile11 = new Tile(11,369, -77, TileType.NORMAL);
        board.add(Tile11);
        Tile Tile12 = new Tile(12,329, -77, TileType.NORMAL);
        board.add(Tile12);
        Tile Tile13 = new Tile(13,289, -77, TileType.NORMAL);
        board.add(Tile13);
        Tile Tile14 = new Tile(14,249, -77, TileType.NORMAL);
        board.add(Tile14);
        Tile Tile15 = new Tile(15,209, -77, TileType.NORMAL);
        board.add(Tile15);
        Tile Tile16 = new Tile(16,169, -77, TileType.NORMAL);
        board.add(Tile16);
        Tile Tile17 = new Tile(17,129, -77, TileType.NORMAL);
        board.add(Tile17);
        Tile Tile18 = new Tile(18,89, -77, TileType.NORMAL);
        board.add(Tile18);
        Tile Tile19 = new Tile(19,49, -77, TileType.NORMAL);
        board.add(Tile19);
        Tile Tile20 = new Tile(20,9, -77, TileType.NORMAL);
        board.add(Tile20);
        Tile Tile21 = new Tile(21,9, -117, TileType.NORMAL);
        board.add(Tile21);
        Tile Tile22 = new Tile(22,49, -117, TileType.NORMAL);
        board.add(Tile22);
        Tile Tile23 = new Tile(23,89, -117, TileType.NORMAL);
        board.add(Tile23);
        Tile Tile24 = new Tile(24,129, -117, TileType.NORMAL);
        board.add(Tile24);
        Tile Tile25 = new Tile(25,169, -117, TileType.NORMAL);
        board.add(Tile25);
        Tile Tile26 = new Tile(26,209, -117, TileType.NORMAL);
        board.add(Tile26);
        Tile Tile27 = new Tile(27,249, -117, TileType.NORMAL);
        board.add(Tile27);
        Tile Tile28 = new Tile(28,289, -117, TileType.NORMAL);
        board.add(Tile28);
        Tile Tile29 = new Tile(29,329, -117, TileType.NORMAL);
        board.add(Tile29);
        Tile Tile30 = new Tile(30,369, -117, TileType.NORMAL);
        board.add(Tile30);
        Tile Tile31 = new Tile(31,369, -157, TileType.NORMAL);
        board.add(Tile31);
        Tile Tile32 = new Tile(32,329, -157, TileType.NORMAL);
        board.add(Tile32);
        Tile Tile33 = new Tile(33,289, -157, TileType.NORMAL);
        board.add(Tile33);
        Tile Tile34 = new Tile(34,249, -157, TileType.NORMAL);
        board.add(Tile34);
        Tile Tile35 = new Tile(35,209, -157, TileType.NORMAL);
        board.add(Tile35);
        Tile Tile36 = new Tile(36,169, -157, TileType.NORMAL);
        board.add(Tile36);
        Tile Tile37 = new Tile(37,129, -157, TileType.NORMAL);
        board.add(Tile37);
        Tile Tile38 = new Tile(38,89, -157, TileType.NORMAL);
        board.add(Tile38);
        Tile Tile39 = new Tile(39,49, -157, TileType.NORMAL);
        board.add(Tile39);
        Tile Tile40 = new Tile(40,9, -157, TileType.NORMAL);
        board.add(Tile40);
        Tile Tile41 = new Tile(41,9, -197, TileType.NORMAL);
        board.add(Tile41);
        Tile Tile42 = new Tile(42,49, -197, TileType.NORMAL);
        board.add(Tile42);
        Tile Tile43 = new Tile(43,89, -197, TileType.NORMAL);
        board.add(Tile43);
        Tile Tile44 = new Tile(44,129, -197, TileType.NORMAL);
        board.add(Tile44);
        Tile Tile45 = new Tile(45,169, -197, TileType.NORMAL);
        board.add(Tile45);
        Tile Tile46 = new Tile(46,209, -197, TileType.NORMAL);
        board.add(Tile46);
        Tile Tile47 = new Tile(47,249, -197, TileType.NORMAL);
        board.add(Tile47);
        Tile Tile48 = new Tile(48,289, -197, TileType.NORMAL);
        board.add(Tile48);
        Tile Tile49 = new Tile(49,329, -197, TileType.NORMAL);
        board.add(Tile49);
        Tile Tile50 = new Tile(50,369, -197, TileType.NORMAL);
        board.add(Tile50);
        Tile Tile51 = new Tile(51,369, -237, TileType.NORMAL);
        board.add(Tile51);
        Tile Tile52 = new Tile(52,329, -237, TileType.NORMAL);
        board.add(Tile52);
        Tile Tile53 = new Tile(53,289, -237, TileType.NORMAL);
        board.add(Tile53);
        Tile Tile54 = new Tile(54,249, -237, TileType.NORMAL);
        board.add(Tile54);
        Tile Tile55 = new Tile(55,209, -237, TileType.NORMAL);
        board.add(Tile55);
        Tile Tile56 = new Tile(56,169, -237, TileType.NORMAL);
        board.add(Tile56);
        Tile Tile57 = new Tile(57,129, -237, TileType.NORMAL);
        board.add(Tile57);
        Tile Tile58 = new Tile(58,89, -237, TileType.NORMAL);
        board.add(Tile58);
        Tile Tile59 = new Tile(59,49, -237, TileType.NORMAL);
        board.add(Tile59);
        Tile Tile60 = new Tile(60,9, -237, TileType.NORMAL);
        board.add(Tile60);
        Tile Tile61 = new Tile(61,9, -277, TileType.NORMAL);
        board.add(Tile61);
        Tile Tile62 = new Tile(62,49, -277, TileType.NORMAL);
        board.add(Tile62);
        Tile Tile63 = new Tile(63,89, -277, TileType.NORMAL);
        board.add(Tile63);
        Tile Tile64 = new Tile(64,129, -277, TileType.NORMAL);
        board.add(Tile64);
        Tile Tile65 = new Tile(65,169, -277, TileType.NORMAL);
        board.add(Tile65);
        Tile Tile66 = new Tile(66,209, -277, TileType.NORMAL);
        board.add(Tile66);
        Tile Tile67 = new Tile(67,249, -277, TileType.NORMAL);
        board.add(Tile67);
        Tile Tile68 = new Tile(68,289, -277, TileType.NORMAL);
        board.add(Tile68);
        Tile Tile69 = new Tile(69,329, -277, TileType.NORMAL);
        board.add(Tile69);
        Tile Tile70 = new Tile(70,369, -277, TileType.NORMAL);
        board.add(Tile70);
        Tile Tile71 = new Tile(71,369, -317, TileType.NORMAL);
        board.add(Tile71);
        Tile Tile72 = new Tile(72,329, -317, TileType.NORMAL);
        board.add(Tile72);
        Tile Tile73 = new Tile(73,289, -317, TileType.NORMAL);
        board.add(Tile73);
        Tile Tile74 = new Tile(74,249, -317, TileType.NORMAL);
        board.add(Tile74);
        Tile Tile75 = new Tile(75,209, -317, TileType.NORMAL);
        board.add(Tile75);
        Tile Tile76 = new Tile(76,169, -317, TileType.NORMAL);
        board.add(Tile76);
        Tile Tile77 = new Tile(77,129, -317, TileType.NORMAL);
        board.add(Tile77);
        Tile Tile78 = new Tile(78,89, -317, TileType.NORMAL);
        board.add(Tile78);
        Tile Tile79 = new Tile(79,49, -317, TileType.NORMAL);
        board.add(Tile79);
        Tile Tile80 = new Tile(80,9, -317, TileType.NORMAL);
        board.add(Tile80);
        Tile Tile81 = new Tile(81,9, -357, TileType.NORMAL);
        board.add(Tile81);
        Tile Tile82 = new Tile(82,49, -357, TileType.NORMAL);
        board.add(Tile82);
        Tile Tile83 = new Tile(83,89, -357, TileType.NORMAL);
        board.add(Tile83);
        Tile Tile84 = new Tile(84,129, -357, TileType.NORMAL);
        board.add(Tile84);
        Tile Tile85 = new Tile(85,169, -357, TileType.NORMAL);
        board.add(Tile85);
        Tile Tile86 = new Tile(86,209, -357, TileType.NORMAL);
        board.add(Tile86);
        Tile Tile87 = new Tile(87,249, -357, TileType.NORMAL);
        board.add(Tile87);
        Tile Tile88 = new Tile(88,289, -357, TileType.NORMAL);
        board.add(Tile88);
        Tile Tile89 = new Tile(89,329, -357, TileType.NORMAL);
        board.add(Tile89);
        Tile Tile90 = new Tile(90,369, -357, TileType.NORMAL);
        board.add(Tile90);
        Tile Tile91 = new Tile(91,369, -397, TileType.NORMAL);
        board.add(Tile91);
        Tile Tile92 = new Tile(92,329, -397, TileType.NORMAL);
        board.add(Tile92);
        Tile Tile93 = new Tile(93,289, -397, TileType.NORMAL);
        board.add(Tile93);
        Tile Tile94 = new Tile(94,249, -397, TileType.NORMAL);
        board.add(Tile94);
        Tile Tile95 = new Tile(95,209, -397, TileType.NORMAL);
        board.add(Tile95);
        Tile Tile96 = new Tile(96,169, -397, TileType.NORMAL);
        board.add(Tile96);
        Tile Tile97 = new Tile(97,129, -397, TileType.NORMAL);
        board.add(Tile97);
        Tile Tile98 = new Tile(98,89, -397, TileType.NORMAL);
        board.add(Tile98);
        Tile Tile99 = new Tile(99,49, -397, TileType.NORMAL);
        board.add(Tile99);
        Tile Tile100 = new Tile(100,9, -397, TileType.NORMAL);
        board.add(Tile100);
        
    }

    // initialise snakes
    public static void initialiseSnakes(int numberOfSnakes) {
        Tunnel snake1 = new Tunnel(15, 5, TileType.SNAKE);
        Tunnel snake2 = new Tunnel(22, 2, TileType.SNAKE);
        Tunnel snake3 = new Tunnel(33, 8, TileType.SNAKE);
        Tunnel snake4 = new Tunnel(44, 23, TileType.SNAKE);
        Tunnel snake5 = new Tunnel(68, 50, TileType.SNAKE);
        Tunnel snake6 = new Tunnel(79, 43, TileType.SNAKE);
        Tunnel snake7 = new Tunnel(85, 65, TileType.SNAKE);
        Tunnel snake8 = new Tunnel(92, 71, TileType.SNAKE);
        Tunnel snake9 = new Tunnel(94, 47, TileType.SNAKE);
        Tunnel snake10 = new Tunnel(98, 82, TileType.SNAKE);
        snakes.add(snake1);
        snakes.add(snake2);
        snakes.add(snake3);
        snakes.add(snake4);
        snakes.add(snake5);
        snakes.add(snake6);
        snakes.add(snake7);
        snakes.add(snake8);
        snakes.add(snake9);
        snakes.add(snake10);
    }

    // initialise ladders
    public static void initialiseLadders(int numberOfLadders) {
        Tunnel ladder1 = new Tunnel(3, 24, TileType.LADDER);
        Tunnel ladder2 = new Tunnel(7, 34, TileType.LADDER);
        Tunnel ladder3 = new Tunnel(12, 31, TileType.LADDER);
        Tunnel ladder4 = new Tunnel(20, 41, TileType.LADDER);
        Tunnel ladder5 = new Tunnel(36, 46, TileType.LADDER);
        Tunnel ladder6 = new Tunnel(56, 63, TileType.LADDER);
        Tunnel ladder7 = new Tunnel(60, 81, TileType.LADDER);
        Tunnel ladder8 = new Tunnel(69, 93, TileType.LADDER);
        Tunnel ladder9 = new Tunnel(75, 95, TileType.LADDER);
        Tunnel ladder10 = new Tunnel(78, 97, TileType.LADDER);
        // in board array, set the tile type to ladder
        ladders.add(ladder1);
        ladders.add(ladder2);
        ladders.add(ladder3);
        ladders.add(ladder4);
        ladders.add(ladder5);
        ladders.add(ladder6);
        ladders.add(ladder7);
        ladders.add(ladder8);
        ladders.add(ladder9);
        ladders.add(ladder10);
    }


    // get tile by tile number
    public static Tile getTile(int tileNumber) {
        for (int i = 0; i < 100; i++) {
                if (board.get(i).getTileNumber() == tileNumber) {
                    return board.get(i);
                }
            }
        return null;
    }

    public static void checkTile(Player player, ImageView imageView) {
        Tile tile = getTile(player.getPosition());
        if (tile.getType() == TileType.SNAKE) {
            player.moveTo(getSnake(tile).getEnd(), imageView);
        } else if (tile.getType() == TileType.LADDER) {
            player.moveTo(getLadder(tile).getEnd(), imageView);
        } else if (tile.getType() == TileType.END){
            player.setWinner(true);
        }
    }

    private static Tunnel getSnake(Tile tile) {
        for (int i = 0; i < snakes.size(); i++) {
            if (snakes.get(i).getStart().getTileNumber() == tile.getTileNumber()) {
                Media media=new Media(new File("snakes.wav").toURI().toString());
                MediaPlayer mediaPlayer=new MediaPlayer(media);
                mediaPlayer.play();
                return snakes.get(i);
            }
        }
        return null;
    }

    private static Tunnel getLadder(Tile tile) {
        for (int i = 0; i < ladders.size(); i++) {
            if (ladders.get(i).getStart().getTileNumber() == tile.getTileNumber()) {
                Media media=new Media(new File("ladder.wav").toURI().toString());
                MediaPlayer mediaPlayer=new MediaPlayer(media);
                mediaPlayer.play();
                return ladders.get(i);
            }
        }
        return null;
    }

    // reset game
    public void reset() {
        initialiseBoard(board, row, column);
        initialiseSnakes(numberOfSnakes);
        initialiseLadders(numberOfLadders);
        initialiseStartAndEnd();
    }

    // reset player position
    public void resetPlayerPosition(Player player) {
        player.setPosition(getTile(1));
    }
}

