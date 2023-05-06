package com.poleszak.computerconfigurator.components.motherboard.repository;

import com.poleszak.computerconfigurator.components.motherboard.model.MotherboardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MotherboardRepository extends JpaRepository<MotherboardEntity, UUID> {
}
