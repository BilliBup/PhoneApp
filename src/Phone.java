public interface Phone {
    void powerOn();
    Boolean isRinging();
    Boolean answerCall();
    void callNumber(String phoneNumber);
    void receiveCall(String phoneNumber);
}
