package zadania.pierwszyTydzien;

public class Address {
    String city;
    String street;
    String numberOfBuilding;

    public Address(String city, String street, String numberOfBuilding) {
        this.city = city;
        this.street = street;
        this.numberOfBuilding = numberOfBuilding;
    }

    public String getCity() {
        return city;
    }
}
