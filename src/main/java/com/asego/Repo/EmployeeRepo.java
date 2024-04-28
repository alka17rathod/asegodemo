package com.asego.Repo;

import com.asego.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

    @Query("select e from Employee e where e.mailId=:mailId")
    public Employee getEmployeeByName(@Param("mailId") String mailId);

}
