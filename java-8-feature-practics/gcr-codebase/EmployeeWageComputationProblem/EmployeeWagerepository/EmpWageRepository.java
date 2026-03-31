package EmployeeWagerepository;


import EmployeeWagemodel.CompanyEmpWage;

import java.util.List;

public interface EmpWageRepository {

    void addCompany(CompanyEmpWage company);

    CompanyEmpWage getCompany(String companyName);

    List<CompanyEmpWage> getAllCompanies();

    void updateCompany(CompanyEmpWage company);

    boolean exists(String companyName);
}

