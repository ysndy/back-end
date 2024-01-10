package say.backend.domain.file;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import say.backend.domain.file.pk.PlaceFilePK;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@Getter @Setter @Entity
@Table(name = "place_file")
public class PlaceFile {
    @EmbeddedId
    private PlaceFilePK placeFilePK;
}
