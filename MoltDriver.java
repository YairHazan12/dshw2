public class MoltDriver implements Comparable<MoltDriver> {

    private int id;
    private String name;
    private int nextAvailableTimeForDelivery;
    private int totalOrdersDelivered;

    public MoltDriver(int id, String name, int nextAvailableTimeForDelivery) {
        this.id = id;
        this.name = name;
        this.nextAvailableTimeForDelivery = nextAvailableTimeForDelivery;
        this.totalOrdersDelivered = 0;
    }

    public void incrementTotalOrdersDelivered() {
        totalOrdersDelivered++;
    }

    public int getNextAvailableTimeForDelivery() {
        return nextAvailableTimeForDelivery;
    }

    public void setNextAvailableTimeForDelivery(int time) {
        this.nextAvailableTimeForDelivery = time;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MoltDriver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nextAvailableTimeForDelivery=" + nextAvailableTimeForDelivery +
                ", totalOrdersDelivered=" + totalOrdersDelivered +
                '}';
    }

    @Override
    public int compareTo(MoltDriver otherDriver) {
        // Compare drivers based on their next available time for delivery
        return Integer.compare(this.nextAvailableTimeForDelivery, otherDriver.nextAvailableTimeForDelivery);
    }
}
