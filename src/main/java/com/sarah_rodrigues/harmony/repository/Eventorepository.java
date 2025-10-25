package com.sarah_rodrigues.harmony.repository;

import com.sarah_rodrigues.harmony.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Eventorepository extends JpaRepository<Evento, Long> {
}
