package com.sarah_rodrigues.harmony.repository;

import com.sarah_rodrigues.harmony.model.Musicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Musicosrepository extends JpaRepository<Musicos, Long> {
}
