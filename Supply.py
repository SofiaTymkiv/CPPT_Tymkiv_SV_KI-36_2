class Supply:
    def __init__(self, quantity, name):
        self.quantity = quantity
        self.name = name

    def __str__(self):
        return f"{self.name} (Quantity: {self.quantity})"