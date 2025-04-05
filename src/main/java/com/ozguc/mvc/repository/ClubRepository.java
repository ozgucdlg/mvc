package com.ozguc.mvc.repository;

import com.ozguc.mvc.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClubRepository extends JpaRepository<Club, Integer> {
    Optional<Club> findByTitle(String title);
}
