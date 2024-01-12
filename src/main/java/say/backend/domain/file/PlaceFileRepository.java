package say.backend.domain.file;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlaceFileRepository extends JpaRepository<PlaceFile, String> {
    Optional<PlaceFile> findByFileIdx(String fileIdx);
    Optional<PlaceFile> findByPlaceIdx(String placeIdx);
}
