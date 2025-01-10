package com.nt.service;

import java.util.Optional;

import com.nt.entity.AirtelCallerTune;

public interface ICallerTuneMgmtService {
   public   String   registerCallerTune(AirtelCallerTune tune);
   public   Optional<AirtelCallerTune>  showCallerTuneById(int id);
   public   String     changeCallerTuneById(int tuneId,String newTune);
}
