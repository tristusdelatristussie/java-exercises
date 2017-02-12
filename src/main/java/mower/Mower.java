package mower;


import java.util.Objects;

public class Mower {

    private int x;
    private int y;
    private Direction direction;

    public Mower(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Mower() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }


    public Mower forward() {
        if (Direction.NORTH == direction) {
            return new Mower(x, y + 1, direction);
        }
        if (Direction.SOUTH == direction) {
            return new Mower(x, y - 1, direction);
        }
        if (Direction.EAST == direction) {
            return new Mower(x + 1, y, direction);
        }
        if (Direction.WEST == direction) {
            return new Mower(x - 1, y, direction);
        }
        return new Mower(x, y, direction);
    }

    public Mower onLeft() {

        if (Direction.NORTH == direction) {
            direction = Direction.WEST;
        } else if (Direction.SOUTH == direction) {
            direction = Direction.EAST;
        } else if (Direction.EAST == direction) {
            direction = Direction.NORTH;
        } else if ((Direction.WEST == direction)) {
            direction = Direction.SOUTH;
        }
        return new Mower(x, y, direction);
    }

    public Mower onRight() {
        if (Direction.NORTH == direction) {
            direction = Direction.EAST;
        } else if (Direction.SOUTH == direction) {
            direction = Direction.WEST;
        } else if (Direction.EAST == direction) {
            direction = Direction.SOUTH;
        } else if ((Direction.WEST == direction)) {
            direction = Direction.NORTH;
        }
        return new Mower(x, y, direction);
    }


    public boolean isOnLawn(Lawn lawn) {
        if (x < 0 || x > lawn.getxMax()) {
            return false;
        }
        if (y < 0 || y > lawn.getyMax()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mower mower = (Mower) o;
        return x == mower.x &&
                y == mower.y &&
                direction == mower.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, direction);
    }
}
