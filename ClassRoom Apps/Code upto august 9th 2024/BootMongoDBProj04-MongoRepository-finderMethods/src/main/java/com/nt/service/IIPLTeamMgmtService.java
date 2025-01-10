package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.document.IPLTeam;

public interface IIPLTeamMgmtService {
    public  List<IPLTeam>  showTeamsByCities(List<String> cities);
    public   IPLTeam   showTeamByName(String name);
    public  List<IPLTeam> showTeamsByOwnerOrCoach(String owner,String coach);
}
