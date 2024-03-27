package com.medistory.backend.domain.sideEffect.entity;

import com.medistory.backend.domain.prescriptionRecord.entity.PrescriptionRecord;
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
@Table(name = "prescription_record_side_effect")
public class PrescriptionRecordSideEffect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prescription_record_id", referencedColumnName = "id")
    private PrescriptionRecord prescriptionRecord;
}
