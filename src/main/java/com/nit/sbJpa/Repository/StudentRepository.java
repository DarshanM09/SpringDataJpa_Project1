package com.nit.sbJpa.Repository;

import com.nit.sbJpa.Entity.Student;

import java.util.List;

import org.hibernate.mapping.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {


    Student findByName(String name);

    final String GET_SUM_FEES="Select SUM(fees_paid) AS fees_sum from student;";

    @Query(value=GET_SUM_FEES,nativeQuery=true)
    double GetSumOfFees();

   

}
