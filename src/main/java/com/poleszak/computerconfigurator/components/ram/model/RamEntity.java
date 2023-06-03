package com.poleszak.computerconfigurator.components.ram.model;

import com.poleszak.computerconfigurator.commons.model.BaseEntity;
import com.poleszak.computerconfigurator.components.ram.model.enumerated.CoolingType;
import com.poleszak.computerconfigurator.components.ram.model.enumerated.MemoryType;
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
public class RamEntity extends BaseEntity {

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String productCode;
    @Column(nullable = false)
    private String series;
    @Column(nullable = false)
    @Enumerated(STRING)
    private MemoryType memoryType;
    @Column(nullable = false)
    private int totalCapacity;
    @Column(nullable = false)
    private int moduleCapacity;
    @Column(nullable = false)
    private int numberOfModules;
    @Column(nullable = false)
    private int clockSpeed;
    @Column(nullable = false)
    private int latency;
    @Column(nullable = false)
    private String timing;
    @Column(nullable = false)
    private double voltage;
    @Column(nullable = false)
    @Enumerated(STRING)
    private CoolingType cooling;
    @Column(nullable = false)
    private boolean eccMemory;
    @Column(nullable = false)
    private boolean memoryLighting;
    @Column(nullable = false)
    private String additionalInformation;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private String warranty;
    @Column(nullable = false)
    private double performance;
}