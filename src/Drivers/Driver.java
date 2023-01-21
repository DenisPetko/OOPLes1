package Drivers;

public class Driver {

    private String fullName;
    private boolean haveDriveLicence;
    private int drivingExperience;
    private String category;

    public Driver(String fullName, boolean haveDriveLicence, int drivingExperience, String category) {
        this.fullName = fullName;
        this.haveDriveLicence = haveDriveLicence;
        this.drivingExperience = drivingExperience;
        try {
            setCategory(category);
        } catch (CheckCategory e) {
            System.out.println(e.getMessage());
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) throws CheckCategory{
        if (category.equals("B") || category.equals("C") || category.equals("D")) {
            this.category = category;
        } else {
            throw new CheckCategory("Необходимо указать тип прав!");
        }
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

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", haveDriveLicence=" + haveDriveLicence +
                ", drivingExperience=" + drivingExperience +
                ", category='" + category + '\'' +
                '}';
    }
}
