package com.ozguc.mvc.service.abstracts;

import com.ozguc.mvc.dto.ClubDto;
import com.ozguc.mvc.model.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
    Club saveClub(Club club);
}
