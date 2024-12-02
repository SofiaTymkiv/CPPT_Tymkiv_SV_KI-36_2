class RowingBoat:
    def __init__(self, owner, supplies, location):
        self.owner = owner
        self.supplies = supplies
        self.location = location

    def add_supply(self, supply):
        self.supplies.append(supply)

    def remove_supply(self, supply_name):
        self.supplies = [s for s in self.supplies if s.name != supply_name]

    def move_to_new_location(self, new_location):
        self.location = new_location

    def get_total_supplies(self):
        return len(self.supplies)

    def get_owner_name(self):
        return self.owner.name

    def change_owner(self, new_owner):
        self.owner = new_owner

    def get_current_location(self):
        return self.location

    def has_supply(self, supply_name):
        return any(s.name == supply_name for s in self.supplies)

    def get_total_supply_quantity(self):
        return sum(s.quantity for s in self.supplies)

    def print_boat_summary(self):
        print(f"Boat Summary:")
        print(f"Owner: {self.owner}")
        print(f"Location: {self.location}")
        print("Supplies:")
        for supply in self.supplies:
            print(f"  {supply}")