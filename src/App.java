/*******************************************************************
* Name: Shawn Darr
* Date: 2023-05-06
* Assignment: CIS319 Final Project
*
* Main application class 
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Shawn Darr - Week 5 Final Practical Exam");

        try {
            FileWriter logFile = new FileWriter("shawndarr_log.txt");
            logFile.write("Starting of application\n");
            logFile.write("Building the ArrayList created and filled\n");
            logFile.write("Recursive print completed\n");
            logFile.write("Iterative print completed\n");
            logFile.write("Program has been terminated\n");
            logFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Building> buildings = new ArrayList<>();

    House house1 = new House(3, new Door(80, "Red"), new Kitchen("Modern", "Samsung"));
    House house2 = new House(4, new Door(90, "Blue"), new Kitchen("Contemporary", "GE"));
    House house3 = new House(5, new Door(100, "Green"), new Kitchen("Country", "Kenmore"));
    House house4 = new House(6, new Door(110, "Yellow"), new Kitchen("Chef's", "Whirlpool"));
    House house5 = new House(7, new Door(120, "Purple"), new Kitchen("Modern", "LG"));

    buildings.add(house1);
    buildings.add(house2);
    buildings.add(house3);
    buildings.add(house4);
    buildings.add(house5);

    System.out.println("Printing buildings iteratively:");
    for (Building building : buildings) {
        System.out.println(building.toString());
    }

    System.out.println("\nPrinting buildings recursively:");
    printBuildingsRecursive(buildings, 0);

    System.out.println("\nContents of the log file:");
    try {
        Scanner logReader = new Scanner(new File("shawndarr_log.txt"));
        while (logReader.hasNextLine()) {
            String line = logReader.nextLine();
            System.out.println(line);
        }
        logReader.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}

private static void printBuildingsRecursive(ArrayList<Building> buildings, int index) {
    if (index >= buildings.size()) {
        return;
    }
    System.out.println(buildings.get(index).toString());
    printBuildingsRecursive(buildings, index + 1);
}
}