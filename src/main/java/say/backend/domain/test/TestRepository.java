// TODO: erd 설계 완료 후 삭제 예정 (참고용)
package say.backend.domain.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
    Optional<Test> findByTestIdx(Long testIdx);
}
