public class DemoPhoneCall {
    public static void main(String[] args) {
        IncomingPhoneCall incomingCall = new IncomingPhoneCall("09693163875");
        incomingCall.displayInformation();

        OutgoingPhoneCall outgoingCall = new OutgoingPhoneCall("09993340309", 10);
        outgoingCall.displayInformation();
    }
}
