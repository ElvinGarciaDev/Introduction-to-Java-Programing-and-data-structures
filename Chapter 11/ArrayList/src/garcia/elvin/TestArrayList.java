package garcia.elvin;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {
	// write your code here
        // Create a list to store cities
        ArrayList<String> cityList = new ArrayList<>();

        // Add some cities in the list
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");

        System.out.println("List size? " + cityList.size());
    }
}
