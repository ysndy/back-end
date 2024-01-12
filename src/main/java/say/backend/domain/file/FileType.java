package say.backend.domain.file;

public enum FileType {
    PNG("image/png"),
    JPEG("image/jpeg"),
    JPG("image/jpg");

    private String fileType;

    FileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileType() {
        return this.fileType;
    }
}
