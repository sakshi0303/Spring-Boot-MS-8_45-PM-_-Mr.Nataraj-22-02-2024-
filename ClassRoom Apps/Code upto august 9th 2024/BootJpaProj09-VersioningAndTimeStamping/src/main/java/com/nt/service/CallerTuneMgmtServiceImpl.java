package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.AirtelCallerTune;
import com.nt.repository.IAirtelCallerTuneRepository;

@Service("callTuneService")
public class CallerTuneMgmtServiceImpl implements ICallerTuneMgmtService {
	@Autowired
	private IAirtelCallerTuneRepository  callerTuneRepo;

	@Override
	public String registerCallerTune(AirtelCallerTune tune) {
		int idVal=callerTuneRepo.save(tune).getTuneId();
		return "CallerTune is registered with the idValue :"+idVal;
	}
	
	@Override
	public Optional<AirtelCallerTune> showCallerTuneById(int id) {
		return callerTuneRepo.findById(id);
	}
	
	@Override
	public String changeCallerTuneById(int tuneId, String newTune) {
		Optional<AirtelCallerTune> opt=callerTuneRepo.findById(tuneId);
		if(opt.isPresent()) {
			AirtelCallerTune tune=opt.get();
			tune.setTuneName(newTune);
			AirtelCallerTune tune1=callerTuneRepo.save(tune);
			return  tuneId+"  tune is  modified for "+tune1.getUpdateCount()+"times..  on "+tune1.getUpdatedOn()+"  created on::"+tune1.getOptedOn();
		}
		else {
		return tuneId+"  id   Tune is not found";
		}
	}

}
