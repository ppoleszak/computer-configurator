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
//        validateCreateCpuRequest(cpuCreateRequest);
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
                .performance(calculatePerformance(cpuCreateRequest.cores(), cpuCreateRequest.threads(), cpuCreateRequest.clockMin(), cpuCreateRequest.clockMax(), cpuCreateRequest.l3Cache(), cpuCreateRequest.tdp()))
                .build();

        cpuRepository.save(cpu);
    }

    private double calculatePerformance(int cores, int threads, double clockMin, double clockMax, int l3Cache, int tdp) {
        double coresWeight = 0.35;
        double threadsWeight = 0.15;
        double clockMinWeight = 0.05;
        double clockMaxWeight = 0.25;
        double l3CacheWeight = 0.1;
        double tdpWeight = 0.1;

        return cores * coresWeight + threads * threadsWeight + clockMin * clockMinWeight + clockMax * clockMaxWeight
                + l3Cache * l3CacheWeight + tdp * tdpWeight;
    }

//    private void validateCreateCpuRequest(CpuCreateRequest cpuCreateRequest) {
//        if (cpuRepository.findCpuEntityByName(cpuCreateRequest.name())) {
//            return;
//        }
//    }
//
//    public void delete(UUID cpuId) {
//    }
}