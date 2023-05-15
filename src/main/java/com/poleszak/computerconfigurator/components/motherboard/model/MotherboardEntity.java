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
    private SupportedProcessorFamily supportedProcessorFamily;
    @Column(nullable = false)
    @Enumerated(STRING)
    private SocketType socketType;
    @Column(nullable = false)
    private String chipset;
    @Column(nullable = false)
    @Enumerated(STRING)
    private ProcessorArchitecture processorArchitecture;
    @Column(nullable = false)
    private MemoryType supportedMemoryTypes;
    @Column(nullable = false)
    private Integer memoryBanks;
    @Column(nullable = false)
    private Integer maxRamSize;
    @Column(nullable = false)
    @Enumerated(STRING)
    private MemoryArchitecture memoryArchitecture;
    @Column(nullable = false)
    @Enumerated(STRING)
    private RaidSupport raidSupport;
    @Column(nullable = false)
    private Boolean multiGraphicsCardSupport;
    @Column(nullable = false)
    private Boolean onboardGraphicsSupport;
    @Column(nullable = false)
    private String audioChipset;
    @Column(nullable = false)
    private Boolean wirelessConnectivity;
    @Column(nullable = false)
    @Enumerated(STRING)
    private Format format;
    @Column(nullable = false)
    private Integer width;
    @Column(nullable = false)
    private Integer height;
}