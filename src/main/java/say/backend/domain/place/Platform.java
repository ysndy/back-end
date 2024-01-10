package say.backend.domain.place;

public enum Platform {
    GOOGLE("GOOGLE"),
    NAVER("NAVER"),
    KAKAO("KAKAO");

    private String platform;

    Platform(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return this.platform;
    }
}
