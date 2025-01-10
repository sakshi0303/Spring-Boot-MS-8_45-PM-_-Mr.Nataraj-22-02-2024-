package com.nt.runners;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.AirtelCallerTune;
import com.nt.service.ICallerTuneMgmtService;


@Component
public class Version_TimeStampTestRunner implements CommandLineRunner {
	@Autowired
	private ICallerTuneMgmtService  tuneService;

	@Override
	public void run(String... args) throws Exception {
		/*AirtelCallerTune tune=new AirtelCallerTune("sami,sami", 99999999L, true, "office");
		String msg=tuneService.registerCallerTune(tune);
		System.out.println(msg);*/
		
		Optional<AirtelCallerTune> opt=tuneService.showCallerTuneById(1);
		if(opt.isPresent()) {
			System.out.println(opt.get());
			System.out.println("modified for"+opt.get().getUpdateCount()+"times ...created on "+opt.get().getOptedOn()+"....."+"lastly modified on::"+opt.get().getUpdatedOn());
		}
		else {
			System.out.println("Record not found");
		}
		
		String msg=tuneService.changeCallerTuneById(1, "papa-mere papa");
		System.out.println(msg);
		
		

	}

}
