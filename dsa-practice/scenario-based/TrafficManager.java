class Vehicle {
    int vehicleId;
    Vehicle next;

    Vehicle(int vehicleId) {
        this.vehicleId = vehicleId;
        this.next = null;
    }
}

class Roundabout{
	private Vehicle tail;
	
	//add vehicles
	public void addVehicle(int id) {
		Vehicle newVehicle = new Vehicle(id);
		
		if(tail == null) {
			tail = newVehicle;
			tail.next = tail;
		}else {
			newVehicle.next = tail.next;
			tail.next = newVehicle;
			tail = newVehicle;
		}
	}
	public void removeVehicle() {
		if(tail == null) {
			System.out.println("Roundabout is empty");
			return;
		}
		if(tail.next == null) {
			tail = null;
		}else {
			tail.next =tail.next.next;
		}
	}
	public void display() {
		if(tail == null) {
			System.out.println("No vehicles in roundabout");
			return;
		}
		Vehicle current = tail.next;
		 System.out.print("Roundabout: ");
	        do {
	            System.out.print(current.vehicleId + " -> ");
	            current = current.next;
	        } while (current != tail.next);
	        System.out.println("(back to start)");
	}
	
}
class VehicleQueue{
	private int[] queue;
	private int front = 0, rear = -1,size =0;
	
	VehicleQueue(int capacity) {
        queue = new int[capacity];
    }
	public void enqueue(int id) {
		if(size == queue.length) {
			System.out.println("Queue Overflow! Cannot add vehicle " + id);
            return;
		}
		rear = (rear + 1) % queue.length;
        queue[rear] = id;
        size++;
	}
	public int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow! No vehicles waiting");
            return -1;
        }
        int vehicle = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return vehicle;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

public class TrafficManager {
    public static void main(String[] args) {

        Roundabout roundabout = new Roundabout();
        VehicleQueue queue = new VehicleQueue(3);

        queue.enqueue(101);
        queue.enqueue(102);
        queue.enqueue(103);
        queue.enqueue(104); // Overflow

        if (!queue.isEmpty()) {
            roundabout.addVehicle(queue.dequeue());
            roundabout.addVehicle(queue.dequeue());
        }

        roundabout.display();

        roundabout.removeVehicle();
        roundabout.display();

        roundabout.addVehicle(queue.dequeue());
        roundabout.display();
    }
}

