package com.poleszak.computerconfigurator.components.ram.controller;

import com.poleszak.computerconfigurator.components.ram.controller.request.RamCreateRequest;
import com.poleszak.computerconfigurator.components.ram.service.RamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ram")
@RequiredArgsConstructor
public class RamController {

    private final RamService ramService;

    @PostMapping
    public void createCpu(@RequestBody RamCreateRequest ramCreateRequest) {
        ramService.create(ramCreateRequest);
    }
}
