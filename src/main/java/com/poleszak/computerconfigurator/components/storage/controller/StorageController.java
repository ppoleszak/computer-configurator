package com.poleszak.computerconfigurator.components.storage.controller;

import com.poleszak.computerconfigurator.components.storage.service.StorageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StorageController {

    private final StorageService storageService;
}
