public class Contact extends Address {
    String phoneNumber;
    String gmail;

    public Contact(String city, String state, String country,String phoneNumber , String gmail) {
        super(city, state, country);
        this.phoneNumber  = phoneNumber;
        this.gmail = gmail;
    }


    void showInfo(){
        System.out.println("Ph no:" + phoneNumber);
        System.out.println("Gmail:" + gmail);
        System.out.println("city:" + city);
        System.out.println("state:" + state);
    }
}
