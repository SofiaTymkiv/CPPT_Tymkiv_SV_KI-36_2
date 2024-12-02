package KI.Tymkiv.Lab2;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Create owner and initial supplies
        Person owner = new Person("John Doe", 45);
        List<Supply> supplies = new ArrayList<>();
        supplies.add(new Supply(10, "Water Bottles"));
        supplies.add(new Supply(5, "Food Packs"));
        Location startLocation = new Location("USA", "New York",
                "Hudson River");
        try (RowingBoat boat = new RowingBoat(owner, supplies,
                startLocation)) {
            // 1. Add a new supply
            boat.addSupply(new Supply(15, "Life Jackets"));
            // 2. Remove a supply
            boat.removeSupply("Food Packs");
            // 3. Move the boat to a new location
            Location newLocation = new Location("Canada",
                    "Toronto", "Lake Ontario");
            boat.moveToNewLocation(newLocation);
            // 4. Get total supplies on the boat
            int totalSupplies = boat.getTotalSupplies();
            System.out.println("Total supplies: " +
                    totalSupplies);
            // 5. Get owner's name
            String ownerName = boat.getOwnerName();
            System.out.println("Boat owner: " + ownerName);
            // 6. Change the owner of the boat
            Person newOwner = new Person("Jane Smith", 30);
            boat.changeOwner(newOwner);
            // 7. Get current location of the boat
            Location currentLocation =
                    boat.getCurrentLocation();
            System.out.println("Current location: " +
                    currentLocation.getCity());
            // 8. Check if a specific supply exists
            boolean hasWater = boat.hasSupply("Water Bottles");
            System.out.println("Has water bottles: " +
                    hasWater);
            // 9. Get the total quantity of all supplies
            int totalQuantity = boat.getTotalSupplyQuantity();
            System.out.println("Total supply quantity: " +
                    totalQuantity);
            // 10. Print a summary of the boat
            boat.printBoatSummary();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}