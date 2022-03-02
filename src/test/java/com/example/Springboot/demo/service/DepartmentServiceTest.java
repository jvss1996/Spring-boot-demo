package com.example.Springboot.demo.service;

import com.example.Springboot.demo.entity.Department;
import com.example.Springboot.demo.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department = Department.builder().departmentName("ComputerScience").departmentId(1L).departmentAddress("Houston").departmentCode("CS").build();
        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("ComputerScience")).thenReturn(department);
    }

    @Test
    @DisplayName("Get Data based on valid on Department Name")
    public void whenValidDepartmentName_thenDepartmentShouldFound() {
        String departmentName = "ComputerScience";
        Department found = departmentService.fetchDepartmentByName(departmentName);
        assertEquals(departmentName, found.getDepartmentName());
    }
}