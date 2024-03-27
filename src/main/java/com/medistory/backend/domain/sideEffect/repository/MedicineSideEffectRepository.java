package com.medistory.backend.domain.sideEffect.repository;

import com.medistory.backend.domain.sideEffect.entity.MedicineSideEffect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineSideEffectRepository extends JpaRepository<MedicineSideEffect, Long> {
}
