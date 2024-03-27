package com.medistory.backend.domain.prescriptionRecord.entity;

import com.medistory.backend.domain.prescription.entity.Prescription;
import com.medistory.backend.domain.sideEffect.entity.PrescriptionRecordSideEffect;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "prescription_record")
public class PrescriptionRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int rating;

    @Column(name = "side_effect")
    private boolean sideEffect;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prescription_id", referencedColumnName = "id")
    private Prescription prescription;

    @OneToMany(mappedBy = "prescriptionRecord", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<PrescriptionRecordSideEffect> prescriptionRecordSideEffectList;

    public void addPrescriptionRecordSideEffect(PrescriptionRecordSideEffect prescriptionRecordSideEffect) {
        this.prescriptionRecordSideEffectList.add(prescriptionRecordSideEffect);
    }

    public void removePrescriptionRecordSideEffect(PrescriptionRecordSideEffect prescriptionRecordSideEffect) {
        this.prescriptionRecordSideEffectList.remove(prescriptionRecordSideEffect);
    }
}
