package com.example.snakes_and_ladders;

//CLASS TILE------------------------------------------
class Tile {
    private int tileNumber;
    private int tileXPosition;
    private int tileYPosition;
    private TileType type;

    public Tile(int tileNumber, int tileXPosition, int tileYPosition, TileType type) {
        this.tileNumber = tileNumber;
        this.tileXPosition = tileXPosition;
        this.tileYPosition = tileYPosition;
        this.type = type;
    }

    public int getTileNumber() {
        return this.tileNumber;
    }

    public void setTileNumber(int tileNumber) {
        this.tileNumber = tileNumber;
    }

    public int getTileXPosition() {
        return this.tileXPosition;
    }

    public void setTileXPosition(int tileXPosition) {
        this.tileXPosition = tileXPosition;
    }

    public int getTileYPosition() {
        return this.tileYPosition;
    }

    public void setTileYPosition(int tileYPosition) {
        this.tileYPosition = tileYPosition;
    }

    public TileType getType() {
        return this.type;
    }

    public void setType(TileType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tile{" +
                "tileNumber=" + tileNumber +
                ", tileXPosition=" + tileXPosition +
                ", tileYPosition=" + tileYPosition +
                ", type=" + type +
                '}';
    }
}
