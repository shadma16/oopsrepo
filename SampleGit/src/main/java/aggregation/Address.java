package aggregation; // first class

public class Address {
    String city;
    String state;

    Address(String c, String s) {
        city = c;
        state = s;
    }

    void showAddress() {
        System.out.println( city + ", " + state);
    }
}
