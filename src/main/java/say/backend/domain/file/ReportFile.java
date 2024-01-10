package say.backend.domain.file;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import say.backend.domain.file.pk.ReportFilePK;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@Getter @Setter @Entity
@Table(name = "report_file")
public class ReportFile {
    @EmbeddedId
    private ReportFilePK reportFilePK;
}
