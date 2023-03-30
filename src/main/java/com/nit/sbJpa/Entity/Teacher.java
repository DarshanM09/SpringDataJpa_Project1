package com.nit.sbJpa.Entity;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Dev_teacher")
public class Teacher {

	@Id
	@SequenceGenerator(name = "teacherId",sequenceName = "teacherId",initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "teacherId")
	private int teacherId;
	private String firstName;
	private String lastName;
	
	
	
	
}
