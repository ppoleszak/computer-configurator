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
    private String productCode;
    private String series;
    @Enumerated(STRING)
    private MemoryType memoryType;
    private int totalCapacity;
    private int moduleCapacity;
    private int numberOfModules;
    private int clockSpeed;
    private int latency;
    private String timing;
    private double voltage;
    @Enumerated(STRING)
    private CoolingType cooling;
    private boolean eccMemory;
    private boolean memoryLighting;
    private String additionalInformation;
    private String color;
    private String warranty;
}