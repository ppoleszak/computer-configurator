package com.poleszak.computerconfigurator.components.motherboard.service;

import com.poleszak.computerconfigurator.components.motherboard.controller.request.MotherboardCreateRequest;
import com.poleszak.computerconfigurator.components.motherboard.model.MotherboardEntity;
import com.poleszak.computerconfigurator.components.motherboard.repository.MotherboardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MotherboardService {

    private final MotherboardRepository motherboardRepository;

    public void create(MotherboardCreateRequest motherboardCreateRequest) {
        var motherboard = MotherboardEntity.builder()
                .name(motherboardCreateRequest.name())
                .processorFamilyType(motherboardCreateRequest.processorFamilyType())
                .socketType(motherboardCreateRequest.socketType())
                .chipset(motherboardCreateRequest.chipset())
                .processorArchitecture(motherboardCreateRequest.processorArchitecture())
                .memoryType(motherboardCreateRequest.memoryType())
                .memoryBanks(motherboardCreateRequest.memoryBanks())
                .maxRamSize(motherboardCreateRequest.maxRamSize())
                .memoryArchitecture(motherboardCreateRequest.memoryArchitecture())
                .raidSupport(motherboardCreateRequest.raidSupport())
                .multiGraphicsCardSupport(motherboardCreateRequest.multiGraphicsCardSupport())
                .onboardGraphicsSupport(motherboardCreateRequest.onboardGraphicsSupport())
                .audioChipset(motherboardCreateRequest.audioChipset())
                .wirelessConnectivity(motherboardCreateRequest.wirelessConnectivity())
                .format(motherboardCreateRequest.format())
                .width(motherboardCreateRequest.width())
                .height(motherboardCreateRequest.height())
                .released(motherboardCreateRequest.released())
                .build();

        motherboardRepository.save(motherboard);
    }
}