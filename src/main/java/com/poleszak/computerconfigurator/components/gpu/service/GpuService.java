package com.poleszak.computerconfigurator.components.gpu.service;

import com.poleszak.computerconfigurator.components.gpu.controller.request.GpuCreateRequest;
import com.poleszak.computerconfigurator.components.gpu.model.GpuEntity;
import com.poleszak.computerconfigurator.components.gpu.repository.GpuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GpuService {

    private final GpuRepository gpuRepository;

    public void create(GpuCreateRequest gpuCreateRequest) {
        var gpu = GpuEntity.builder()
                .name(gpuCreateRequest.name())
                .chip(gpuCreateRequest.chip())
                .bus(gpuCreateRequest.bus())
                .memorySize(gpuCreateRequest.memorySize())
                .memoryType(gpuCreateRequest.memoryType())
                .memoryInterface(gpuCreateRequest.memoryInterface())
                .gpuClock(gpuCreateRequest.gpuClock())
                .memoryClock(gpuCreateRequest.memoryClock())
                .shaders(gpuCreateRequest.shaders())
                .tmus(gpuCreateRequest.tmus())
                .rops(gpuCreateRequest.rops())
                .released(gpuCreateRequest.released())
                .performance(calculatePerformance(gpuCreateRequest.shaders(),
                        gpuCreateRequest.gpuClock(),
                        gpuCreateRequest.tmus(),
                        gpuCreateRequest.memoryClock(),
                        gpuCreateRequest.memoryClock()))
                .build();

        gpuRepository.save(gpu);
    }

    private double calculatePerformance(int shaders, int gpuClock,
                                        int tmus, int memoryClock, int rops) {
        double shadersWeight = 0.4;
        double gpuClockWeight = 0.15;
        double tmusWeight = 0.2;
        double memoryClockWeight = 0.15;
        double ropsWeight = 0.1;

        return (shaders * shadersWeight) * (gpuClock * gpuClockWeight) +
                (tmus * tmusWeight) * (gpuClock * gpuClockWeight) +
                (memoryClock * memoryClockWeight) +
                (rops * ropsWeight) * (memoryClock * memoryClockWeight);
    }
}