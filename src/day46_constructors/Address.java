package day46_constructors;

public class Address {

    String street;
    String city;
    String state;
    String zipcode;
    String country;

    public Address(String street, String city, String state, String zipcode){

        this.street=street;
        this.city=city;
        this.state=state;
        this.zipcode= zipcode;
        country="US";

    }

    @Override
    public String toString() {
        return "Address\n" +
                "street: " + street + '\'' +
                ", city: " + city + '\'' +
                ", state: " + state + '\'' +
                ", zipcode: " + zipcode + '\'' +
                ", country: " + country + '\'' ;
    }


    public static void main(String[] args) {

        Address address= new Address("100023 Oak Dr","Chicago"," IL","4901001");
        System.out.println(address);
        System.out.println(address.street);


    }



}
