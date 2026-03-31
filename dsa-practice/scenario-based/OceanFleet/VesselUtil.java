package OceanFleet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class VesselUtil {
	private List<Vessel> vesselList=new ArrayList<>();

	public List<Vessel> getVesselList() {
		return vesselList;
	}

	public void setVesselList(List<Vessel> vesselList) {
		this.vesselList = vesselList;
	}
	public void addVesselPerformance(Vessel vessel) {
		vesselList.add(vessel);
	}
	public Vessel getVesselById(String vesselId) {
		for(Vessel v:vesselList) {
			if(v.getVesselId().equals(vesselId)) {
				return v;
			}
		}
		return null;
		
	}
	public List<Vessel> getHighPerformanceVessels(){
		
		List<Vessel> highest = new ArrayList<>();
		
		if(vesselList == null && vesselList.isEmpty()) {
			return highest;
		}
		
		//find highest speed 
		double maxSpeed = vesselList.get(0).getAverageSpeed();
		for(Vessel v:vesselList) {
			if(maxSpeed < v.getAverageSpeed()) {
				maxSpeed = v.getAverageSpeed();
			}
		}
		for(Vessel v:vesselList) {
			if(v.getAverageSpeed() == maxSpeed) {
				highest.add(v);
			}
		}
		return highest;
	}
}
