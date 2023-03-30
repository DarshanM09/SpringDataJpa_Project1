package com.nit.sbJpa.Entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@AttributeOverrides({
	
	@AttributeOverride(name = "name",column = @Column (name="gurdian_name")),
	@AttributeOverride(name = "Email",column = @Column (name= "gurdian_email")),
	@AttributeOverride(name = "MobileNumber",column = @Column (name= "mobile_number")),
}
		)
public class Gurdian {

	private String name;
	private String Email;
	private String MobileNumber;
	
	
}
