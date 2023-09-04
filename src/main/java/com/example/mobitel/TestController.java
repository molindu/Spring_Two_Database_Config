package com.example.mobitel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.mobitel.primary.Employee;
import com.example.mobitel.primary.EmployeeRepository;
import com.example.mobitel.secondary.Manager;
import com.example.mobitel.secondary.ManagerRepository;

@RestController
public class TestController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ManagerRepository managerRepository;

    @RequestMapping(value="/primary", method=RequestMethod.GET)
    public List<Employee> getPrimaryDatabaseData() {
        List<Employee> list = employeeRepository.findAll();
        return list;
    }

    @RequestMapping(value="/secondary", method=RequestMethod.GET)
    public List<Manager> getSecondaryDatabaseData() {
        List<Manager> list = managerRepository.findAll();
        return list;
    }
}

