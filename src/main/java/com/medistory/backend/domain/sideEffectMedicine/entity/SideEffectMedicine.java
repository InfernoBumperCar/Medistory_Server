package com.medistory.backend.domain.sideEffectMedicine.entity;

import com.medistory.backend.domain.member.entity.Member;
import com.medistory.backend.domain.sideEffect.entity.MedicineSideEffect;
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
@Table(name = "side_effect_medicine")
public class SideEffectMedicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "item_id")
    private Long itemId;
    @Column(name = "item_name")
    private String itemName;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", referencedColumnName = "id")
    private Member member;
    @OneToMany(mappedBy = "sideEffectMedicine", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MedicineSideEffect> medicineSideEffectList;

    public void addMedicineSideEffect(MedicineSideEffect medicineSideEffect) {
        this.medicineSideEffectList.add(medicineSideEffect);
    }

    public void removeMedicineSideEffect(MedicineSideEffect medicineSideEffect) {
        this.medicineSideEffectList.remove(medicineSideEffect);
    }
}
