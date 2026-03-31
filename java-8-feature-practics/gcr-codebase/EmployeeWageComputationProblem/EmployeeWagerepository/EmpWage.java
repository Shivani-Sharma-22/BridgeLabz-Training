package EmployeeWagerepository;

import java.util.ArrayList;
import java.util.HashMap;   // ⭐ ADD THIS
import java.util.List;
import java.util.Map;

import EmployeeWagemodel.CompanyEmpWage;

public class EmpWage implements EmpWageRepository {

    private Map<String, CompanyEmpWage> companyStore;

    // ⭐ ADD CONSTRUCTOR
    public EmpWage() {
        companyStore = new HashMap<>();
    }

    @Override
    public void addCompany(CompanyEmpWage company) {
        companyStore.put(company.getCompanyName(), company);
    }

    @Override
    public CompanyEmpWage getCompany(String companyName) {
        return companyStore.get(companyName);
    }

    @Override
    public List<CompanyEmpWage> getAllCompanies() {
        return new ArrayList<>(companyStore.values());
    }

    @Override
    public void updateCompany(CompanyEmpWage company) {
        companyStore.put(company.getCompanyName(), company);
    }

    @Override
    public boolean exists(String companyName) {
        return companyStore.containsKey(companyName);
    }
}
