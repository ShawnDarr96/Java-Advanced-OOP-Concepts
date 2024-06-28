/*******************************************************************
* Name: Shawn Darr
* Date: 2023-05-06
* Assignment: CIS319 Final Project
*
* Door class 
*/
public class Door {
    private int width;
    private String color;

    public Door(int width, String color) {
        this.width = width;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Width of the door is: " + width + ", the color of the door is: " + color;
    }
}
