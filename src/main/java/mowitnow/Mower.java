package mowitnow;

import org.apache.commons.lang.StringUtils;

public class Mower {

    private Position position = Position.atOrigin();
    private Orientation orientation = Orientation.North;

    private Mower() {
    }

    public Mower(int x, int y, String orientation) {
        this.position = new Position(x, y);
        this.orientation = Orientation.valueOf(StringUtils.capitalize(orientation.toLowerCase()));
    }

    public Mower(int x, int y) {
        this(new Position(x, y), Orientation.North);
    }

    public Mower(Position initialPosition, Orientation orientation) {
        this.position = initialPosition;
        this.orientation = orientation;
    }

    Position getPosition() {
        return position;
    }

    public void orient(Orientation orientation) {
        this.orientation = orientation;
    }

    public void move() {
        this.position = orientation.move(position);
    }

    public static Mower createMowerAtOriginFacingNorth() {
        return new Mower();
    }

    public void pivotLeft() {
        this.orientation = orientation.pivotLeft();
    }

    public void pivotRight() {
        this.orientation = orientation.pivotRight();
    }

    public Orientation getOrientation() {
        return orientation;
    }
}
