package com.poleszak.computerconfigurator.components.gpu.repository;

import com.poleszak.computerconfigurator.components.gpu.model.GpuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GpuRepository extends JpaRepository<GpuEntity, UUID> {
}
