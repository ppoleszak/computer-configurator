package com.poleszak.computerconfigurator.components.storage.model;

import com.poleszak.computerconfigurator.commons.model.BaseEntity;
import com.poleszak.computerconfigurator.components.storage.model.enumerated.FormatType;
import com.poleszak.computerconfigurator.components.storage.model.enumerated.InterfaceType;
import com.poleszak.computerconfigurator.components.storage.model.enumerated.MemoryType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import static jakarta.persistence.EnumType.STRING;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class StorageEntity extends BaseEntity {

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String productCode;
    @Column(nullable = false)
    private int capacity;
    @Column(nullable = false)
    @Enumerated(STRING)
    private FormatType format;
    @Column(nullable = false)
    @Enumerated(STRING)
    private InterfaceType interfaceType;
    @Column(nullable = false)
    private int readSpeed;
    @Column(nullable = false)
    private int writeSpeed;
    @Column(nullable = false)
    private int randomRead;
    @Column(nullable = false)
    private int randomWrite;
    @Column(nullable = false)
    @Enumerated(STRING)
    private MemoryType memoryType;
    @Column(nullable = false)
    private long mtbf; // Mean Time Between Failures
    @Column(nullable = false)
    private boolean radiator;
    @Column(nullable = false)
    private String additionalInformation;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private String warranty;
}