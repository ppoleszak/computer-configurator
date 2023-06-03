package com.poleszak.computerconfigurator.configurator.service;

import com.poleszak.computerconfigurator.components.cpu.repository.CpuRepository;
import com.poleszak.computerconfigurator.components.gpu.repository.GpuRepository;
import com.poleszak.computerconfigurator.components.motherboard.repository.MotherboardRepository;
import com.poleszak.computerconfigurator.components.psu.repository.PsuRepository;
import com.poleszak.computerconfigurator.components.ram.repository.RamRepository;
import com.poleszak.computerconfigurator.components.storage.repository.StorageRepository;
import com.poleszak.computerconfigurator.configurator.model.request.ComputerConfiguratorResponse;
import com.poleszak.computerconfigurator.configurator.model.response.ComputerConfiguratorRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ComputerConfigurationService {

    private final GpuRepository gpuRepository;
    private final CpuRepository cpuRepository;
    private final RamRepository ramRepository;
    private final StorageRepository storageRepository;
    private final PsuRepository psuRepository;
    private final MotherboardRepository motherboardRepository;


    public ComputerConfiguratorResponse configure(ComputerConfiguratorRequest computerConfiguratorRequest) {

        return null;
    }
}