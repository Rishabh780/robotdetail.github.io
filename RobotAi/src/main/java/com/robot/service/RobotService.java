package com.robot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robot.Repository.RobotRepository;
import com.robot.entitiy.Robot;



@Service
public class RobotService {
	
	
	
	@Autowired(required = false)
	private RobotRepository rbpo;
	
	public void save(Robot r)
	{
		rbpo.save(r);
	}
	
	
	
	
	
	

}
