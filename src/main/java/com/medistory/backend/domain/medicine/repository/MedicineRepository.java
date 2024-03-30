package com.medistory.backend.domain.medicine.repository;

import com.medistory.backend.domain.medicine.entity.Medicine;
import com.medistory.backend.domain.prescription.entity.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {
    List<Medicine> findByPrescription(Prescription prescription);
}
