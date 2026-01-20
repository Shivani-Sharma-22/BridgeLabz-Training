
class ParcelStage{
	String name;
	ParcelStage next;
	
	ParcelStage(String name){
		this.name = name;
		this.next = null;
	}
}
class ParcelTracker{
	ParcelStage head;
	
	
	//add stage
	void add(String name) {
		if(head == null) {
			head = new ParcelStage(name);
			return;
		}
		ParcelStage temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new ParcelStage(name);
	}
	// Add custom checkpoint in between
	void addCheckpoint(int position, String name) {
        ParcelStage newStage = new ParcelStage(name);

        if (position == 0) {
            newStage.next = head;
            head = newStage;
            return;
        }

        ParcelStage temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newStage.next = temp.next;
        temp.next = newStage;
    }
	// Track parcel forward
    void trackParcel() {
        if (head == null) {
            System.out.println("Parcel is missing or not yet packed");
            return;
        }

        ParcelStage temp = head;
        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        }
        System.out.println("Delivered");
    }
}
public class ParcelTrackerSystem {
	public static void main(String[] args) {
		ParcelTracker tracker = new ParcelTracker();

        tracker.add("Packed");
        tracker.add("Shipped");
        tracker.add("In Transit");

        // Add custom checkpoint
        tracker.addCheckpoint(2, "Warehouse Check");

        tracker.add("Delivered");

        tracker.trackParcel();
	}
}
