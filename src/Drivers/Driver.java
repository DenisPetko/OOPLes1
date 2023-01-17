package Drivers;


import jdk.jfr.Category;

import java.util.Locale;

public class Driver{

    private String fullName;
    private boolean haveDriveLicence;
    private int drivingExperience;

    public Driver(String fullName, boolean haveDriveLicence, int drivingExperience) {
        this.fullName = fullName;
        this.haveDriveLicence = haveDriveLicence;
        this.drivingExperience = drivingExperience;
    }

    public void startMove() {
        System.out.println(getFullName() + " - поехали");
    }

    public void stopMove() {
        System.out.println(getFullName() + " - стоп");
    }

    public void refuelAuto() {
        System.out.println(getFullName() + " - заправить авто");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            this.fullName = "нет информаии";
        } else {
            this.fullName = fullName;
        }
    }

    public boolean isHaveDriveLicence() {
        return haveDriveLicence;
    }

    public void setHaveDriveLicence(boolean haveDriveLicence) {
        this.haveDriveLicence = haveDriveLicence;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        if (drivingExperience < 0) {
            this.drivingExperience = 0;
        } else {
            this.drivingExperience = drivingExperience;
        }
    }
}
