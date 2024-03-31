package com.medistory.backend.domain.prescriptionRecord.service;

import com.medistory.backend.domain.prescriptionRecord.dto.PrescriptionRecordInquiryResponseDto;
import com.medistory.backend.domain.prescriptionRecord.dto.PrescriptionRecordRegisterRequestDto;
import com.medistory.backend.domain.prescriptionRecord.repository.PrescriptionRecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PrescriptionRecordService {
    private final PrescriptionRecordRepository prescriptionRecordRepository;

    public List<PrescriptionRecordInquiryResponseDto> inquiryPrescriptionRecordList() {
        // 회원 아이디로 prescription 목록 불러오기
        // existsByPrescription(Prescription prescription) 로 기록이 없는 Prescription 만
        // List<PrescriptionRecordInquiryResponseDto> 로 변환

        // 일단 빈 리스트 반환
        List<PrescriptionRecordInquiryResponseDto> prescriptionRecordInquiryResponseDtoList = Collections.emptyList();

        return prescriptionRecordInquiryResponseDtoList;
    }

    public void registerPrescriptionRecord(PrescriptionRecordRegisterRequestDto prescriptionRecordRegisterRequestDto) {
        // 빌더로 엔티티 생성
        // 부작용은 PrescriptionRecordSideEffect 서비스로 따로 저장
    }
}
