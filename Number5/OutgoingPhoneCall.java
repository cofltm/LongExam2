public class OutgoingPhoneCall extends PhoneCall {
    private static final double ratePerMinute = 4.00;
    private int minutes;

    public OutgoingPhoneCall(String phoneNumber, int minutes) {
        super(phoneNumber);
        this.minutes = minutes;
        setPrice(ratePerMinute * minutes);
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
        System.out.println("Outgoing Call Information:");
        System.out.println("Phone number: " + getPhoneNumber());
        System.out.println("Rate per minute: " + ratePerMinute);
        System.out.println("Number of minutes: " + minutes);
        System.out.println("Total price: " + getPrice());
