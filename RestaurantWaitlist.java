import java.util.*;

class RestaurantWaitlist {
    public static void main(String[] args) {
        LinkedList<String> waitlist = new LinkedList<>();

        waitlist.add("Rahul");
        waitlist.add("Priya");
        waitlist.add("Aditi");

        System.out.println("Waitlist: " + waitlist);

        waitlist.addFirst("VIP Customer");

        System.out.println("Updated Waitlist: " + waitlist);
    }
}
