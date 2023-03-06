public class PhoneCallArray {
    public static void main(String[] args) {
        PhoneCall[] calls = new PhoneCall[10];

        for (int i = 0; i < 5; i++) {
            IncomingPhoneCall incomingCall = new IncomingPhoneCall("09693163875");
            incomingCall.setPrice(0.02 * (i + 1));
            calls[i] = incomingCall;
        }

        for (int i = 0; i < 5; i++) {
            OutgoingPhoneCall outgoingCall = new OutgoingPhoneCall("09993340309", (i + 1) * 5); 
            calls[i + 5] = outgoingCall;
        }

        for (PhoneCall call : calls) {
            call.displayInformation();
            System.out.println(); 
        }
    }
}
