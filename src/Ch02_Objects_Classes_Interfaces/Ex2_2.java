package Ch02_Objects_Classes_Interfaces;

/**
 * Created by Ross on 02.09.2017.
 */
public class Ex2_2 {
    int houseNumber;
    String street;
    int apartmentNumber;
    String city;
    String state;
    String zipCode;

    Ex2_2(int houseNumber,
          String street,
          String city,
          String state,
          String zipCode) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    Ex2_2(int houseNumber,
          String street,
          int apartmentNumber,
          String city,
          String state,
          String zipCode) {
        this(houseNumber, street, city, state, zipCode);
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public String toString() {
        return "Street: " + street + " City: " + city + " State: " + state + " Postal Code: " + zipCode;
    }
}