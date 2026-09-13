package com.hospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.model.DoctorSchedules;

public interface DoctorScheduleRepository extends JpaRepository<DoctorSchedules, Integer> {

}
