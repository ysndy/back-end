package say.backend.domain.file.pk;

import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ReportFilePK implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="report_idx", nullable = false)
    private String reportIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="file_idx", nullable = false)
    private String file_dix;
}
