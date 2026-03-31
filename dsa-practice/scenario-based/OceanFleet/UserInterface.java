package OceanFleet;
import java.util.*;
public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VesselUtil vessel = new VesselUtil();
		System.out.println("Enter the vessel to be added...");
		int count = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter vessel details- ");
		for(int i =0;i<count;i++) {
        String in =sc.nextLine();
        
        String[] details= in.split(":");
        String vesselId =details[0];
        String vesselName =details[1];
        String vesselType = details[3];
        double avgSpeed =Double.parseDouble(details[2]);
        Vessel v = new Vessel(vesselId,vesselName,avgSpeed,vesselType);
        vessel.addVesselPerformance(v);
		}
        
        System.out.println("Enter the vessel Id to search");
        String searchId = sc.next();
        
        Vessel found = vessel.getVesselById(searchId);
        if(found != null) {
        	System.out.println(found.getVesselId()+" | "
        +found.getVesselName()+ " | "
        +found.getAverageSpeed()+" | "+
        found.getVesselType());
        }
        else {
        	System.out.println("search id"+ searchId+" not found");
        }
        System.out.println("High Performance Vessel are");
        
        List<Vessel> highest = vessel.getHighPerformanceVessels();
        for(Vessel ve:highest) {
        	System.out.println(ve.getVesselId()+" | "+
        ve.getVesselName()+" | "+
        			ve.getAverageSpeed()+" | "+
        ve.getVesselType());
        }
	}
}
