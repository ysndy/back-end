package say.backend.domain.log;

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
@Table(name = "ars_log")
public class ArsLog {
    @Column(name="ars_idx")
    @Id
    private String arsIdx;

    @Column(name="ars_tel")
    private String arsTel;

    @Enumerated(EnumType.STRING)
    @Column(name="ars_state")
    private ArsState arsState;

    @Column(name="reg_dt")
    private LocalDateTime regDt;

    @Column(name="mod_dt")
    private LocalDateTime modDt;

    @Enumerated(EnumType.STRING)
    @ColumnDefault("'N'")
    @Column(name="del_yn")
    private DelYn delYn;
}
