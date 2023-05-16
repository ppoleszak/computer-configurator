package com.poleszak.computerconfigurator.components.motherboard.controller;

import com.poleszak.computerconfigurator.components.cpu.controller.request.CpuCreateRequest;
import com.poleszak.computerconfigurator.components.motherboard.controller.request.MotherboardCreateRequest;
import com.poleszak.computerconfigurator.components.motherboard.service.MotherboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/motherboard")
@RequiredArgsConstructor
public class MotherboardController {

    private final MotherboardService motherboardService;

    @PostMapping
    public void createCpu(@RequestBody MotherboardCreateRequest motherboardCreateRequest) {
        motherboardService.create(motherboardCreateRequest);
    }
}
