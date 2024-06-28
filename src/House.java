/*******************************************************************
* Name: Shawn Darr
* Date: 2023-05-04
* Assignment: CIS319 Final Project
*
* House class 
*/
public class House extends Building {
    private int numRooms;
    private Door frontDoor;
    private Kitchen mainKitchen;

    public House(int numRooms, Door frontDoor, Kitchen mainKitchen) {
        super("House");
        this.numRooms = numRooms;
        this.frontDoor = frontDoor;
        this.mainKitchen = mainKitchen;
    }

    public int getRooms() {
        return numRooms;
    }

    @Override
    public String toString() {
        return super.toString() + ", the number of rooms it has is: " + numRooms + "\n" +
                "Front Door: " + frontDoor.toString() + "\n" +
                "Main Kitchen " + mainKitchen.toString();
    }
}
