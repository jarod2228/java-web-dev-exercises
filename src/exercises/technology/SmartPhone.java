package exercises.technology;

public class SmartPhone extends Computer{
    private int numberOfSelfies;

    public SmartPhone(int storage, int ram, boolean hasScreen, int numberOfSelfies) {
        super(storage, ram, hasScreen);
        this.numberOfSelfies = numberOfSelfies;
    }

    public void takeSelfie() {
        this.numberOfSelfies = numberOfSelfies;
    }


    public int getNumberOfSelfies() {
        return this.numberOfSelfies;
    }
}
