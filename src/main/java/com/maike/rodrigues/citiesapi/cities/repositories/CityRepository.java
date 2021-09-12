package com.maike.rodrigues.citiesapi.cities.repositories;

import com.maike.rodrigues.citiesapi.cities.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
