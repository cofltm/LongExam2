public class IncomingPhoneCall extends PhoneCall {
    private static final double rate = 0.02;

    public IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        setPrice(rate);
    }

    @Override
    public String getPhoneNumber() {
        return super.phoneNumber;
    }

    @Override
    public double getPrice() {
        return super.price;
    }

    @Override
    public void displayInformation() {
        System.out.println("Incoming Call Information:");
        System.out.println("Phone number: " + getPhoneNumber());
        System.out.println("Rate: " + rate);
        System.out.println("Price: " + getPrice());
    }
}
