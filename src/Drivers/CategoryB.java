package Drivers;

public class CategoryB extends Driver{

    private static final String category = "B";

    public CategoryB(String fullName, boolean haveDriveLicence, int drivingExperience) {
        super(fullName, haveDriveLicence, drivingExperience, category);
    }

}
