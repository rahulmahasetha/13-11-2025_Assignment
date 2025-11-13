import java.util.ArrayList;
public class MenuList {
   public static void main(String[] args) {
        ArrayList<String> menu = new ArrayList<>();

        menu.add("Pizza");
        menu.add("Burger");
        menu.add("Pasta");
        menu.add("Dosa");
        menu.add("Momos");

        System.out.println("Restaurant Menu:");
        for (String item : menu) {
            System.out.println(item);
        }
    } 
}
/*output
 Restaurant Menu:
Pizza
Burger
Restaurant Menu:
Pizza
Burger
Pizza
Burger
Pasta
Pasta
Dosa
Momos
 */