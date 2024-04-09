public class MoltOrder implements Comparable<MoltOrder> {

    private String name;
    private String orderDescription;
    private int orderReadyTime;
    private int timeNeededToDeliver;
    private int priority;

    public MoltOrder(String name, String orderDescription, int orderReadyTime, int timeNeededToDeliver, int priority) {
        this.name = name;
        this.orderDescription = orderDescription;
        this.orderReadyTime = orderReadyTime;
        this.timeNeededToDeliver = timeNeededToDeliver;
        this.priority = priority;
    }

    public String toString() {
        return "MoltOrder{" +
                "name='" + name + '\'' +
                ", orderDescription='" + orderDescription + '\'' +
                ", orderReadyTime=" + orderReadyTime +
                ", timeNeededToDeliver=" + timeNeededToDeliver +
                ", priority=" + priority +
                '}';
    }

    public int getOrderReadyTime() {
        return orderReadyTime;
    }

    public int getTimeNeededToDeliver() {
        return timeNeededToDeliver;
    }

    public String getName() {
        return name;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    @Override
    public int compareTo(MoltOrder otherOrder) {
        // Compare orders based on their priority
        return Integer.compare(this.priority, otherOrder.priority);
    }
}
