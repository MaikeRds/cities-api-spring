package com.maike.rodrigues.app.cities.services;

import com.maike.rodrigues.app.cities.entities.City;
import com.maike.rodrigues.app.cities.repositories.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CityService {

    private CityRepository cityRepository;

    public List<City> findAll() {
        return cityRepository.findAll();
    }

    public Page<City> findAllByPage(Pageable page) {
       return cityRepository.findAll(page);
    }
}
