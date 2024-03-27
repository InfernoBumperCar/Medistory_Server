package com.medistory.backend.domain.sideEffect.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SideEffect {
    STOMACHACHE("복통"),
    VOMIT("구토"),
    DIARRHEA("설사"),
    HIVES("두드러기"),
    ALLERGY("알레르기"),
    ASLEEP("손발저림")
    ;

    private final String name;

}
