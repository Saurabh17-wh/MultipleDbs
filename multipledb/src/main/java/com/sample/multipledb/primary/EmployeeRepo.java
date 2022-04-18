package com.sample.multipledb.primary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{
}
