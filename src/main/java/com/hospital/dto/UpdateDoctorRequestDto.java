package com.hospital.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateDoctorRequestDto {

    private String firstName;

    private String lastName;

    private Long phone;

    private String specialization;

    private String qualification;

    private Integer experienceYears;

    private Long departmentId;

    private BigDecimal consultationFee;
}