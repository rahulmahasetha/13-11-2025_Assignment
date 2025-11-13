import java.util.*;

class CircularDeliveryStops {
    public static void main(String[] args) {
        LinkedList<String> stops = new LinkedList<>();

        stops.add("Stop A");
        stops.add("Stop B");
        stops.add("Stop C");
        stops.add("Stop D");

        System.out.println("Delivery Stops: " + stops);

        int rounds = 6; // how many stops to visit

        System.out.println("\nCircular Traversal:");
        for (int i = 0; i < rounds; i++) {
            System.out.println(stops.get(i % stops.size()));
        }
    }
}
