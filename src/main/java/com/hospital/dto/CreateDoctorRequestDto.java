package com.hospital.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateDoctorRequestDto {
	
	private Long userId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String phone;
	
	private String specialization;
	
	private String qualification;
	
	private int experienceYears;
	
	private String licenseNumber;
	
	private BigDecimal  consultationFee;
	
	private LocalDate joiningDate;	


}
