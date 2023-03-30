package com.nit.sbJpa.Entity;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
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

@Table(name = "Dev_CourseMaterial")
public class CourseMaterial {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="CourseMaterialId" )
	@SequenceGenerator(name = "CourseMaterialId",sequenceName = "CourseMaterialId",allocationSize  = 1)

	private int CourseMaterialId;
	private String Url;
	
	
	

}
