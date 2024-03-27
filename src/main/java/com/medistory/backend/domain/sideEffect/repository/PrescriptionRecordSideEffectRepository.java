package com.medistory.backend.domain.sideEffect.repository;

import com.medistory.backend.domain.sideEffect.entity.PrescriptionRecordSideEffect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionRecordSideEffectRepository extends JpaRepository<PrescriptionRecordSideEffect, Long> {
}
