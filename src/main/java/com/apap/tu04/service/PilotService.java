package com.apap.tu04.service;

import java.util.List;

import com.apap.tu04.model.PilotModel;

/**
 * PilotService
 */
public interface PilotService {
	PilotModel getPilotDetailByLicenseNumber(String id);
	void addPilot(PilotModel pilot);
	void deletePilot(String licenseNumber);
	List<PilotModel> getAllPilot();

}