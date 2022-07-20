package com.Inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue(value="C_Emp")
public class ContractorEmployee extends Employee {
	
	@Column(name="DurationInHour")
	private int duration;
	
	@Column(name="PerHourRate")
	private int payPerHour;
}
