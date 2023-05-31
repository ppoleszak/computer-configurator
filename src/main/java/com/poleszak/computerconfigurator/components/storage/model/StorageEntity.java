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
    private String productCode;
    private int capacity;
    @Enumerated(STRING)
    private FormatType format;
    @Enumerated(STRING)
    private InterfaceType interfaceType;
    private int readSpeed;
    private int writeSpeed;
    private int randomRead;
    private int randomWrite;
    @Enumerated(STRING)
    private MemoryType memoryType;
    private long mtbf; // Mean Time Between Failures
    private boolean radiator;
    private String additionalInformation;
    private String color;
    private String warranty;
}
