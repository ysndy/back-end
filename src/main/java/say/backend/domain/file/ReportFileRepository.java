package say.backend.domain.file;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReportFileRepository extends JpaRepository<ReportFile, String> {
    Optional<ReportFile> findByFileIdx(String fileIdx);
    Optional<ReportFile> findByReportIdx(String reportIdx);
}
