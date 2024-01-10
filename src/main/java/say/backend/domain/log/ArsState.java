package say.backend.domain.log;

public enum ArsState {
    SUCCESS("SUCCESS"),
    FAIL("FAIL");

    private String arsState;

    ArsState(String arsState) {
        this.arsState = arsState;
    }

    public String getArsState() {
        return this.arsState;
    }
}
