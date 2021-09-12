package com.maike.rodrigues.citiesapi.countries.repositories;

import com.maike.rodrigues.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
