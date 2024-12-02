from Person import Person
from Location import Location
from Supply import Supply
from MotorBoat import MotorBoat

if __name__ == "__main__":
    # Create owner and initial supplies
    owner = Person("John Doe", 45)
    supplies = [
        Supply(10, "Water Bottles"),
        Supply(5, "Food Packs")
    ]
    start_location = Location("USA", "New York", "Hudson River")

    # Create a motor boat
    boat = MotorBoat(owner, supplies, start_location)

    # 1. Add a new supply
    boat.add_supply(Supply(15, "Life Jackets"))

    # 2. Remove a supply
    boat.remove_supply("Food Packs")

    # 3. Move the boat to a new location
    new_location = Location("Canada", "Toronto", "Lake Ontario")
    boat.move_to_new_location(new_location)

    # 4. Get total supplies on the boat
    total_supplies = boat.get_total_supplies()
    print(f"Total supplies: {total_supplies}")

    # 5. Get owner's name
    owner_name = boat.get_owner_name()
    print(f"Boat owner: {owner_name}")

    # 6. Change the owner of the boat
    new_owner = Person("Jane Smith", 30)
    boat.change_owner(new_owner)

    # 7. Get current location of the boat
    current_location = boat.get_current_location()
    print(f"Current location: {current_location.city}")

    # 8. Check if a specific supply exists
    has_water = boat.has_supply("Water Bottles")
    print(f"Has water bottles: {has_water}")

    # 9. Get the total quantity of all supplies
    total_quantity = boat.get_total_supply_quantity()
    print(f"Total supply quantity: {total_quantity}")

    # 10. Print a summary of the boat
    boat.print_boat_summary()