package KI.Tymkiv.Lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
/**
 * The RowingBoat class models a rowing boat with an owner, a
 list of supplies,
 * and a location. It also logs each action performed using a
 PrintWriter to
 * a log file.
 *
 * This class supports adding/removing supplies, moving the
 boat,
 * and various utility methods for managing the boat and its
 contents.
 */
public class RowingBoat implements AutoCloseable {
    private Person owner;
    private List<Supply> supplies;
    private Location location;
    private PrintWriter fout = new PrintWriter(new File("Log.txt"));

    /**
     * Constructs a new RowingBoat with an owner, list of
     * supplies, and location.
     *
     * @param owner    The owner of the boat.
     * @param supplies The supplies on the boat.
     * @param location The initial location of the boat.
     * @throws FileNotFoundException If the log file cannot be
     *                               created or opened.
     */
    public RowingBoat(Person owner, List<Supply> supplies, Location location) throws FileNotFoundException {
        this.owner = owner;
        this.supplies = supplies;
        this.location = location;
    }

    /**
     * Adds a supply to the boat and logs the action.
     *
     * @param supply The supply to be added.
     */
    public void addSupply(Supply supply) {
        supplies.add(supply);
        fout.println("Added supply: " + supply.getName() + " (Quantity: " + supply.getQuantity() + ")");
        fout.flush();
    }

    /**
     * Removes a supply from the boat by its name and logs the
     * action.
     *
     * @param supplyName The name of the supply to be removed.
     */
    public void removeSupply(String supplyName) {
        supplies.removeIf(supply ->
                supply.getName().equals(supplyName));
        fout.println("Removed supply: " + supplyName);
        fout.flush();
    }

    /**
     * Moves the boat to a new location and logs the move.
     *
     * @param newLocation The new location to move the boat to.
     */
    public void moveToNewLocation(Location newLocation) {
        fout.println("Moving boat from " + location.getCity() + " to " + newLocation.getCity());
        this.location = newLocation;
        fout.println("Boat moved to new location: " + newLocation.getCountry() + ", " + newLocation.getCity() + ", " + newLocation.getStreet());
        fout.flush();
    }

    /**
     * Gets the total number of supplies on the boat and logs
     * the result.
     *
     * @return The total number of supplies on the boat.
     */
    public int getTotalSupplies() {
        int total = supplies.size();
        fout.println("Total supplies on board: " + total);
        fout.flush();
        return total;
    }

    /**
     * Gets the owner's name and logs the action.
     *
     * @return The name of the owner.
     */
    public String getOwnerName() {
        fout.println("Getting owner's name: " +
                owner.getName());
        fout.flush();
        return owner.getName();
    }

    /**
     * Changes the owner of the boat and logs the change.
     *
     * @param newOwner The new owner of the boat.
     */
    public void changeOwner(Person newOwner) {
        fout.println("Changing boat owner from " + owner.getName() + " to " + newOwner.getName());
        this.owner = newOwner;
        fout.println("Owner changed successfully.");
        fout.flush();
    }

    /**
     * Gets the current location of the boat and logs the
     * action.
     *
     * @return The current location of the boat.
     */
    public Location getCurrentLocation() {
        fout.println("Current location: " + location.getCountry() + ", " + location.getCity() + ", " + location.getStreet());
        fout.flush();
        return location;
    }

    /**
     * Checks if a supply exists on the boat by its name and
     * logs the result.
     *
     * @param supplyName The name of the supply to check.
     * @return true if the supply exists, false otherwise.
     */
    public boolean hasSupply(String supplyName) {
        boolean exists = supplies.stream().anyMatch(supply -> supply.getName().equals(supplyName));
        fout.println("Checking if supply '" + supplyName + "' exists: " + (exists ? "Yes" : "No"));
        fout.flush();
        return exists;
    }

    /**
     * Counts the total quantity of all supplies on the boat and
     * logs the result.
     *
     * @return The total quantity of all supplies on the boat.
     */
    public int getTotalSupplyQuantity() {
        int totalQuantity = supplies.stream().mapToInt(Supply::getQuantity).sum();
        fout.println("Total quantity of all supplies: " + totalQuantity);
        fout.flush();
        return totalQuantity;
    }

    /**
     * Prints a summary of the boat, including the owner,
     * location, and supplies,
     * and logs the summary.
     */
    public void printBoatSummary() {
        fout.println("Boat Summary: ");
        fout.println("Owner: " + owner.getName() + ", Age: " + owner.getAge());
        fout.println("Location: " + location.getCountry() + ", " + location.getCity() + ", " + location.getStreet());
        fout.println("Supplies:");
        for (Supply supply : supplies) {
            fout.println(supply.getName() + " (Quantity: " + supply.getQuantity() + ")");
        }
        fout.flush();
    }

    /**
     * Closes the PrintWriter used for logging.
     *
     * @throws Exception if an I/O error occurs.
     */
    @Override
    public void close() throws Exception {
        fout.close();
    }

    @Override
    public String toString() {
        return "RowingBoat{" +
                "owner=" + owner +
                ", staff=" + supplies +
                ", location=" + location +
                ", fout=" + fout + '}';
    }
}