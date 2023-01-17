public class LandLine implements Phone{
    private String myPhoneNum;
    private Boolean isRinging;
    private Boolean isPowerON;

    public LandLine(String myPhoneNum) {
        this.myPhoneNum = myPhoneNum;
        isRinging = false;
        isPowerON = true;
    }

    public void setMyPhoneNum(String myPhoneNum) {
        this.myPhoneNum = myPhoneNum;
    }

    public void setRinging(Boolean ringing) {
        isRinging = ringing;
    }

    public void setPowerON(Boolean powerON) {
        isPowerON = powerON;
    }

    @Override
    public void powerOn() {
       this.isPowerON = true;
    }

    @Override
    public Boolean isRinging() {
        return isRinging;
    }

    @Override
    public Boolean answerCall() {
        if(isRinging==true ){
            System.out.println("Call Answered");
            this.isRinging=false;
            return true;
        }
       return false;
    }

    @Override
    public void callNumber(String phoneNumber) {
        if(isPowerON==true){
            System.out.println("Dialing  "+ phoneNumber);
        }
        else{
            System.out.println("The number you are dialing is currently switched off");
        }
        return;
    }

    @Override
    public void receiveCall(String phoneNumber) {
       if(isPowerON==true && myPhoneNum.equals(phoneNumber)){
           this.isRinging = true;
           System.out.println("God Calling");
       }
       else{
           System.out.println("Currently Switched off");
       }
    }
}
