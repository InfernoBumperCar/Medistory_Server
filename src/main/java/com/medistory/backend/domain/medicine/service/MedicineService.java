package com.medistory.backend.domain.medicine.service;

import com.medistory.backend.domain.medicine.entity.Medicine;
import com.medistory.backend.domain.medicine.repository.MedicineRepository;
import com.medistory.backend.domain.prescription.entity.Prescription;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MedicineService {

    private final MedicineRepository medicineRepository;

    public List<String> inquiryMedicineByPrescription(Prescription prescription) {

        List<Medicine> medicineList = medicineRepository.findByPrescription(prescription);

        List<String> medicines = medicineList.stream()
                .map(medicine -> medicine.getItemName())
                .collect(Collectors.toList());

        return medicines;
    }
}
