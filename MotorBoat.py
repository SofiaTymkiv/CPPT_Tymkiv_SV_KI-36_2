from RowingBoat import RowingBoat

class MotorBoat(RowingBoat):
    def __init__(self, owner, supplies, location):
        super().__init__(owner, supplies, location)

    def print_boat_summary(self):
        print("Just a cool motor boat, hell yeah!!")