package com.poleszak.computerconfigurator.components.storage.repository;

import com.poleszak.computerconfigurator.components.storage.model.StorageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StorageRepository extends JpaRepository<StorageEntity, UUID> {
}
