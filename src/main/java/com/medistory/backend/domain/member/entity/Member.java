package com.medistory.backend.domain.member.entity;

import com.medistory.backend.domain.prescription.entity.Prescription;
import com.medistory.backend.domain.sideEffectMedicine.entity.SideEffectMedicine;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private String gender;
    @Column(name = "birth_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;
    private String email;

    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Prescription> prescriptionList;

    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<SideEffectMedicine> sideEffectMedicineList;

    public void addPrescription(Prescription prescription) {
        this.prescriptionList.add(prescription);
    }

    public void removePrescription(Prescription prescription) {
        this.prescriptionList.remove(prescription);
    }

    public void addSideEffectMedicine(SideEffectMedicine sideEffectMedicine) {
        this.sideEffectMedicineList.add(sideEffectMedicine);
    }

    public void removeEffectMedicine(SideEffectMedicine sideEffectMedicine) {
        this.prescriptionList.remove(sideEffectMedicine);
    }
}
