package KI.Tymkiv.Lab2;

public class Location {
    private String country;
    private String city;
    private String street;
    public Location(String country, String city, String street)
    {
        this.country = country;
        this.city = city;
        this.street = street;
    }
    public static Location unknown() {
        return new Location("unknown", "unknown", "unknown");
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
}