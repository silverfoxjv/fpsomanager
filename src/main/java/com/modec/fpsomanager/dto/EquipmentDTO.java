package com.modec.fpsomanager.dto;

import java.io.Serializable;

public class EquipmentDTO implements Serializable {

	private static final long serialVersionUID = -2372569383238092007L;

	private String name;

	private String code;

	private VesselDTO vessel;

	private String equipmentStatus;

	private String location;

	public EquipmentDTO() {
		super();
	}

	public EquipmentDTO(//
			final String name, //
			final String code, //
			final VesselDTO vessel, //
			final String equipmentStatus, //
			final String location) {
		super();
		this.name = name;
		this.code = code;
		this.vessel = vessel;
		this.equipmentStatus = equipmentStatus;
		this.location = location;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(final String code) {
		this.code = code;
	}

	public VesselDTO getVessel() {
		return this.vessel;
	}

	public void setVessel(final VesselDTO vessel) {
		this.vessel = vessel;
	}

	public String getEquipmentStatus() {
		return this.equipmentStatus;
	}

	public void setEquipmentStatus(final String equipmentStatus) {
		this.equipmentStatus = equipmentStatus;
	}

	@Override
	public String toString() {
		return String.format(//
				"EquipmentDTO [name=%s, code=%s, vessel=%s, equipmentStatus=%s, location=%s]", //
				this.name, //
				this.code, //
				this.vessel, //
				this.equipmentStatus, //
				this.location);
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(final String location) {
		this.location = location;
	}

}
