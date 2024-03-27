package com.medistory.backend.domain.medicine.entity;

import com.medistory.backend.domain.prescription.entity.Prescription;
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
@Table(name = "medicine")
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_id")
    private Long itemId;

    private boolean morning;

    private boolean lunch;

    private boolean dinner;

    private boolean sleep;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prescription_id", referencedColumnName = "id")
    private Prescription prescription;
}
