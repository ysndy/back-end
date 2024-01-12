package say.backend.domain.common;

public enum DelYn {
    Y("Y"),
    N("N");

    private String delYn;

    DelYn(String delYn) {
        this.delYn = delYn;
    }

    public String getDelYn() {
        return this.delYn;
    }
}
