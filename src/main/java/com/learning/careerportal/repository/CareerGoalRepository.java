package com.learning.careerportal.repository;

import com.learning.careerportal.entity.CareerGoal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CareerGoalRepository extends JpaRepository<CareerGoal, Long> {
}