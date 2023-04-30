package com.poleszak.computerconfigurator.components.cpu.service;

import com.poleszak.computerconfigurator.components.cpu.controller.request.CpuCreateRequest;
import com.poleszak.computerconfigurator.components.cpu.model.CpuEntity;
import com.poleszak.computerconfigurator.components.cpu.repository.CpuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CpuService {

    private final CpuRepository cpuRepository;

    public void create(CpuCreateRequest cpuCreateRequest) {
        var cpu = CpuEntity.builder()
                .name(cpuCreateRequest.name())
                .cores(cpuCreateRequest.cores())
                .threads(cpuCreateRequest.threads())
                .clockMin(cpuCreateRequest.clockMin())
                .clockMax(cpuCreateRequest.clockMax())
                .socket(cpuCreateRequest.socket())
                .process(cpuCreateRequest.process())
                .l3Cache(cpuCreateRequest.l3Cache())
                .tdp(cpuCreateRequest.tdp())
                .released(cpuCreateRequest.released())
                .build();

        cpuRepository.save(cpu);
    }
}