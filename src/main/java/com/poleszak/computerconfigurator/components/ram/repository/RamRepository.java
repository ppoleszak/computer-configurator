package com.poleszak.computerconfigurator.components.ram.repository;

import com.poleszak.computerconfigurator.components.ram.model.RamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RamRepository extends JpaRepository<RamEntity, UUID> {
}
