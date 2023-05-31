package com.poleszak.computerconfigurator.components.ram.controller.request;

import com.poleszak.computerconfigurator.components.ram.model.enumerated.CoolingType;
import com.poleszak.computerconfigurator.components.ram.model.enumerated.MemoryType;
import org.springframework.lang.NonNull;

import java.time.LocalDateTime;

public record RamCreateRequest(
        @NonNull String name,
        @NonNull String productCode,
        @NonNull String series,
        @NonNull MemoryType memoryType,
        @NonNull Integer totalCapacity,
        @NonNull Integer moduleCapacity,
        @NonNull Integer numberOfModules,
        @NonNull Integer clockSpeed,
        @NonNull Integer latency,
        @NonNull String timing,
        @NonNull Double voltage,
        @NonNull CoolingType cooling,
        @NonNull Boolean eccMemory,
        @NonNull Boolean memoryLighting,
        @NonNull String additionalInformation,
        @NonNull String color,
        @NonNull String warranty,
        @NonNull LocalDateTime released
) {
}

