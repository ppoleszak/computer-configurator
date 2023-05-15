package com.poleszak.computerconfigurator.components.psu.model;

import com.poleszak.computerconfigurator.commons.model.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PsuEntity extends BaseEntity {

    @Column(nullable = false)
    private String name;
}
