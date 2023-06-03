package com.poleszak.computerconfigurator.components.ram.service;

import com.poleszak.computerconfigurator.components.ram.controller.request.RamCreateRequest;
import com.poleszak.computerconfigurator.components.ram.model.RamEntity;
import com.poleszak.computerconfigurator.components.ram.repository.RamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RamService {

    private final RamRepository ramRepository;

    public void create(RamCreateRequest ramCreateRequest) {
        RamEntity ramEntity = RamEntity.builder()
                .name(ramCreateRequest.name())
                .productCode(ramCreateRequest.productCode())
                .series(ramCreateRequest.series())
                .memoryType(ramCreateRequest.memoryType())
                .totalCapacity(ramCreateRequest.totalCapacity())
                .moduleCapacity(ramCreateRequest.moduleCapacity())
                .numberOfModules(ramCreateRequest.numberOfModules())
                .clockSpeed(ramCreateRequest.clockSpeed())
                .latency(ramCreateRequest.latency())
                .timing(ramCreateRequest.timing())
                .voltage(ramCreateRequest.voltage())
                .cooling(ramCreateRequest.cooling())
                .eccMemory(ramCreateRequest.eccMemory())
                .memoryLighting(ramCreateRequest.memoryLighting())
                .additionalInformation(ramCreateRequest.additionalInformation())
                .color(ramCreateRequest.color())
                .warranty(ramCreateRequest.warranty())
                .released(ramCreateRequest.released())
                .performance(calculateRamPerformance(
                        ramCreateRequest.totalCapacity(),
                        ramCreateRequest.clockSpeed(),
                        ramCreateRequest.latency()))
                .build();

        ramRepository.save(ramEntity);
    }

    private double calculateRamPerformance(int totalCapacity, int clockSpeed, int latency) {
        double totalCapacityWeight = 0.4;
        double clockSpeedWeight = 0.4;
        double latencyWeight = 0.2;

        return (totalCapacity * totalCapacityWeight) +
                (clockSpeed * clockSpeedWeight) +
                ((1.0 - (latency / 100.0)) * latencyWeight);
    }
}