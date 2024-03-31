package com.medistory.backend.domain.prescriptionRecord.controller;

import com.medistory.backend.domain.prescriptionRecord.dto.PrescriptionRecordInquiryResponseDto;
import com.medistory.backend.domain.prescriptionRecord.dto.PrescriptionRecordRegisterRequestDto;
import com.medistory.backend.domain.prescriptionRecord.service.PrescriptionRecordService;
import com.medistory.backend.global.dto.JsonResponse;
import com.medistory.backend.global.exception.ResponseStatus;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "PrescriptionRecord", description = "PrescriptionRecord API")
@RestController
@RequiredArgsConstructor
public class PrescriptionRecordController {

    private final PrescriptionRecordService prescriptionRecordService;

    @Operation(summary = "약물평가 기록 목록")
    @ApiResponse(responseCode = "200", description = "약물평가 기록 목록", useReturnTypeSchema = true)
    @GetMapping("/prescription/record")
    public ResponseEntity<JsonResponse<List<PrescriptionRecordInquiryResponseDto>>> inquiryPrescriptionRecordList() {
        List<PrescriptionRecordInquiryResponseDto> prescriptionRecordInquiryResponseDtoList = prescriptionRecordService.inquiryPrescriptionRecordList();
        return ResponseEntity.ok(new JsonResponse(ResponseStatus.SUCCESS, prescriptionRecordInquiryResponseDtoList));
    }

    @Operation(summary = "약물평가 기록")
    @ApiResponse(responseCode = "200", description = "약물평가 기록 등록", useReturnTypeSchema = true)
    @PostMapping("/prescription/record")
    public ResponseEntity<JsonResponse> registerPrescriptionRecord(@RequestBody PrescriptionRecordRegisterRequestDto prescriptionRecordRegisterRequestDto) {
        prescriptionRecordService.registerPrescriptionRecord(prescriptionRecordRegisterRequestDto);
        return ResponseEntity.ok(new JsonResponse(ResponseStatus.SUCCESS));
    }
}
