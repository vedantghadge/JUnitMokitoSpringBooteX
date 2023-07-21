package com.csi.service;


import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl {


    @Autowired
    EmployeeDaoImpl employeeDaoImpl;

    public Employee saveData(Employee employee) {

        return employeeDaoImpl.saveData(employee);
    }

    public List<Employee> getAllData() {

        return employeeDaoImpl.getAllData();
    }

    public Employee updataData(Employee employee) {
        return employeeDaoImpl.updataData(employee);
    }

    public void deleteDataById(int empId) {
        employeeDaoImpl.deleteDataById(empId);
    }
    /*public void getdatabyname(String empName){
        employeeDaoImpl.getdatabyname(empName);
    }
*/
}
