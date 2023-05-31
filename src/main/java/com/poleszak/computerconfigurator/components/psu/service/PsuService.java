package com.poleszak.computerconfigurator.components.psu.service;

import com.poleszak.computerconfigurator.components.psu.controller.request.PsuCreateRequest;
import com.poleszak.computerconfigurator.components.psu.model.PsuEntity;
import com.poleszak.computerconfigurator.components.psu.repository.PsuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PsuService {

    private final PsuRepository psuRepository;

    public void create(PsuCreateRequest psuCreateRequest) {
        PsuEntity psuEntity = PsuEntity.builder()
                .name(psuCreateRequest.name())
                .maxPower(psuCreateRequest.maxPower())
                .standard(psuCreateRequest.standard())
                .connectors(psuCreateRequest.connectors())
                .certificate(psuCreateRequest.certificate())
                .protections(psuCreateRequest.protections())
                .powerFactorCorrection(psuCreateRequest.powerFactorCorrection())
                .color(psuCreateRequest.color())
                .height(psuCreateRequest.height())
                .width(psuCreateRequest.width())
                .depth(psuCreateRequest.depth())
                .released(psuCreateRequest.released())
                .build();

        psuRepository.save(psuEntity);
    }
}

