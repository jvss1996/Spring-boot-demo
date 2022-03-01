package com.example.Springboot.demo.repository;

import com.example.Springboot.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    // find department by name
    public Department findByDepartmentName(String departmentName);

    // find department by name ignoring case
    public Department findByDepartmentNameIgnoreCase(String departmentName);
}
