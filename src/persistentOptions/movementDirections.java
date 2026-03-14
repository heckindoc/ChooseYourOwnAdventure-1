package persistentOptions;

public enum movementDirections {
    FORWARD("forward"),
    LEFT("left"),
    RIGHT("right"),
    BACKWARD("backward");

    private final String direction;

    movementDirections (String direction){
        this.direction = direction;
    }
}
