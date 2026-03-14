package persistentOptions;

import java.util.Scanner;

public class movement {

    static Scanner scanner = new Scanner(System.in);

    String forward = "forward";
    String left = "left";
    String right = "right";
    String back = "back";

    public static void movementOptions() {

        System.out.println(""" 
                Which direction would you like to go?
                1. Forward
                2. Left
                3. Right
                4. Backward
                """);

        movementResult(movementChoice());
    }
    public static String lastMove;

    public static String movementChoice() {
        String movement;

        System.out.println("Select a movement direction: ");

        if (scanner.hasNextInt()){
            int choice = scanner.nextInt();
            movement = switch(choice){
                case 1 -> "forward";
                case 2 -> "left";
                case 3 -> "right";
                case 4 -> "back";
                default -> "again";
            };
        }
        else {
            movement = scanner.next().toLowerCase();
            if (movement == "back" ||
                    movement == "backward" ||
                    movement == "backwards") {
                movement = "back";
            }
        }
        lastMove = movement;
        return movement;
    }

    public static void movementResult (String movement) {
        switch (movement) {
            case "forward" -> {
                System.out.println("You move forward.");
            }
            case "left" -> {
                System.out.println("You move left.");
            }
            case "right" -> {
                System.out.println("You move right.");
            }
            case "back" -> {
                System.out.println("You move backwards.");
            }
            default -> {
                System.out.println("Please select again.");
                movementOptions();
            }
        }
    }

/*
    public String move(movementDirections direction){
        switch (direction){
            case FORWARD:
                System.out.println("You move forward.");
                return "forward";
                break;
            case LEFT:
                System.out.println("You move left.");
                return "left";
                break;
            case RIGHT:
                System.out.println("You move right.");
                return "right";
                break;
            case BACKWARD:
                System.out.println("You move backward.");
                return "backward";
                break;
            default:
                System.out.println("Invalid option, please select again.");
                return "retry";
                break;
        }*/
    }

