public class Droid {
    String name;
    int batteryLevel;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }
    public static void main(String[] args) {
        Droid codeyDroid = new Droid("Codey");
        System.out.println(codeyDroid);
        codeyDroid.performTask("Kill all humans");
    }

    public String toString() {
        return "Hello, I am the droid: " + name;
    }
}
