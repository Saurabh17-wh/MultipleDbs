package com.sample.multipledb.primary;

import com.sample.multipledb.configuration.PrimaryDBConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeService
{
    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployees()
    {
        List<Employee> list = (List<Employee>) this.employeeRepo.findAll();
        return list;
    }

}
