package com.hospital.dto;

import java.io.ObjectInputFilter.Status;
import java.time.DayOfWeek;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateDoctorScheduleRequest {

    private DayOfWeek dayOfWeek;
    
    private LocalTime startTime;
    
    private LocalTime endTime;
    
    private LocalTime breakStartTime;
    
    private LocalTime breakEndTime;
    
    private Status status;
}