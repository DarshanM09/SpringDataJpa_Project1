package com.nit.sbJpa.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    private int student_id;
    private String name;
    private String surname;
    private String standard;
    private char Grade;
    private Double Fees_paid;



}
