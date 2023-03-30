package com.nit.sbJpa.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Builder
@Table(name = "Dev_Course", uniqueConstraints = @UniqueConstraint(name = "title", columnNames = "title"))
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CourseID_S")
	@SequenceGenerator(name = "CourseID_S", sequenceName = "CourseId", allocationSize =  1)
	private int CourseId;

	private String title;
	private int credit;

	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "CourseMaterialId",referencedColumnName = "CourseMaterialId")
	private CourseMaterial courseMaterial;

	@ManyToOne(cascade = CascadeType.ALL) // recommanded to use manytoone relation than one to many
	@JoinColumn(name = "teacherId", referencedColumnName = "teacherId")
	private Teacher teacher;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "StudentCourseMapping", joinColumns = @JoinColumn(name = "CourseId", referencedColumnName = "CourseId"), 
	                                      inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "student_id"))
	private List<Student> studentlist;

}
