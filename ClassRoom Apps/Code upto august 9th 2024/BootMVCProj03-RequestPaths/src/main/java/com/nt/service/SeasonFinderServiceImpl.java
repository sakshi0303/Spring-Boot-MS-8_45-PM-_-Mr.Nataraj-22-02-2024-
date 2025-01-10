package com.nt.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service("sf")
public class SeasonFinderServiceImpl implements ISeasonFinderService {


	@Override
	public String findSeason() {
	   //get System date and time
		 LocalDate ld=LocalDate.now();
		//get current month of the year
		 int  month=ld.getMonthValue();
		 //return the season name
		 if(month>=6 && month<=9)
			 return  "rainy  Season";
		 else if(month>=3 && month<=5)
			 return "summer  season";
		 else
		return "winter season";
	}

}
