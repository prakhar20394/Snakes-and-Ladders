package com.example.snakes_and_ladders;

//CLASS TUNNEL-----------------------------------------
class Tunnel {
    private Tile start;
    private Tile end;
    private TileType type;

    public Tunnel(int start, int end, TileType type) {
        this.start = Board.getTile(start);
        this.end = Board.getTile(end);
        this.type = type;
        this.start.setType(type);
    }

    public Tile getStart() {
        return start;
    }

    public void setStart(Tile start) {
        this.start = start;
    }

    public Tile getEnd() {
        return end;
    }

    public void setEnd(Tile end) {
        this.end = end;
    }

    public TileType getType() {
        return type;
    }

    public void setType(TileType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tunnel{" +
                "start=" + start +
                ", end=" + end +
                ", type=" + type +
                '}';
    }

    public boolean isTunnel(Tile tile) {
        if (start.getType() == TileType.SNAKE || start.getType() == TileType.LADDER) {
            return true;
        } else {
            return false;
        }
    }
}




