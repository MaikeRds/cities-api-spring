package com.maike.rodrigues.app.staties.repositories;

import com.maike.rodrigues.app.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
