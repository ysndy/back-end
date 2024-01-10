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
public class PlaceFilePK implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="place_idx", nullable = false)
    private String placeIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="file_idx", nullable = false)
    private String file_dix;
}
