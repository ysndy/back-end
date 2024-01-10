package say.backend.domain.place;

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
@Table(name = "place_link")
public class PlaceLink {
    @Column(name="link_idx")
    @Id
    private String linkIdx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="place_idx")
    private String placeIdx;

    @Enumerated(EnumType.STRING)
    @Column(name="platform")
    private Platform platform;

    @Column(name="link")
    private String link;

    @Column(name="reg_dt")
    private LocalDateTime regDt;

    @Column(name="mod_dt")
    private LocalDateTime modDt;

    @ColumnDefault("'N'")
    @Column(name="del_yn")
    private DelYn delYn;
}
