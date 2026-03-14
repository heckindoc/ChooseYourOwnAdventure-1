package part1;

import persistentOptions.movement;

public class buildingEntrance {
    public static void entrance(){
        System.out.println("""
                You find yourself standing in the pouring rain in front of a great mansion.
                You have no memory of how you got here or why you are here.
                You are cold and wet.
                
                In front of you is a large wooden door.
                To your right is a well worn path through the bushes.
                To you left is a gravel trail.
                """);

        movement.movementOptions();
    }
}
