package say.backend.domain.log;

public enum SmsState {
    SUCCESS("SUCCESS"),
    FAIL("FAIL");

    private String smsState;

    SmsState(String smsState) {
        this.smsState = smsState;
    }

    public String getSmsState() {
        return this.smsState;
    }
}
