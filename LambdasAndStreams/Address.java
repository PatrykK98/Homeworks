package Exercise;

public class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }
}
