/*******************************************************************
* Name: Shawn Darr
* Date: 2023-05-04
* Assignment: CIS319 Final Project
*
* Kitchen class 
*/
public class Kitchen {
    private String style;
    private String applianceBrand;

    public Kitchen(String style, String applianceBrand) {
        this.style = style;
        this.applianceBrand = applianceBrand;
    }

    @Override
    public String toString() {
        return "style is " + style + ",and the main Appliance Brand inside is " + applianceBrand +".";
    }
}

