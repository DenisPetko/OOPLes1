package Drivers;


public class CategoryC extends Driver {

    private static final String category = "C";

    public CategoryC(String fullName, boolean haveDriveLicence, int drivingExperience) {
        super(fullName, haveDriveLicence, drivingExperience, category);
    }
}
