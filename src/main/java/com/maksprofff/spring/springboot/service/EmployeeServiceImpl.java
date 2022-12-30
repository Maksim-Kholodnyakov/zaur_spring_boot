package com.maksprofff.spring.springboot.service;


import com.maksprofff.spring.springboot.dao.EmployeeDAOImpl;
import com.maksprofff.spring.springboot.entity.Employee;
import jakarta.transaction.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDAOImpl employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

//    @Override
//    @Transactional
//    public void saveEmployee(Employee employee) {
//        employeeDAO.saveEmployee(employee);
//    }
//
//    @Override
//    @Transactional
//    public Employee getEmployee(int id) {
//        return employeeDAO.getEmployee(id);
//    }
//
//    @Override
//    @Transactional
//    public void deleteEmployee(int id) {
//        employeeDAO.deleteEmployee(id);
//    }
}
