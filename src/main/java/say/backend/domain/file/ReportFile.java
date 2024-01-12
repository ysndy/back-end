package say.backend.domain.file;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import say.backend.domain.report.ReportInfo;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@Getter @Setter @Entity
@Table(name = "report_file")
public class ReportFile {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="report_idx")
    @Id
    private ReportInfo reportIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="file_idx")
    @Id
    private FileInfo fileIdx;

}
