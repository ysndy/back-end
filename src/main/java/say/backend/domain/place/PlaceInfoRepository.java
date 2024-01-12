package say.backend.domain.place;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlaceInfoRepository extends JpaRepository<PlaceInfo, String> {
    Optional<PlaceInfo> findByPlaceIdx(String placeIdx);
}
