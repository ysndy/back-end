package say.backend.domain.report;

public enum ReportState {
    REPORT_STANDBY("REPORT_STANDBY"),
    REPORT_COMPLETE("REPORT_COMPLETE"),
    REPAIR("REPAIR"),
    REPAIR_COMPLETE("REPAIR_COMPLETE");

    private String reportState;

    ReportState(String reportState) {
        this.reportState = reportState;
    }

    public String getReportState() {
        return this.reportState;
    }
}
