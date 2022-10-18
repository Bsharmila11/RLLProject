package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.bean.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {
	@Query("select s.task from Schedule s where eid=:eid")
	 public String findScheduleById(int eid);
}
