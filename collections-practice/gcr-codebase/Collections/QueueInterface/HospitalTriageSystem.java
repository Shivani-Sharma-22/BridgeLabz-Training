package QueueInterface;

import java.util.*;
public class HospitalTriageSystem {
	public static void main(String[] args) {
		PriorityQueue<Patient> queue = new PriorityQueue<>(
	            (p1, p2) -> Integer.compare(p2.severity, p1.severity));
		Patient p1=new Patient("Shivani Sharma",4);
		Patient p2=new Patient("Ayush Gupta", 1);
		Patient p3=new Patient("Abhishek Gupta", 5);
		queue.add(p1);
		queue.add(p2);
		queue.add(p3);
		
		System.out.println("Triage order according queue is- ");
		while(!queue.isEmpty()) {
			Patient next=queue.poll();
			System.out.println(next.name+ ", Severity is- "+next.severity);
		}
	}
}

class Patient{
	String name;
	int severity;
	
	Patient(String name, int severity) {
        this.name=name;
        this.severity=severity;
    }
	
	@Override
	public String toString() {
		return "Name of patient- "+name+" and severity- "+severity;
	}

}
