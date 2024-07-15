package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("voter")
public class VoterDetails {

	@Value("${voter.id}")
	private int Id;
	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
	private int age;
	
	private Date dov;
	
	public VoterDetails()
	{
		System.out.println("VoterDetails:0-Param Constructor");
	}
	
	@PostConstruct
	public void myInit()
	{
		System.out.println("VoterDetails.myInit()");
		//initialize left over property
		dov= new Date();
		//check the wherther impoertant properties is injected with correct value or not
		if (name ==null|| age<=0)
		throw new IllegalArgumentException("Invalid name,age values");
	}
	
	@PreDestroy
	public void myDestory()
	{
		System.out.println("VoterDetails.myDestory()");
		name=null;
		age=0;
		dov=null;
	}
	
	//b.method
	public String checkVotionEligibility()
	{
		if(age<18)
			return "Mr/Mrs./Miss."+name+" u r not eligibile for votiong. verified on :"+dov;
		else
			return "Mr/Mrs./Miss."+name+" u r eligibile for votiong. verified on : "+dov;
	}
}
