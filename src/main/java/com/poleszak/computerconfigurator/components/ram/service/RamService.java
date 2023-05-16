package com.poleszak.computerconfigurator.components.ram.service;

import com.poleszak.computerconfigurator.components.ram.repository.RamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RamService {

    private final RamRepository ramRepository;
}
