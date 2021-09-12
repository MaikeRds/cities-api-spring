package com.maike.rodrigues.app.cities.repositories;

import com.maike.rodrigues.app.cities.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
