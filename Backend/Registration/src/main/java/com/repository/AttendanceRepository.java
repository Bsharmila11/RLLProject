package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bean.Attendance;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {
	@Query("select s.status from Attendance s where eid=:eid")
    public String findAttendanceById(int eid);
   
}
