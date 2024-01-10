package say.backend.domain.report;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import say.backend.domain.common.DelYn;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@Getter @Setter @Entity
@Table(name = "report_info")
public class ReportInfo {
    @Column(name="report_idx")
    @Id
    private String reportIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="place_idx")
    private String placeIdx;

    @Column(name="content")
    private String content;

    @Column(name="report_state")
    private ReportState reportState;

    @Column(name="reg_dt")
    private LocalDateTime regDt;

    @Column(name="mod_dt")
    private LocalDateTime modDt;

    @ColumnDefault("'N'")
    @Column(name="del_yn")
    private DelYn delYn;
}
