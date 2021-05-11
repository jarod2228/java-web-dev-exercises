package exercises.technology;

public class Program {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop(800, 8, true, 100);
        SmartPhone myPhone = new SmartPhone(238, 4, true, 0);

        myPhone.takeSelfie();
        System.out.println(myLaptop.needsToPlugIn());
        System.out.println(myPhone.getNumberOfSelfies());

        myPhone.takeSelfie();
        System.out.println(myPhone.getNumberOfSelfies());
    }

}
