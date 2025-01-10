package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.document.IPLTeam;

public interface IIPLTeamMgmtService {
   public  String   registerIPLTeam(IPLTeam team);
   public  String    registerTeams(List<IPLTeam> teams);
   public List<IPLTeam>  showAllTeams();
   public  IPLTeam  showTeamById(String id);
   public  List<IPLTeam>  showAllTeamsBySorted(boolean ascOrder,String ...props);
}
