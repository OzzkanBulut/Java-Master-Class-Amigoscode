public class Person {
    private String firstName;
    private String lastName;
    private String eMail;
    private String phoneNumber;
    private House house;
    private Car car;
    private Address address;

    public Person() {
    }

    public Person(String firstName, String lastName, String eMail, String phoneNumber, House house, Car car, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.house = house;
        this.car = car;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }


    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", \nlastName='" + lastName + '\'' +
                ", \neMail='" + eMail + '\'' +
                ", \nphoneNumber='" + phoneNumber + '\'' +
                ", \nhouse=" + house +
                ", \ncar=" + car +
                ", \naddress=" + address +
                '}';
    }
}
