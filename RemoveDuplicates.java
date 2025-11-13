import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static ArrayList<String> removeDuplicates(ArrayList<String> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static void main(String[] args) {
        ArrayList<String> dishes = new ArrayList<>();
        dishes.add("Pizza");
        dishes.add("Burger");
        dishes.add("Pizza");
        dishes.add("Momos");
        dishes.add("Burger");

        System.out.println("Original list: " + dishes);
        ArrayList<String> unique = removeDuplicates(dishes);
        System.out.println("After removing duplicates: " + unique);
    }
}
