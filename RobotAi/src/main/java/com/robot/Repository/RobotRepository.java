package com.robot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robot.entitiy.Robot;

@Repository
public interface RobotRepository  extends JpaRepository<Robot, Integer>{

}
