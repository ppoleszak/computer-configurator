package com.poleszak.computerconfigurator.components.cpu.repository;

import com.poleszak.computerconfigurator.components.cpu.model.CpuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CpuRepository extends JpaRepository<CpuEntity, UUID> {
}
