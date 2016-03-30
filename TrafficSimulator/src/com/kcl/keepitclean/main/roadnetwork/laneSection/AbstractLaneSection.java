package com.kcl.keepitclean.main.roadnetwork.laneSection;

import com.kcl.keepitclean.main.vehicle.Vehicle;


/**
 * 
 * @author igalna
 *	
 * Default Implementation for checking if there is a vehicle currently on the section of lane.
 * 
 * also for moving Vehicles on and off the section.
 *
 */
public abstract class AbstractLaneSection implements LaneSection {

	// In any direction a lane can either be open or closed
	final private boolean CLOSED = false;
	final private boolean OPEN = true;
	private int junctionGridIndex = 0;
	

	private Vehicle vehicleOnSection;
	
	@Override
	public boolean hasVehicleOnSeciton() {
		if (vehicleOnSection != null) {
			return true;
		}
		else
			return false;
	}
	
	public boolean getOpen() {
		return OPEN;
	}
	
	public boolean getClosed() {
		return CLOSED;
	}
	
	@Override
	public void putVehicleOnSection (Vehicle vehicle) {
		this.vehicleOnSection = vehicle;
	}
	
	@Override
	public void removeVehicleFromSection() {
		this.vehicleOnSection = null;
	}

	public Vehicle getVehicle() {
		return vehicleOnSection;
	}

	public int getJunctionGridIndex() {
		return junctionGridIndex;
	}

	public void setJunctionGridIndex(int junctionGridIndex) {
		this.junctionGridIndex = junctionGridIndex;
	}
}
