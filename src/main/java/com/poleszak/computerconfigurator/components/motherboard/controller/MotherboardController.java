package com.poleszak.computerconfigurator.components.motherboard.controller;

import com.poleszak.computerconfigurator.components.motherboard.service.MotherboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MotherboardController {

    private final MotherboardService motherboardService;
}
