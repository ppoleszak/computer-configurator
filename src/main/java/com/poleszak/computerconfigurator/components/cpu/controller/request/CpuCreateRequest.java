package com.poleszak.computerconfigurator.components.cpu.controller.request;

import com.poleszak.computerconfigurator.components.cpu.model.Socket;

import java.time.LocalDateTime;

public record CpuCreateRequest(String name,
                               int cores,
                               int threads,
                               double clockMin,
                               double clockMax,
                               Socket socket,
                               int process,
                               int l3Cache,
                               int tdp,
                               LocalDateTime released) {
}
