package fatsquirrel.core;

public final class XY {
    private int x;
    private int y;

    public XY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX(){ return x; }

    public int getY(){ return y; }

    @Override
    public String toString() {
        return "de.hsa.games.fatsquirrel.core.XY{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}