package Drivers;


public class CategoryD extends Driver {

    private static final String category = "D";

    public CategoryD(String fullName, boolean haveDriveLicence, int drivingExperience) {
        super(fullName, haveDriveLicence, drivingExperience, category);
    }
}
