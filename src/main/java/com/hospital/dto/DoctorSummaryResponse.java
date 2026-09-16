package com.hospital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorSummaryResponse {

    private Long doctorId;
    private String firstName;
    private String lastName;
    private String specialization;
    private Long departmentId;
    private String availabilityStatus;
}
