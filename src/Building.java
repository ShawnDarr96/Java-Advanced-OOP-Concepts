/*******************************************************************
* Name: Shawn Darr
* Date: 2023-05-05
* Assignment: CIS319 Final Project
*
* Building class 
*/
abstract class Building {
    private String buildingType;

    protected Building(String buildingType) {
        this.buildingType = buildingType;
    }

    public abstract int getRooms();

    @Override
    public String toString() {
        return "This is a " + buildingType;
    }
}