package com.poleszak.computerconfigurator.components.psu.controller;

import com.poleszak.computerconfigurator.components.psu.service.PsuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PsuController {

    private final PsuService psuService;

}
