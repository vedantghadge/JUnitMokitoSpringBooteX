package com.csi.dao.test;


import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeDaoImplTest {

    @Autowired
    EmployeeDaoImpl employeeDaoImpl;

    @MockBean
    EmployeeRepo employeeRepoImpl;

    @Test
    public void getAllDataTest() {

        Mockito.when(employeeRepoImpl.findAll()).thenReturn(Stream.of(new Employee(121, "swara", "india", 50000),
                new Employee(122, "suraj", "pakistan", 80000),
                new Employee(123, "laxmi", "japan", 60000)
        ).collect(Collectors.toList()));


        Assert.assertEquals(3, employeeDaoImpl.getAllData().size());
    }

    @Test
    public void savedataTest() {

        Employee employee = new Employee(121, "swara", "pune", 50000);
        employeeDaoImpl.saveData(employee);

        Mockito.verify(employeeRepoImpl, Mockito.times(1)).save(employee);
    }

    @Test
    public void updatedataTest() {

        Employee employee = new Employee(125, "suraj", "pakistan", 60000);
        employeeDaoImpl.updataData(employee);

        Mockito.verify(employeeRepoImpl, Mockito.times(1)).save(employee);
    }

    @Test
    public void deletedataTest() {

        Employee employee = new Employee(125, "suraj", "pakistan", 60000);
        employeeDaoImpl.deleteDataById(employee.getEmpId());

        Mockito.verify(employeeRepoImpl, Mockito.times(1)).deleteById(employee.getEmpId());

    }
}
