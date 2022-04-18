package com.sample.multipledb;

import com.sample.multipledb.primary.Employee;
import com.sample.multipledb.primary.EmployeeRepo;
import com.sample.multipledb.primary.EmployeeService;
import com.sample.multipledb.secondary.Manager;
import com.sample.multipledb.secondary.ManagerRepo;
import com.sample.multipledb.secondary.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@ComponentScan(basePackages = "com.sample.multipledb")
@RestController
public class Controller
{
    @Autowired
    ManagerService managerService;

    @Autowired
    EmployeeService employeeService;

    /*@Autowired
    EmployeeRepo employeeRepo;

    @Autowired
    ManagerRepo managerRepo;*/

    @GetMapping("/primary/getall")
    public List<Employee> getPrimaryData()
    {
        List<Employee> list = this.employeeService.getAllEmployees();
        return list;
       /* List<Employee> list = (List<Employee>) this.employeeRepo.findAll();
        return list;*/
    }

    @GetMapping("/secondary/getall")
    public List<Manager> getSecondaryData()
    {
        List<Manager> list = this.managerService.getAllManagers();
        return list;
        /*List<Manager> list = (List<Manager>) this.managerRepo.findAll();
        return list;*/
    }
}
