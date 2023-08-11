//https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15/train/java

import java.util.Arrays;

public class wolfInSheepClothing {
    public static void main(String[] args) {
        String[] string = {"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"};
        warnTheSheep(string);
    }

    public static String warnTheSheep(String[] array) {
int wolfIndex = Arrays.asList(array).indexOf("wolf");
int sheepNumber= array.length-wolfIndex-1;
if (wolfIndex == (array.length-1)){
    System.out.println("Pls go away and stop eating my sheep");
    return "Pls go away and stop eating my sheep";
}else {
    System.out.println("Oi! Sheep number " + sheepNumber + " ! You are about to be eaten by a wolf!");
    return "Oi! Sheep number " + sheepNumber + "! You are about to be eaten by a wolf!";
}
    }
}
