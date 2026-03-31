import java.time.LocalDate;
import java.util.*;

class Member {
    private String name;
    private LocalDate expiryDate;

    public Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return name + " | Expiry Date: " + expiryDate;
    }
}

public class ExpiringMemberships {
    public static void main(String[] args) {

        List<Member> members = List.of(
            new Member("Shivani", LocalDate.now().plusDays(10)),
            new Member("Aman", LocalDate.now().plusDays(45)),
            new Member("Riya", LocalDate.now().plusDays(25))
        );

        members.stream()
               .filter(member ->
                   member.getExpiryDate().isBefore(LocalDate.now().plusDays(30)))
               .forEach(System.out::println);
    }
}
