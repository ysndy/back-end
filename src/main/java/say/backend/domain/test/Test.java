// TODO: erd 설계 완료 되면 지울 예정
package say.backend.domain.test;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@Getter @Setter @Entity
@Table(name = "test")
public class Test {
    // TODO: idx의 경우 long or int 어떤게 좋으신가요?
    @Column(name="test_id")
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long testIdx;

    @Column(name="test_col", unique = true)
    private String testCol;
}
