package com.poleszak.computerconfigurator.components.cpu.controller;

import com.poleszak.computerconfigurator.components.cpu.controller.request.CpuCreateRequest;
import com.poleszak.computerconfigurator.components.cpu.service.CpuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cpu")
@RequiredArgsConstructor
public class CpuController {

    private final CpuService cpuService;

    @PostMapping
    public void createCpu(@RequestBody CpuCreateRequest cpuCreateRequest) {
        cpuService.create(cpuCreateRequest);
    }
}
