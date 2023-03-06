public class PhoneCallArray {
    public static void main(String[] args) {
        PhoneCall[] phoneCalls = new PhoneCall[10];

        phoneCalls[0] = new IncomingPhoneCall("09654125478");
        phoneCalls[1] = new OutgoingPhoneCall("09546321785", 5);
        phoneCalls[2] = new IncomingPhoneCall("09632558664");
        phoneCalls[3] = new OutgoingPhoneCall("09664752111", 8);
        phoneCalls[4] = new IncomingPhoneCall("09577488831");
        phoneCalls[5] = new OutgoingPhoneCall("09011563249", 3);
        phoneCalls[6] = new IncomingPhoneCall("09641277535");
        phoneCalls[7] = new OutgoingPhoneCall("09995412375", 12);
        phoneCalls[8] = new IncomingPhoneCall("09541237861");
        phoneCalls[9] = new OutgoingPhoneCall("09822525631", 6);

        for (int i = 0; i < phoneCalls.length; i++) {
            phoneCalls[i].displayInformation();
            System.out.println();
        }
    }
}
