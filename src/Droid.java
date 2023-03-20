public class Droid {
    String name;
    int batteryLevel;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }
    public static void main(String[] args) {
        Droid codeyDroid = new Droid("Codey");
        System.out.println(codeyDroid);
    }

    public String toString() {
        return "Hello, I am the droid: " + name;
    }
}
