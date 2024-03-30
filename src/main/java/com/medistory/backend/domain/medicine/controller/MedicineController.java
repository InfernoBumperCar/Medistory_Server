package com.medistory.backend.domain.medicine.controller;

import com.medistory.backend.domain.medicine.service.MedicineService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Medicine", description = "Medicine API")
@RestController
@RequiredArgsConstructor
public class MedicineController {

    private final MedicineService medicineService;

    // 복용약 알림 API
}
