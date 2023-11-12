public class Main {
    public static void main(String[] args) {
        Device device1 = new Device("Samsung", 120.0f, "AB1234567CD");
        Device device2 = new Device("Samsung", 120.0f, "AB1234567CD");

        Monitor monitor1 = new Monitor("Samsung", 120.0f, "AB1234567CD", 1280, 1024);
        Monitor monitor2 = new Monitor("Samsung", 120.0f, "AB1234567CD", 1280, 1024);

        System.out.println("Device1 equals Device2: " + device1.equals(device2));
        System.out.println("Monitor1 equals Monitor2: " + monitor1.equals(monitor2));

        System.out.println("Device1 hashCode: " + device1.hashCode());
        System.out.println("Monitor1 hashCode: " + monitor1.hashCode());
    }
}
