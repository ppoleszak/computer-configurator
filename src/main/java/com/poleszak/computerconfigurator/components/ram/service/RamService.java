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
                .build();

        ramRepository.save(ramEntity);
    }
}