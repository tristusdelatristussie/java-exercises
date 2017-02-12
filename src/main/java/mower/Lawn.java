package mower;


import java.util.ArrayList;
import java.util.Objects;

public class Lawn {

    private int xMax;

    private int yMax;

    private Mower mower;

    public Lawn() {

    }

    public Lawn(int xMax, int yMax, Mower mower) {
        this.xMax = xMax;
        this.yMax = yMax;
        this.mower = mower;
    }

    public Lawn(int xMax, int yMax) {
        this.xMax = xMax;
        this.yMax = yMax;
    }

    public Mower getMower() {
        return mower;
    }

    public void setMower(Mower mower) {
        this.mower = mower;
    }

    public int getyMax() {
        return yMax;
    }

    public void setyMax(int yMax) {
        this.yMax = yMax;
    }

    public int getxMax() {
        return xMax;
    }

    public void setxMax(int xMax) {
        this.xMax = xMax;
    }

    public Lawn from(ArrayList<String> commands) {

        String mowerPosition = commands.get(1);
        String[] positions = mowerPosition.split("");
        int mowerX = Integer.parseInt(positions[0]);
        int mowerY = Integer.parseInt(positions[1]);
        Direction mowerDirection = Direction.get(positions[2]);
        Mower mower = new Mower(mowerX, mowerY, mowerDirection);

        String surface = commands.get(0);
        String[] coordinates = surface.split("");
        int xMax = Integer.parseInt(coordinates[0]);
        int yMax = Integer.parseInt(coordinates[1]);
        return new Lawn(xMax, yMax, mower);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lawn lawn = (Lawn) o;
        return xMax == lawn.xMax &&
                yMax == lawn.yMax &&
                Objects.equals(mower, lawn.mower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xMax, yMax, mower);
    }
}
