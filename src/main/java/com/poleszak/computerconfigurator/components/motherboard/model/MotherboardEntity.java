package com.poleszak.computerconfigurator.components.motherboard.model;

import com.poleszak.computerconfigurator.commons.model.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import static jakarta.persistence.EnumType.STRING;

@Data
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MotherboardEntity extends BaseEntity {

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    @Enumerated(STRING)
    private RamType ramType;
}
