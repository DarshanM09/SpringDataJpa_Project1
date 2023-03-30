package com.nit.sbJpa.Entity;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Dev_Student"	,uniqueConstraints = @UniqueConstraint(
		name="EmailId",
		columnNames ="EmailId" )
)

public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_id"

	)
	@SequenceGenerator(name = "student_id", sequenceName = "student_id", initialValue = 1

	)
	private int student_id;
	@Column(name = "Student_name",nullable = false)
	private String name;
	@Column(name = "Student_surname")
	private String surname;
	private String standard;
	private char Grade;
	private Double Fees_paid;

	private String EmailId;
	@CreationTimestamp
	private LocalDateTime dateCreated;

	@UpdateTimestamp
	private LocalDateTime lastUpdated;
	

	@Embedded
	private Gurdian gurdian;
	
	
}
