package com.medistory.backend.domain.prescriptionRecord.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class PrescriptionRecordRegisterRequestDto {
    private int rating;
    private boolean isSideEffect;
    private List<sideEffectDto> sideEffect;

    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class sideEffectDto {
        private String sideEffectName;
    }
}
