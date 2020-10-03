/*
 * @Author: Weidows
 * @Date: 2020-07-08 08:31:52
 * @LastEditors: Weidows
 * @LastEditTime: 2020-07-18 16:21:41
 * @FilePath: \Weidows\Java\src\main\java\twenty\july\design_principle\castle\Room.java
 */
package twenty.july.design_principle.castle;

public class Room {
    public String description;
    public Room northExit;
    public Room southExit;
    public Room eastExit;
    public Room westExit;

    public Room(String description) {
        this.description = description;
    }

    public void setExits(Room north, Room east, Room south, Room west) {
        if (north != null)
            northExit = north;
        if (east != null)
            eastExit = east;
        if (south != null)
            southExit = south;
        if (west != null)
            westExit = west;
    }

    @Override
    public String toString() {
        return this.description;
    }
    public static void main(String[] args) {
        
    }
}
