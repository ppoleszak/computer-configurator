package com.poleszak.computerconfigurator.components.storage.service;

import com.poleszak.computerconfigurator.components.storage.controller.request.StorageCreateRequest;
import com.poleszak.computerconfigurator.components.storage.model.StorageEntity;
import com.poleszak.computerconfigurator.components.storage.repository.StorageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StorageService {

    private final StorageRepository storageRepository;

    public void create(StorageCreateRequest request) {
        StorageEntity storageEntity = StorageEntity.builder()
                .name(request.name())
                .productCode(request.productCode())
                .capacity(request.capacity())
                .format(request.format())
                .interfaceType(request.interfaceType())
                .readSpeed(request.readSpeed())
                .writeSpeed(request.writeSpeed())
                .randomRead(request.randomRead())
                .randomWrite(request.randomWrite())
                .memoryType(request.memoryType())
                .mtbf(request.mtbf())
                .radiator(request.radiator())
                .additionalInformation(request.additionalInformation())
                .color(request.color())
                .warranty(request.warranty())
                .released(request.released())
                .build();

        storageRepository.save(storageEntity);
    }
}
