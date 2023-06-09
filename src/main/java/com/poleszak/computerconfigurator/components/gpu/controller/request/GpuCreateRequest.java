package com.poleszak.computerconfigurator.components.gpu.controller.request;

import com.poleszak.computerconfigurator.components.gpu.model.enumerated.Bus;
import com.poleszak.computerconfigurator.components.gpu.model.enumerated.MemoryInterface;
import com.poleszak.computerconfigurator.components.gpu.model.enumerated.MemoryType;
import org.springframework.lang.NonNull;

import java.time.LocalDateTime;

public record GpuCreateRequest(@NonNull String name,
                               @NonNull String chip,
                               @NonNull Bus bus,
                               @NonNull int memorySize,
                               @NonNull MemoryType memoryType,
                               @NonNull MemoryInterface memoryInterface,
                               @NonNull int gpuClock,
                               @NonNull int memoryClock,
                               @NonNull int shaders,
                               @NonNull int tmus,
                               @NonNull int rops,
                               @NonNull LocalDateTime released) {
}