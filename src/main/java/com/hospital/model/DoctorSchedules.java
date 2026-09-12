package com.hospital.model;

import java.io.ObjectInputFilter.Status;
import java.time.DayOfWeek;
import java.time.LocalTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "docyorSchedules")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorSchedules {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "scheduled_id")
	private int scheduledId;
	
	@Column(name = "doctor_id")
	private int doctorId;
	
	@Column(name = "day_of_week")
	@Enumerated(EnumType.STRING)
	private DayOfWeek dayOfWeek;
	
	@Column(name = "schedule_start_time")
	private LocalTime startTime;
	
	@Column(name = "schedule_end_time")
	private LocalTime endTime;
	
	@Column(name = "break_start_time")
	private LocalTime breakStartTime;
	
	@Column(name = "break_end_time")
	private LocalTime breakEndTime;
	
	@Column(name = "doctor_status")
	@Enumerated(EnumType.STRING)
	private Status status;
		
/*  @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doctor-id", nullable = false)
    private Doctor doctor;
    
  Doctor Class unteyney iyy mapping work chesthundhi,Iyy Mapping Code Rasukunnaka tarvatha kintha constructor loh Doctor field Add chesukovalii.
 
 */

	public DoctorSchedules(int doctorId, DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime,
			LocalTime breakStartTime, LocalTime breakEndTime, Status status) {
		super();
		this.doctorId = doctorId;
		this.dayOfWeek = dayOfWeek;
		this.startTime = startTime;
		this.endTime = endTime;
		this.breakStartTime = breakStartTime;
		this.breakEndTime = breakEndTime;
		this.status = status;
	}

}
