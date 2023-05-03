package com.poleszak.computerconfigurator.components.gpu.model;

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
public class GpuEntity extends BaseEntity {

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String chip;
    @Column(nullable = false)
    @Enumerated(STRING)
    private Bus bus;
    @Column(nullable = false)
    private int memorySize;
    @Column(nullable = false)
    @Enumerated(STRING)
    private MemoryType memoryType;
    @Column(nullable = false)
    @Enumerated(STRING)
    private MemoryInterface memoryInterface;
    @Column(nullable = false)
    private int gpuClock;
    @Column(nullable = false)
    private int memoryClock;
    @Column(nullable = false)
    private int shaders;
    @Column(nullable = false)
    private int tmus;
    @Column(nullable = false)
    private int rops;
    @Column(nullable = false)
    private double performance;
}