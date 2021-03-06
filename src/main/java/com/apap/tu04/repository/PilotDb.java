package com.apap.tu04.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apap.tu04.model.PilotModel;
import org.springframework.stereotype.Repository;

/**
 * PilotDb
 */
@Repository
public interface PilotDb extends JpaRepository<PilotModel, Long> {
	PilotModel findByLicenseNumber(String licenseNumber);
}