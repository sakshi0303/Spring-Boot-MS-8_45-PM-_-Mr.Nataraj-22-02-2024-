package com.nt.service;

import java.util.Optional;

import com.nt.entity.MarriageProfile;

public interface IMarriageProfileMgmtService {
   public   String registerMarriageProfile(MarriageProfile profile);
   public  Optional<MarriageProfile>  showProfileById(int id);
}
