package com.medistory.backend.domain.prescriptionRecord.repository;

import com.medistory.backend.domain.prescription.entity.Prescription;
import com.medistory.backend.domain.prescriptionRecord.entity.PrescriptionRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRecordRepository extends JpaRepository<PrescriptionRecord, Long> {
    Boolean existsByPrescription(Prescription prescription);
}
