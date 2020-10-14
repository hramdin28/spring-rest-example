package com.hanish.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hanish.model.ThemeParkRide;

@Repository
public interface ThemeParkRideRepository extends JpaRepository<ThemeParkRide, Long> {
	List<ThemeParkRide> findByName(String name);
}
