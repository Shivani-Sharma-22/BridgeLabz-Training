package linkedList;
import java.time.LocalDateTime;

class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    LocalDateTime bookingTime;
    Ticket next;

    Ticket(int ticketId, String customerName, String movieName,
           String seatNumber, LocalDateTime bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    private Ticket head = null;
    private Ticket tail = null;

    // 1. Add ticket at end
    public void addTicket(int id, String customer, String movie,
                          String seat, LocalDateTime time) {
        Ticket newTicket = new Ticket(id, customer, movie, seat, time);

        if (head == null) {
            head = tail = newTicket;
            tail.next = head;
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;
        }
        System.out.println("Ticket booked successfully!");
    }

    // 2. Remove ticket by Ticket ID
    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        Ticket current = head;
        Ticket prev = tail;

        do {
            if (current.ticketId == ticketId) {

                // If only one ticket
                if (current == head && current == tail) {
                    head = tail = null;
                }
                // If head ticket
                else if (current == head) {
                    head = head.next;
                    tail.next = head;
                }
                // If tail ticket
                else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                }
                // Middle ticket
                else {
                    prev.next = current.next;
                }

                System.out.println("Ticket removed successfully.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        System.out.println("Ticket ID not found.");
    }

    // 3. Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket temp = head;
        System.out.println("\nBooked Tickets:");
        do {
            System.out.println("Ticket ID: " + temp.ticketId +
                    ", Customer: " + temp.customerName +
                    ", Movie: " + temp.movieName +
                    ", Seat: " + temp.seatNumber +
                    ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // 4. Search by Customer or Movie
    public void searchTicket(String keyword) {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        Ticket temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(keyword) ||
                temp.movieName.equalsIgnoreCase(keyword)) {

                System.out.println("Ticket Found → ID: " + temp.ticketId +
                        ", Customer: " + temp.customerName +
                        ", Movie: " + temp.movieName +
                        ", Seat: " + temp.seatNumber);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No matching ticket found.");
    }

    // 5. Count total tickets
    public int countTickets() {
        if (head == null) return 0;

        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(101, "Shivani", "Inception", "A12", LocalDateTime.now());
        system.addTicket(102, "Aman", "Avatar", "B10", LocalDateTime.now());
        system.addTicket(103, "Neha", "Inception", "C05", LocalDateTime.now());

        system.displayTickets();

        system.searchTicket("Inception");

        system.removeTicket(102);

        system.displayTickets();

        System.out.println("Total Tickets Booked: " + system.countTickets());
    }
}
