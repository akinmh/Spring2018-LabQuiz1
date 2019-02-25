/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursescheduler;

/**
 *
 * @author akin
 */
public class Instructor {
    private String firstName;
    private String lastName;
    private String officeBuilding;
    private int roomNumber;
    
    public Instructor() {
        firstName = "Albert";
        lastName = "Einstein";
        officeBuilding = "McNair";
        roomNumber = 420;
    }
    
    public Instructor(String firstName, String lastName, String officeBuilding, int roomNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeBuilding = officeBuilding;
        this.roomNumber = roomNumber;
    }
    
    public String toString() {
        return getFirstName() + " * " + getLastName() + " * " + getOfficeBuilding() + " * " + getRoomNumber();
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the officeBuilding
     */
    public String getOfficeBuilding() {
        return officeBuilding;
    }

    /**
     * @param officeBuilding the officeBuilding to set
     */
    public void setOfficeBuilding(String officeBuilding) {
        this.officeBuilding = officeBuilding;
    }

    /**
     * @return the roomNumber
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * @param roomNumber the roomNumber to set
     */
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
