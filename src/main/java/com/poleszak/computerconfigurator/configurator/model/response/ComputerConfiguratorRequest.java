package com.poleszak.computerconfigurator.configurator.model.response;

import com.poleszak.computerconfigurator.components.cpu.model.CpuEntity;
import com.poleszak.computerconfigurator.components.gpu.model.GpuEntity;
import com.poleszak.computerconfigurator.components.motherboard.model.MotherboardEntity;
import com.poleszak.computerconfigurator.components.psu.model.PsuEntity;
import com.poleszak.computerconfigurator.components.ram.model.RamEntity;
import com.poleszak.computerconfigurator.components.storage.model.StorageEntity;

public record ComputerConfiguratorRequest(
        CpuEntity cpuEntity,
        GpuEntity gpuEntity,
        MotherboardEntity motherboard,
        StorageEntity storageEntity,
        RamEntity ramEntity,
        PsuEntity psuEntity
) {
}
