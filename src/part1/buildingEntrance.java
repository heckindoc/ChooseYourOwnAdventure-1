package part1;

import persistentOptions.movement;

import java.util.Scanner;


public class buildingEntrance {
    static String move;

    static Scanner scanner = new Scanner(System.in);

    public static  void intro(){
        System.out.println("""
                You find yourself standing in the pouring rain in front of a great mansion.
                You have no memory of how you got here or why you are here.
                You are cold and wet.

                """);
        entrance();
    }

    public static void entrance(){
        System.out.println("""
                In front of you is a large wooden door.
                To your right is a well worn path through the bushes.
                To your left is a gravel trail.
                """);

        movement.movementOptions();

        switch (move = movement.lastMove){
            case "forward" -> frontDoor();
            case "left" -> garageFront();
            case "right" -> garden();
            case "back" ->  gateLocked();
        }
    }

    public static void frontDoor(){
        int choice;

        System.out.println("""
                You walk up the damp stone steps to the front door.
                There is a gargoyle head holding a knocker in its mouth.
                
                do you:
                1. use the knocker and knock on the door
                2. attempt to open the door
                3. return to the entrance
                """);

        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("""
                            There is a resonating 'clang' as you use the knocker.
                            you wait several moments, but nothing seems to happen.
                            """);
                    frontDoor();
                }
                case 2 -> {
                    System.out.println("""
                            You attempt to open the door, however it appears to be locked.
                            """);
                    frontDoor();
                }
                case 3 -> entrance();
                default -> {
                    System.out.println("Invalid Choice");
                    frontDoor();
                }
            }
        }

    }

    public static void garageFront(){
        System.out.println("""
                You walk a short way down the gravel path.
                Before long you are standing in front an attached garage.
                
                To the left of the garage are several garbage cans
                forward is the garage door
                To the right is the house
                """);
        switch (movement.movementChoice()){
            case "forward" -> garage();
            case "left" -> {
                System.out.println("""
                        You open the closest garbage can.
                        Your senses are assaulted with a stench most foul.
                        It takes everything that you can muster, but you avoid vomiting.
                        You decide against opening the other garbage can.
                        You return to the front of the garage.
                        """);
                garageFront();
            }
            case "right" -> {
                System.out.println("""
                        There is a window that you attempt to peer through.
                        It is difficult to see inside the dark house, but is that movement?
                        
                        A chill runs down your spine.
                        
                        you return to the front of the garage.
                        """);
                garageFront();
            }
            case "back" -> entrance();
            default -> garageFront();
        }

    }

    public static void garage(){
        System.out.println("""
                        The garage door opens with a loud crash.
                        You are standing inside of a dark garage.
                        
                        In front of you is a black vintage car.
                        To your left is the wall of the garage.
                        To your right is a door.
                        """);
    }

    public static void garden(){

    }

    public static void gateLocked(){
        System.out.println("""
                You turn around and attempt to go through the gate.
                You find that it is locked and has been chained shut.
                There is a padlock holding the chain together.
                
                You have no choice but to turn around and return to where you came from.
                """);

        entrance();
    }
}
