package com.poleszak.computerconfigurator.components.psu.repository;

import com.poleszak.computerconfigurator.components.psu.model.PsuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PsuRepository extends JpaRepository<PsuEntity, UUID> {
}
