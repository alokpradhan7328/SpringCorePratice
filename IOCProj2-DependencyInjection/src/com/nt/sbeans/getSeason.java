package com.nt.sbeans;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class getSeason {

	@Autowired
	private LocalDate currentDate;//Has-A Property
	
	public getSeason() {
		System.out.println("getSeason:0-Param Constructor");
	}
	
	public String showSeasos(String user) {
		int mon= currentDate.getMonthValue();
		switch(mon) {
		case 12:
		case 1:
		case 2:
			return user+" Current Season is: Winter ";
		case 3:
		case 4:
		case 5:
			return user+" Current Season is: Spring ";
		case 6:
		case 7:
		case 8:
			return user+" Current Season is: Summer ";
		case 9:
		case 10:
		case 11:
			return user+" Current Season is: Autmun ";
		default:
			return user+" Unknown Season ";
		}
	}
	
	public String showWeekDays(String user) {
		int day=currentDate.getDayOfMonth();
		switch (day)
		{
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			return user+" is WeekDays";
		case 5:
		case 6:
			return user+ " is WeekEnds";
		default:
			return "Unknown Days";	
		}
		
	}
	
}
