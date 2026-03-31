package InsaurancePolicyUsingMap;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicySystem {

    private Map<Integer, Policy> hashMap = new HashMap<>();
    private Map<Integer, Policy> linkedHashMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, Policy> treeMap = new TreeMap<>();

    // Add policy
    public void addPolicy(Policy p) {
        hashMap.put(p.getPolicyNumber(), p);
        linkedHashMap.put(p.getPolicyNumber(), p);
        treeMap.put(p.getExpiryDate(), p);
    }

    // Retrieve by policy number
    public void getPolicy(int number) {
        System.out.println("\nPolicy Details:");
        System.out.println(hashMap.get(number));
    }

    // Policies expiring within 30 days
    public void policiesExpiringSoon() {
        System.out.println("\nPolicies expiring in next 30 days:");
        LocalDate today = LocalDate.now();

        for (Map.Entry<LocalDate, Policy> entry : treeMap.entrySet()) {
            if (!entry.getKey().isBefore(today) &&
                    entry.getKey().isBefore(today.plusDays(30))) {
                System.out.println(entry.getValue());
            }
        }
    }

    // Policies by policyholder
    public void policiesByHolder(String name) {
        System.out.println("\nPolicies of " + name + ":");
        for (Policy p : hashMap.values()) {
            if (p.getPolicyHolderName().equalsIgnoreCase(name)) {
                System.out.println(p);
            }
        }
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        hashMap.values().removeIf(p -> p.getExpiryDate().isBefore(today));
        linkedHashMap.values().removeIf(p -> p.getExpiryDate().isBefore(today));
        treeMap.headMap(today).clear();
    }

    public static void main(String[] args) {

        InsurancePolicySystem system = new InsurancePolicySystem();

        system.addPolicy(new Policy(101, "Amit",
                LocalDate.now().plusDays(10), "Health", 5000));

        system.addPolicy(new Policy(102, "Somya",
                LocalDate.now().plusDays(40), "Auto", 8000));

        system.addPolicy(new Policy(103, "Dev",
                LocalDate.now().plusDays(20), "Home", 12000));

        system.getPolicy(101);
        system.policiesExpiringSoon();
        system.policiesByHolder("Amit");
    }
}

