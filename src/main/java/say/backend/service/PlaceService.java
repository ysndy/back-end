package say.backend.service;

import say.backend.domain.common.DelYn;
import say.backend.domain.place.PlaceInfo;
import say.backend.domain.place.PlaceInfoRepository;

import say.backend.dto.place.*;
import say.backend.exception.common.BusinessException;


import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import say.backend.exception.common.ErrorCode;

import java.time.LocalDateTime;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class PlaceService {

    private final PlaceInfoRepository placeInfoRepository;

    @Transactional
    public PlaceInfo createPlace(PlaceCreateDto pcd) {
        try{
            // create new obj
            PlaceInfo newPlaceInfo = new PlaceInfo();

            // set param
            String uuid = UUID.randomUUID().toString();
            LocalDateTime date = LocalDateTime.now();
            newPlaceInfo.setPlaceIdx(uuid);
            newPlaceInfo.setPlaceName(pcd.getPlaceName());
            newPlaceInfo.setAddress(pcd.getAddress());
            newPlaceInfo.setAddressDetail(pcd.getAddressDetail());
            newPlaceInfo.setPlaceCategory(pcd.getPlaceCategory());
            newPlaceInfo.setCoordinate(pcd.getCoordinate());
            newPlaceInfo.setRegDt(date);
            newPlaceInfo.setModDt(date);
            newPlaceInfo.setDelYn(DelYn.N);

            // insert new data
            PlaceInfo resultData = placeInfoRepository.save(newPlaceInfo);

            return resultData;
        } catch(Exception e){
            throw new BusinessException(ErrorCode.DATABASE_ERROR);
        }
    }

    public String getPlaceDetail() {
        return "success";
    }

    public String getPlaceList() {
        return "success";
    }

    public String updatePlace() {
        return "success";
    }

    public String deletePlace() {
        return "success";
    }
}
