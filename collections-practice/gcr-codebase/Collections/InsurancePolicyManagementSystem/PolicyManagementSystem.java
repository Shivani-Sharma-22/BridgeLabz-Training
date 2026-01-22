package InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.*;

public class PolicyManagementSystem {

    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();

    // Add Policy
    public void addPolicy(Policy p) {
        hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);
    }

    // 1. Display All Unique Policies
    public void displayAllPolicies() {
        System.out.println("All Policies:");
        hashSet.forEach(System.out::println);
    }

    // 2. Policies Expiring Within 30 Days
    public void expiringSoon() {
        System.out.println("\nPolicies expiring in next 30 days:");
        LocalDate today = LocalDate.now();

        for (Policy p : treeSet) {
            if (!p.getExpiryDate().isBefore(today) &&
                    p.getExpiryDate().isBefore(today.plusDays(30))) {
                System.out.println(p);
            }
        }
    }

    // 3. Policies by Coverage Type
    public void filterByCoverage(String type) {
        System.out.println("\nPolicies with coverage: " + type);

        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }

    // 4. Duplicate Policy Detection
    public void findDuplicates(List<Policy> policies) {
        Set<Integer> seen = new HashSet<>();
        System.out.println("\nDuplicate Policies:");

        for (Policy p : policies) {
            if (!seen.add(p.getPolicyNumber())) {
                System.out.println(p);
            }
        }
    }

    // 5. Performance Comparison
    public void performanceTest() {
        int n = 100000;

        List<Policy> policies = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            policies.add(new Policy(i, "User" + i,
                    LocalDate.now().plusDays(i % 365),
                    "Health", 5000));
        }

        testPerformance("HashSet", new HashSet<>(), policies);
        testPerformance("LinkedHashSet", new LinkedHashSet<>(), policies);
        testPerformance("TreeSet", new TreeSet<>(), policies);
    }

    private void testPerformance(String name, Set<Policy> set, List<Policy> list) {

        long start = System.currentTimeMillis();
        set.addAll(list);
        long addTime = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        set.contains(list.get(list.size() / 2));
        long searchTime = System.currentTimeMillis() - start;

        start = System.currentTimeMillis();
        set.remove(list.get(list.size() / 2));
        long removeTime = System.currentTimeMillis() - start;

        System.out.println("\n" + name + " Performance:");
        System.out.println("Add Time: " + addTime + " ms");
        System.out.println("Search Time: " + searchTime + " ms");
        System.out.println("Remove Time: " + removeTime + " ms");
    }


    public static void main(String[] args) {

        PolicyManagementSystem system = new PolicyManagementSystem();

        system.addPolicy(new Policy(101, "Amit",
                LocalDate.now().plusDays(10), "Health", 5000));

        system.addPolicy(new Policy(102, "Neha",
                LocalDate.now().plusDays(40), "Auto", 8000));

        system.addPolicy(new Policy(103, "Ravi",
                LocalDate.now().plusDays(20), "Home", 12000));

        system.displayAllPolicies();
        system.expiringSoon();
        system.filterByCoverage("Health");

        List<Policy> testDuplicates = Arrays.asList(
                new Policy(201, "A", LocalDate.now(), "Health", 5000),
                new Policy(202, "B", LocalDate.now(), "Auto", 6000),
                new Policy(201, "C", LocalDate.now(), "Home", 7000)
        );

        system.findDuplicates(testDuplicates);

        system.performanceTest();
    }
}

