package com.poleszak.computerconfigurator.components.psu.model;

import com.poleszak.computerconfigurator.commons.model.BaseEntity;
import com.poleszak.computerconfigurator.components.psu.model.enumerated.Certificate;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PsuEntity extends BaseEntity {

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Integer maxPower;
    @Column(nullable = false)
    private String standard;
    @ElementCollection
    @Column(nullable = false)
    private List<String> connectors;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Certificate certificate;
    @ElementCollection
    @Column(nullable = false)
    private List<String> protections;
    @Column(nullable = false)
    private String powerFactorCorrection;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private Integer height;
    @Column(nullable = false)
    private Integer width;
    @Column(nullable = false)
    private Integer depth;
}