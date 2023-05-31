package com.poleszak.computerconfigurator.components.psu.controller.request;

import com.poleszak.computerconfigurator.components.psu.model.enumerated.Certificate;
import org.springframework.lang.NonNull;

import java.time.LocalDateTime;
import java.util.List;

public record PsuCreateRequest(
        @NonNull String name,
        @NonNull Integer maxPower,
        @NonNull String standard,
        @NonNull List<String> connectors,
        @NonNull Certificate certificate,
        @NonNull List<String> protections,
        @NonNull String powerFactorCorrection,
        @NonNull String color,
        @NonNull Integer height,
        @NonNull Integer width,
        @NonNull Integer depth,
        @NonNull LocalDateTime released
) {
}