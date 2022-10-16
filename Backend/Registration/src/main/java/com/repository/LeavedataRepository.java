package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Leavedata;


@Repository
public interface LeavedataRepository extends JpaRepository<Leavedata, Integer> {

}
