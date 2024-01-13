package say.backend.controller.admin;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;
import lombok.RequiredArgsConstructor;
import say.backend.exception.common.BusinessException;
import say.backend.response.BaseResponse;

@Slf4j
@RestController
@RequiredArgsConstructor
@Tag(name = "(관리자) 장소 API")
@RequestMapping("/api/admin/places")
public class AdminPlaceController {

    @Operation(summary="장소 등록", description = "장소 등록")
    @PostMapping("/insert")
    public BaseResponse<String> insertPlace() {
        try{
            return new BaseResponse<String>("success");
        } catch(BusinessException e) {
            return new BaseResponse(e.getErrorCode());
        }
    }

    @Operation(summary = "장소 상세 정보 조회", description = "idx에 해당하는 장소 정보 1개 반환")
    @GetMapping("/detail")
    public BaseResponse<String> getPlaceDetail() {
        try{
            return new BaseResponse<String>("success");
        } catch(BusinessException e) {
            return new BaseResponse(e.getErrorCode());
        }
    }

    @Operation(summary="장소 리스트 조회", description = "필터링 조건에 맞는 장소 리스트 반환")
    @GetMapping("/list")
    public BaseResponse<String> getPlaceList() {
        try{
            return new BaseResponse<String>("success");
        } catch(BusinessException e) {
            return new BaseResponse(e.getErrorCode());
        }
    }

    @Operation(summary="장소 삭제", description = "idx 해당하는 장소 삭제")
    @DeleteMapping("/delete")
    public BaseResponse<String> deletePlace() {
        try{
            return new BaseResponse<String>("success");
        } catch(BusinessException e) {
            return new BaseResponse(e.getErrorCode());
        }
    }

    @Operation(summary="장소 정보 수정", description = "idx에 해당하는 장소 정보 수정")
    @PatchMapping("/update")
    public BaseResponse<String> updatePlace() {
        try{
            return new BaseResponse<String>("success");
        } catch(BusinessException e) {
            return new BaseResponse(e.getErrorCode());
        }
    }
}
