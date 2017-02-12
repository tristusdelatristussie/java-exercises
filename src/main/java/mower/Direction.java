package mower;


public enum Direction {
    NORTH("N"),
    EAST("E"),
    SOUTH("S"),
    WEST("W");

    private String direction = "";

    Direction(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Direction{" +
                "direction='" + direction + '\'' +
                '}';
    }

    public static Direction get(String direction) {
        switch (direction) {
            case "N":
                return NORTH;
            case "E":
                return EAST;
            case "S":
                return SOUTH;
            case "W":
                return WEST;
        }
        return null;
    }


}
