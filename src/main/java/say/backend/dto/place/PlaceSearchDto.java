package say.backend.dto.place;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Schema(title = "장소 검색 조건 dto")
public class PlaceSearchDto {
    @Schema(description = "장소 idx", example = "")
    private String placeIdx;
    @Schema(description = "장소명", example = "")
    private String placeName;
    @Schema(description = "장소 카테고리", example = "CHARGE")
    private String placeCategory;

}
