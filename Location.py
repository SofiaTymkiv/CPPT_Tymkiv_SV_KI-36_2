class Location:
    def __init__(self, country, city, street):
        self.country = country
        self.city = city
        self.street = street

    def unknown():
        return Location("unknown", "unknown", "unknown")

    def __str__(self):
        return f"{self.country}, {self.city}, {self.street}"