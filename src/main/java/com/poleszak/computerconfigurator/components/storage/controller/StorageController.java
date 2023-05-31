package com.poleszak.computerconfigurator.components.storage.controller;

import com.poleszak.computerconfigurator.components.storage.controller.request.StorageCreateRequest;
import com.poleszak.computerconfigurator.components.storage.service.StorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/storage")
@RequiredArgsConstructor
public class StorageController {

    private final StorageService storageService;

    @PostMapping
    public void createCpu(@RequestBody StorageCreateRequest storageCreateRequest) {
        storageService.create(storageCreateRequest);
    }
}
