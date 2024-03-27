package com.medistory.backend.domain.sideEffectMedicine.repository;

import com.medistory.backend.domain.sideEffectMedicine.entity.SideEffectMedicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SideEffectMedicineRepository extends JpaRepository<SideEffectMedicine, Long> {
}
