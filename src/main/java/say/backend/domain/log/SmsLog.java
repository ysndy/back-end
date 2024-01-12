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
@Table(name = "sms_log")
public class SmsLog {
    @Column(name="sms_idx")
    @Id
    private String smsIdx;

    @Column(name="sms_tel")
    private String smsTel;

    @Enumerated(EnumType.STRING)
    @Column(name="sms_state")
    private SmsState smsState;

    @Column(name="reg_dt")
    private LocalDateTime regDt;

    @Column(name="mod_dt")
    private LocalDateTime modDt;

    @Enumerated(EnumType.STRING)
    @ColumnDefault("'N'")
    @Column(name="del_yn")
    private DelYn delYn;
}
