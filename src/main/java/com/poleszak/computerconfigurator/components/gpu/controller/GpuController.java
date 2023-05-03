package com.poleszak.computerconfigurator.components.gpu.controller;

import com.poleszak.computerconfigurator.components.gpu.controller.request.GpuCreateRequest;
import com.poleszak.computerconfigurator.components.gpu.service.GpuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/gpu")
@RequiredArgsConstructor
public class GpuController {

    private final GpuService gpuService;

    @PostMapping
    public void createCpu(@RequestBody GpuCreateRequest gpuCreateRequest) {
        gpuService.create(gpuCreateRequest);
    }
}
