package com.sample.multipledb.secondary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface ManagerRepo extends JpaRepository<Manager , Integer>
{
}
