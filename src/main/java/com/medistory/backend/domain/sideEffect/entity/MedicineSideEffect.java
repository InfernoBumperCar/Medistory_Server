package com.medistory.backend.domain.sideEffect.entity;

import com.medistory.backend.domain.sideEffectMedicine.entity.SideEffectMedicine;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "medicine_side_effect")
public class MedicineSideEffect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "side_effect_medicine_id", referencedColumnName = "id")
    private SideEffectMedicine sideEffectMedicine;
}
