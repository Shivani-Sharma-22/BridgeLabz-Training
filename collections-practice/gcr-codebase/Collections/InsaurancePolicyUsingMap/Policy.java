package InsaurancePolicyUsingMap;

import java.time.LocalDate;

public class Policy {
    private int policyNumber;
    private String policyHolderName;
    private LocalDate expiryDate;
    private String coverageType;
    private double premium;

    public Policy(int policyNumber, String policyHolderName,
                  LocalDate expiryDate, String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyHolderName + " | "
                + expiryDate + " | " + coverageType + " | " + premium;
    }
}
