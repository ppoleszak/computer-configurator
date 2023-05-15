package com.poleszak.computerconfigurator.configurator.controller;

import com.poleszak.computerconfigurator.configurator.service.ComputerConfigurationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ComputerConfigurationController {

    private final ComputerConfigurationService computerConfigurationService;
}
