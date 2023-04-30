package com.poleszak.computerconfigurator.components.cpu.model;

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
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CpuEntity extends BaseEntity {

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int cores;
    @Column(nullable = false)
    private int threads;
    @Column(nullable = false)
    private double clockMin;
    @Column(nullable = false)
    private double clockMax;
    @Column(nullable = false)
    private Socket socket;
    @Column(nullable = false)
    private int process;
    @Column(nullable = false)
    private int l3Cache;
    @Column(nullable = false)
    private int tdp;
}