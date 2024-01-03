// TODO: erd 설계 후 삭제 예정
// DTO보통 어떻게 사용하시나요? entity extends 시켜서? ResponseDto RequestDto 필요에 따라 만들어서?
package say.backend.service;

import say.backend.domain.test.TestRepository;

import say.backend.exception.common.BusinessException;


import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import say.backend.exception.common.ErrorCode;

import java.security.cert.CertPathBuilderException;

@RequiredArgsConstructor
@Service
public class TestService {

    private final TestRepository testRepository;

    public String getResultMsg(boolean isSuccess) {
        if (isSuccess) {
            return ErrorCode.SUCCESS.getMessage();
        } else {
            throw new BusinessException(ErrorCode.INVALID_INPUT);
        }
    }

}
