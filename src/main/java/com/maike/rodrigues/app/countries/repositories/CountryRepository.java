package com.maike.rodrigues.app.countries.repositories;

import com.maike.rodrigues.app.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
