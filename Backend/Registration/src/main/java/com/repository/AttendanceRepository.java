package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Attendance;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {

}
