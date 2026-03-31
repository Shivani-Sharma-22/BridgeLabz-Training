
//super class
class Device{
	int deviceId;
	String status;
	
	public Device(int deviceId, String status) {
		this.deviceId = deviceId;
		this.status= status;
	}
	public void displayStatus() {
		System.out.println("deviceId: "+deviceId);
		System.out.println("Status: "+status);
	}
}
//sub-class

class Thermostat extends Device{
	double temperatureSetting;
	
	public Thermostat(int deviceId, String status,double temperatureSetting) {
		super(deviceId,status);
		this.temperatureSetting = temperatureSetting;
	}
	public void displayStatus() {
		super.displayStatus();
		System.out.println("TemperatureSetting: "+temperatureSetting);
	}
}
public class SmartHomeDevice2 {
	public static void main(String[] args) {
		Thermostat thermostat = new Thermostat(1234,"On",30.0);
		thermostat.displayStatus();
	}
}
