public class Droid {
    // class which creates a droid with instance variable of name and batteryLevel
    String name;
    int batteryLevel;

    public Droid(String droidName) {
        // constructor requires a droid name and energy level is set at 100 by default
        name = droidName;
        batteryLevel = 100;
    }

    public void performTask(String task) {
        /** method for droid to perform task (takes a string parameter
         * and subtracts 10 from instance battery level */
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    public void energyReport() {
        /** Method to report batteryLevel of the instance of the droid */
        System.out.println(name + "'s battery level is at: " + batteryLevel);
    }

    public void energyTransfer(Droid otherDroid) {
        /** transfers energy between current instance of Droid with another instance of droid */
        int thisDroidLevel = batteryLevel;
        batteryLevel = otherDroid.batteryLevel;
        otherDroid.batteryLevel = thisDroidLevel;
    }

    public static void main(String[] args) {
        Droid codeyDroid = new Droid("Codey");
        System.out.println(codeyDroid);
        codeyDroid.performTask("Kill all humans");
        codeyDroid.energyReport();

        Droid daveDroid = new Droid("Dave");
        daveDroid.energyReport();
        codeyDroid.energyTransfer(daveDroid);
        codeyDroid.energyReport();
        daveDroid.energyReport();

    }

    public String toString() {
        return "Hello, I am the droid: " + name;
    }
}
