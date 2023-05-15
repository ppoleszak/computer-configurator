package com.poleszak.computerconfigurator.components.cpu.controller.request;

import com.poleszak.computerconfigurator.components.cpu.model.enumerated.Socket;
import org.springframework.lang.NonNull;

import java.time.LocalDateTime;

public record CpuCreateRequest(@NonNull String name,
                               @NonNull int cores,
                               @NonNull int threads,
                               @NonNull double clockMin,
                               @NonNull double clockMax,
                               @NonNull Socket socket,
                               @NonNull int process,
                               @NonNull int l3Cache,
                               @NonNull int tdp,
                               @NonNull LocalDateTime released) {
}