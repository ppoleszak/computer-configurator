package com.poleszak.computerconfigurator.components.motherboard.controller.request;

import com.poleszak.computerconfigurator.components.motherboard.model.enumerated.*;
import org.springframework.lang.NonNull;

public record MotherboardCreateRequest(
        @NonNull String name,
        @NonNull SupportedProcessorFamily supportedProcessorFamily,
        @NonNull SocketType socketType,
        @NonNull String chipset,
        @NonNull ProcessorArchitecture processorArchitecture,
        @NonNull MemoryType supportedMemoryTypes,
        @NonNull Integer memoryBanks,
        @NonNull Integer maxRamSize,
        @NonNull MemoryArchitecture memoryArchitecture,
        @NonNull RaidSupport raidSupport,
        @NonNull Boolean multiGraphicsCardSupport,
        @NonNull Boolean onboardGraphicsSupport,
        @NonNull String audioChipset,
        @NonNull Boolean wirelessConnectivity,
        @NonNull Format format,
        @NonNull Integer width,
        @NonNull Integer height
) {}