package com.poleszak.computerconfigurator.components.storage.controller.request;

import com.poleszak.computerconfigurator.components.storage.model.enumerated.FormatType;
import com.poleszak.computerconfigurator.components.storage.model.enumerated.InterfaceType;
import com.poleszak.computerconfigurator.components.storage.model.enumerated.MemoryType;
import org.springframework.lang.NonNull;

import java.time.LocalDateTime;

public record StorageCreateRequest(
        @NonNull String name,
        @NonNull String productCode,
        @NonNull Integer capacity,
        @NonNull FormatType format,
        @NonNull InterfaceType interfaceType,
        @NonNull Integer readSpeed,
        @NonNull Integer writeSpeed,
        @NonNull Integer randomRead,
        @NonNull Integer randomWrite,
        @NonNull MemoryType memoryType,
        @NonNull Long mtbf,
        @NonNull Boolean radiator,
        @NonNull String additionalInformation,
        @NonNull String color,
        @NonNull String warranty,
        @NonNull LocalDateTime released
) {
}